package com.crazyks.sum;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.crazyks.matrixtrans.DataPackage;
import com.crazyks.matrixtrans.MatrixTransformer;
import com.crazyks.matrixtrans.Packer;

public class SUM extends Activity {

    class CellAdapter extends BaseAdapter {

        private int[] res = null;

        public CellAdapter(int[][] cells) {
            super();
            setCells(cells);
        }
        
        public void setCells(int[][] cells) {
            if (cells == null) {
                res = new int[0];
            } else {
                int row = cells.length;
                int column = cells[0].length;
                res = new int[row * column];
                for (int i = 0; i < row; i++) {
                    System.arraycopy(cells[i], 0, res, i * column, column);
                }
            }
        }

        @Override
        public int getCount() {
            return res.length;
        }

        @Override
        public Object getItem(int position) {
            return res[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView view = null;
            if (!(convertView instanceof ImageView)) {
                view = new ImageView(SUM.this);
            } else {
                view = (ImageView) convertView;
            }
            view.setImageResource(res[position]);
            convertView = view;
            return convertView;
        }

    }
    
    private GridView mGrid;
    private CellAdapter mCellAdapter;
    private float scale = 1.0f;
    private final int BLOCK_SIZE = 32;
    private final int COLUMN_SIZE = 3;
    
    private Button mPrevType;
    private Button mNextType;
    private Button mPrevNum;
    private Button mNextNum;
    private Button mPrevCase;
    private Button mNextCase;
    private Button mPrevDir;
    private Button mNextDir;
    
    private TextView mType;
    private TextView mNum;
    private TextView mCase;
    private TextView mDir;
    
