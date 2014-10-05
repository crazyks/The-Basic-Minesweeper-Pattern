package com.crazyks.matrixtrans;

import java.util.ArrayList;
import java.util.HashMap;

public final class DataPackage {
    
    public static enum PackageType {
        BASIC(8, "Basic"),
        SIMPLE_EQUATION_1(3, "Simple1"),
        SIMPLE_EQUATION_2(5, "Simple2"),
        COMPLEX_EQUATION_1(5, "Complex1"),
        COMPLEX_EQUATION_2(6, "Complex2"),
        COMPLEX_EQUATION_3(7, "Complex3");
        
        private final int maxNumber;
        private final String name;
        
        private PackageType(int maxNum, String name) {
            this.maxNumber = maxNum;
            this.name = name;
        }
        
        public final int getMaxNumber() {
            return this.maxNumber;
        }
        
        public final String getName() {
            return this.name;
        }
    }
    
    public final static class Data {
        private final String mName;
        private final int mNumber;
        private final ArrayList<MatrixTransformer> mMatrixList;
        private Object mTag = null;
        
        public Data(final String name, final int number, final MatrixTransformer... matrix) {
            this.mName = name;
            this.mNumber = number;
            mMatrixList = new ArrayList<MatrixTransformer>(matrix.length);
            for (MatrixTransformer m : matrix) {
                mMatrixList.add(m);
            }
        }
        
        public final String getName() {
            return this.mName;
        }
        
        public final int getNumber() {
            return this.mNumber;
        }
        
        public final ArrayList<MatrixTransformer> getMatrixList() {
            return this.mMatrixList;
        }
        
        public final void setTag(Object tag) {
            this.mTag = tag;
        }
        
        public final Object getTag() {
            return this.mTag;
        }
    }
    
    private final HashMap<PackageType, ArrayList<Data>> mDataPackage;
    private static DataPackage mInstance = null;
    
    private DataPackage() {
        mDataPackage = new HashMap<DataPackage.PackageType, ArrayList<Data>>();
        mDataPackage.put(PackageType.BASIC, new ArrayList<DataPackage.Data>());
        mDataPackage.put(PackageType.SIMPLE_EQUATION_1, new ArrayList<DataPackage.Data>());
        mDataPackage.put(PackageType.SIMPLE_EQUATION_2, new ArrayList<DataPackage.Data>());
        mDataPackage.put(PackageType.COMPLEX_EQUATION_1, new ArrayList<DataPackage.Data>());
        mDataPackage.put(PackageType.COMPLEX_EQUATION_2, new ArrayList<DataPackage.Data>());
        mDataPackage.put(PackageType.COMPLEX_EQUATION_3, new ArrayList<DataPackage.Data>());
    }
    
    protected static final DataPackage instance() {
        if (mInstance == null) {
            mInstance = new DataPackage();
        }
        return mInstance;
    }
    
    public final ArrayList<DataPackage.Data> getData(final PackageType type) {
        if (type == null) {
            return null;
        }
        return mDataPackage.get(type);
    }
    
}
