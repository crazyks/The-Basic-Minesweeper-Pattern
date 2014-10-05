package com.crazyks.matrixtrans;

import java.util.HashMap;

public final class MatrixTransformer {
    
    public static enum Rotate {
        ROTATE_0,
        ROTATE_90,
        ROTATE_180,
        ROTATE_270,
        ROTATE_0_MIRROR,
        ROTATE_90_MIRROR,
        ROTATE_180_MIRROR,
        ROTATE_270_MIRROR;
    }
    
    private final int[][] mOriginalMatrix;
    private final int column;
    private final int row;
    private final HashMap<Rotate, int[][]> mMatrixMap;
    
    private MatrixTransformer(final int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Nullpointer is not a valid parameter.");
        }
        row = matrix.length;
        if (row == 0) {
            throw new IllegalArgumentException("Empty matrix is not a valid parameter.");
        }
        column = matrix[0].length;
        if (column == 0) {
            throw new IllegalArgumentException("Empty matrix is not a valid parameter.");
        }
        mOriginalMatrix = matrix;
        mMatrixMap = new HashMap<Rotate, int[][]>();
        mMatrixMap.clear();
        mMatrixMap.put(Rotate.ROTATE_0, mOriginalMatrix);
    }
    
    public final static MatrixTransformer create(final int[][] matrix) {
        return new MatrixTransformer(matrix);
    }
    
    public final int[][] getMatrix(final Rotate rotate) {
        int[][] answer = mMatrixMap.get(rotate);
        if (answer == null) {
            answer = roateMatrix(rotate);
            mMatrixMap.put(rotate, answer);
        }
        return answer;
        
    }
    
    private final int[][] roateMatrix(final Rotate rotate) {
        int[][] answer = null;
        switch (rotate) {
        case ROTATE_0:
            answer = mOriginalMatrix;
            break;
        case ROTATE_90:
            answer = new int[column][row];
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    answer[column - 1 - i][j] = mOriginalMatrix[j][i];
                }
            }
            break;
        case ROTATE_180:
            answer = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    answer[row - 1 - i][column - 1 - j] = mOriginalMatrix[i][j];
                }
            }
            break;
        case ROTATE_270:
            answer = new int[column][row];
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    answer[i][row - 1 - j] = mOriginalMatrix[j][i];
                }
            }
            break;
        case ROTATE_0_MIRROR:
            answer = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    answer[i][column - 1 - j] = mOriginalMatrix[i][j];
                }
            }
            break;
        case ROTATE_90_MIRROR:
            answer = new int[column][row];
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    answer[column - 1 - i][row - 1 - j] = mOriginalMatrix[j][i];
                }
            }
            break;
        case ROTATE_180_MIRROR:
            answer = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    answer[row - 1 - i][j] = mOriginalMatrix[i][j];
                }
            }
            break;
        case ROTATE_270_MIRROR:
            answer = new int[column][row];
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    answer[i][j] = mOriginalMatrix[j][i];
                }
            }
            break;
        default:
            break;
        }
        return answer;
    }
}