    private final android.view.View.OnClickListener mOnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (v == mPrevType) {
                prevType();
            } else if (v == mNextType) {
                nextType();
            } else if (v == mPrevNum) {
                prevNumber();
            } else if (v == mNextNum) {
                nextNumber();
            } else if (v == mPrevCase) {
                prevCase();
            } else if (v == mNextCase) {
                nextCase();
            } else if (v == mPrevDir) {
                prevDirection();
            } else if (v == mNextDir) {
                nextDirection();
            }
        }
    };
    
    private final DataPackage.PackageType[] PACKAGETYPE = {
            DataPackage.PackageType.BASIC,
            DataPackage.PackageType.SIMPLE_EQUATION_1,
            DataPackage.PackageType.SIMPLE_EQUATION_2,
            DataPackage.PackageType.COMPLEX_EQUATION_1,
            DataPackage.PackageType.COMPLEX_EQUATION_2,
            DataPackage.PackageType.COMPLEX_EQUATION_3
    };
    private final MatrixTransformer.Rotate[] DIRECTION = {
            MatrixTransformer.Rotate.ROTATE_0,
            MatrixTransformer.Rotate.ROTATE_90,
            MatrixTransformer.Rotate.ROTATE_180,
            MatrixTransformer.Rotate.ROTATE_270,
            MatrixTransformer.Rotate.ROTATE_0_MIRROR,
            MatrixTransformer.Rotate.ROTATE_90_MIRROR,
            MatrixTransformer.Rotate.ROTATE_180_MIRROR,
            MatrixTransformer.Rotate.ROTATE_270_MIRROR
    };
    
    private DataPackage mDataPackage = null;
    private ArrayList<DataPackage.Data> mCurrentData = null;
    private ArrayList<MatrixTransformer> mCurrentMatrixList = null;
    private MatrixTransformer mCurrentMatrix = null;
    private int mCurrentPackageTypeIndex = 0;
    private int mCurrentCenterNumberIndex = 0;
    private int mCurrentCaseIndex = 0;
    private int mCurrentDirectionIndex = 0;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initViews();
        initData();
        if (savedInstanceState != null) {
            mCurrentPackageTypeIndex = savedInstanceState.getInt("TypeIndex", 0);
            mCurrentCenterNumberIndex = savedInstanceState.getInt("NumberIndex", 0);
            mCurrentCaseIndex = savedInstanceState.getInt("CaseIndex", 0);
            mCurrentDirectionIndex = savedInstanceState.getInt("DirectionIndex", 0);
        } else {
            mCurrentPackageTypeIndex = 0;
            mCurrentCenterNumberIndex = 0;
            mCurrentCaseIndex = 0;
            mCurrentDirectionIndex = 0;
        }
        reloadGrid(0);
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("TypeIndex", mCurrentPackageTypeIndex);
        outState.putInt("NumberIndex", mCurrentCenterNumberIndex);
        outState.putInt("CaseIndex", mCurrentCaseIndex);
        outState.putInt("DirectionIndex", mCurrentDirectionIndex);
    }

    private final void initViews() {
        scale = 1.0f * getApplicationContext().getResources().getDisplayMetrics().densityDpi / 160;
        mGrid = (GridView) findViewById(R.id.grid);
        mCellAdapter = new CellAdapter(null);
        mGrid.setAdapter(mCellAdapter);
        mGrid.setNumColumns(COLUMN_SIZE);
        RelativeLayout.LayoutParams rl = new RelativeLayout.LayoutParams(
                (int) (COLUMN_SIZE * BLOCK_SIZE * scale),
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        rl.addRule(RelativeLayout.CENTER_IN_PARENT);
        mGrid.setLayoutParams(rl);
        mGrid.requestLayout();
        
        mPrevType = (Button) findViewById(R.id.btn_type_prev);
        mNextType = (Button) findViewById(R.id.btn_type_next);
        mPrevNum = (Button) findViewById(R.id.btn_num_prev);
        mNextNum = (Button) findViewById(R.id.btn_num_next);
        mPrevCase = (Button) findViewById(R.id.btn_case_prev);
        mNextCase = (Button) findViewById(R.id.btn_case_next);
        mPrevDir = (Button) findViewById(R.id.btn_dir_prev);
        mNextDir = (Button) findViewById(R.id.btn_dir_next);
        mPrevType.setOnClickListener(mOnClickListener);
        mNextType.setOnClickListener(mOnClickListener);
        mPrevNum.setOnClickListener(mOnClickListener);
        mNextNum.setOnClickListener(mOnClickListener);
        mPrevCase.setOnClickListener(mOnClickListener);
        mNextCase.setOnClickListener(mOnClickListener);
        mPrevDir.setOnClickListener(mOnClickListener);
        mNextDir.setOnClickListener(mOnClickListener);
        
        mType = (TextView) findViewById(R.id.text_type);
        mNum= (TextView) findViewById(R.id.text_num);
        mCase = (TextView) findViewById(R.id.text_case);
        mDir = (TextView) findViewById(R.id.text_dir);
    }
    
    private final void initData() {
        Packer.makeAllPackage();
        mDataPackage = Packer.getDataPackage();
    }
    
    private final void reloadGrid(int level) {
        switch (level) {
        case 0:
            mCurrentData = mDataPackage.getData(PACKAGETYPE[mCurrentPackageTypeIndex]);
            mType.setText(PACKAGETYPE[mCurrentPackageTypeIndex].getName());
        case 1:
            mCurrentMatrixList = mCurrentData.get(mCurrentCenterNumberIndex).getMatrixList();
            mNum.setText(String.valueOf(mCurrentCenterNumberIndex));
        case 2:
            mCurrentMatrix = mCurrentMatrixList.get(mCurrentCaseIndex);
            mCase.setText(String.valueOf(mCurrentCaseIndex + 1));
        case 3:
            int[][] data = mCurrentMatrix.getMatrix(DIRECTION[mCurrentDirectionIndex]);
            mDir.setText(String.valueOf(mCurrentDirectionIndex + 1));
            mCellAdapter.setCells(data);
            mCellAdapter.notifyDataSetChanged();
        default:
            break;
        }
    }
    
    private final void nextType() {
        mCurrentPackageTypeIndex++;
        if (mCurrentPackageTypeIndex >= PACKAGETYPE.length || mCurrentPackageTypeIndex < 0) {
            mCurrentPackageTypeIndex = 0;
        }
        mCurrentCenterNumberIndex = 0;
        mCurrentCaseIndex = 0;
        mCurrentDirectionIndex = 0;
        reloadGrid(0);
    }
    
    private final void prevType() {
        mCurrentPackageTypeIndex--;
        if (mCurrentPackageTypeIndex >= PACKAGETYPE.length || mCurrentPackageTypeIndex < 0) {
            mCurrentPackageTypeIndex = PACKAGETYPE.length - 1;
        }
        mCurrentCenterNumberIndex = 0;
        mCurrentCaseIndex = 0;
        mCurrentDirectionIndex = 0;
        reloadGrid(0);
    }
    
    private final void nextNumber() {
        mCurrentCenterNumberIndex++;
        if (mCurrentCenterNumberIndex > PACKAGETYPE[mCurrentPackageTypeIndex].getMaxNumber() || mCurrentCenterNumberIndex < 0) {
            mCurrentCenterNumberIndex = 0;
        }
        mCurrentCaseIndex = 0;
        mCurrentDirectionIndex = 0;
        reloadGrid(1);
    }
    
    private final void prevNumber() {
        mCurrentCenterNumberIndex--;
        if (mCurrentCenterNumberIndex > PACKAGETYPE[mCurrentPackageTypeIndex].getMaxNumber() || mCurrentCenterNumberIndex < 0) {
            mCurrentCenterNumberIndex = PACKAGETYPE[mCurrentPackageTypeIndex].getMaxNumber();
        }
        mCurrentCaseIndex = 0;
        mCurrentDirectionIndex = 0;
        reloadGrid(1);
    }
    
    private final void nextCase() {
        mCurrentCaseIndex++;
        if (mCurrentCaseIndex >= mCurrentMatrixList.size() || mCurrentCaseIndex < 0) {
            mCurrentCaseIndex = 0;
        }
        mCurrentDirectionIndex = 0;
        reloadGrid(2);
    }
    
    private final void prevCase() {
        mCurrentCaseIndex--;
        if (mCurrentCaseIndex >= mCurrentMatrixList.size() || mCurrentCaseIndex < 0) {
            mCurrentCaseIndex = mCurrentMatrixList.size() - 1;
        }
        mCurrentDirectionIndex = 0;
        reloadGrid(2);
    }
    
    private final void nextDirection() {
        mCurrentDirectionIndex++;
        if (mCurrentDirectionIndex >= DIRECTION.length || mCurrentDirectionIndex < 0) {
            mCurrentDirectionIndex = 0;
        }
        reloadGrid(3);
    }
    
    private final void prevDirection() {
        mCurrentDirectionIndex--;
        if (mCurrentDirectionIndex >= DIRECTION.length || mCurrentDirectionIndex < 0) {
            mCurrentDirectionIndex = DIRECTION.length - 1;
        }
        reloadGrid(3);
    }
    
}