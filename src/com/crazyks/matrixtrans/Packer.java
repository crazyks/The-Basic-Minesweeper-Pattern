package com.crazyks.matrixtrans;

import java.util.ArrayList;

import com.crazyks.matrixtrans.DataPackage.Data;

public final class Packer {
    private final static String NAME_BASIC = "Basic";
    private final static String NAME_SIMPLE_1 = "Simple 1";
    private final static String NAME_SIMPLE_2 = "Simple 2";
    private final static String NAME_COMPLEX_1 = "Complex 1";
    private final static String NAME_COMPLEX_2 = "Complex 2";
    private final static String NAME_COMPLEX_3 = "Complex 3";
    
    public final static DataPackage getDataPackage() {
        return DataPackage.instance();
    }
    
    public final static void makeAllPackage() {
        makeBasicPackage();
        makeSimple1Package();
        makeSimple2Package();
        makeComplex1Package();
        makeComplex2Package();
        makeComplex3Package();
    }
    
    public final static void makeBasicPackage() {
        final ArrayList<DataPackage.Data> basicData = getDataPackage().getData(DataPackage.PackageType.BASIC);
        basicData.clear();
        basicData.add(new Data(NAME_BASIC, 0, MatrixTransformer.create(FinalMatrix.CASE_BASIC_0_1)));
        basicData.add(new Data(NAME_BASIC, 1, MatrixTransformer.create(FinalMatrix.CASE_BASIC_1_1),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_1_2)));
        basicData.add(new Data(NAME_BASIC, 2, MatrixTransformer.create(FinalMatrix.CASE_BASIC_2_1),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_2_2),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_2_3),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_2_4),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_2_5),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_2_6)));
        basicData.add(new Data(NAME_BASIC, 3, MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_1),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_2),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_3),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_4),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_5),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_6),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_7),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_8),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_9),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_3_10)));
        basicData.add(new Data(NAME_BASIC, 4, MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_1),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_2),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_3),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_4),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_5),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_6),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_7),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_8),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_9),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_10),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_11),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_12),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_4_13)));
        basicData.add(new Data(NAME_BASIC, 5, MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_1),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_2),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_3),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_4),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_5),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_6),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_7),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_8),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_9),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_5_10)));
        basicData.add(new Data(NAME_BASIC, 6, MatrixTransformer.create(FinalMatrix.CASE_BASIC_6_1),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_6_2),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_6_3),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_6_4),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_6_5),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_6_6)));
        basicData.add(new Data(NAME_BASIC, 7, MatrixTransformer.create(FinalMatrix.CASE_BASIC_7_1),
                MatrixTransformer.create(FinalMatrix.CASE_BASIC_7_2)));
        basicData.add(new Data(NAME_BASIC, 8, MatrixTransformer.create(FinalMatrix.CASE_BASIC_8_1)));
    }
    
    public final static void makeSimple1Package() {
        final ArrayList<DataPackage.Data> simpleData = getDataPackage().getData(DataPackage.PackageType.SIMPLE_EQUATION_1);
        simpleData.clear();
        simpleData.add(new Data(NAME_SIMPLE_1, 0, MatrixTransformer.create(FinalMatrix.CASE_ZERO_0_1)));
        simpleData.add(new Data(NAME_SIMPLE_1, 1, MatrixTransformer.create(FinalMatrix.CASE_ZERO_1_1),
                MatrixTransformer.create(FinalMatrix.CASE_ZERO_1_2)));
        simpleData.add(new Data(NAME_SIMPLE_1, 2, MatrixTransformer.create(FinalMatrix.CASE_ZERO_2_1),
                MatrixTransformer.create(FinalMatrix.CASE_ZERO_2_2)));
        simpleData.add(new Data(NAME_SIMPLE_1, 3, MatrixTransformer.create(FinalMatrix.CASE_ZERO_3_1)));
    }
    
    public final static void makeSimple2Package() {
        final ArrayList<DataPackage.Data> simpleData = getDataPackage().getData(DataPackage.PackageType.SIMPLE_EQUATION_2);
        simpleData.clear();
        simpleData.add(new Data(NAME_SIMPLE_2, 0, MatrixTransformer.create(FinalMatrix.CASE_ONE_0_1)));
        simpleData.add(new Data(NAME_SIMPLE_2, 1, MatrixTransformer.create(FinalMatrix.CASE_ONE_1_1),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_1_2),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_1_3)));
        simpleData.add(new Data(NAME_SIMPLE_2, 2, MatrixTransformer.create(FinalMatrix.CASE_ONE_2_1),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_2_2),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_2_3),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_2_4),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_2_5),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_2_6)));
        simpleData.add(new Data(NAME_SIMPLE_2, 3, MatrixTransformer.create(FinalMatrix.CASE_ONE_3_1),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_3_2),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_3_3),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_3_4),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_3_5),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_3_6)));
        simpleData.add(new Data(NAME_SIMPLE_2, 4, MatrixTransformer.create(FinalMatrix.CASE_ONE_4_1),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_4_2),
                MatrixTransformer.create(FinalMatrix.CASE_ONE_4_3)));
        simpleData.add(new Data(NAME_SIMPLE_2, 5, MatrixTransformer.create(FinalMatrix.CASE_ONE_5_1)));
    }
    
    public final static void makeComplex1Package() {
        final ArrayList<DataPackage.Data> complexData = getDataPackage().getData(DataPackage.PackageType.COMPLEX_EQUATION_1);
        complexData.clear();
        complexData.add(new Data(NAME_COMPLEX_1, 0, MatrixTransformer.create(FinalMatrix.CASE_TWO_0_1)));
        complexData.add(new Data(NAME_COMPLEX_1, 1, MatrixTransformer.create(FinalMatrix.CASE_TWO_1_1),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_1_2),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_1_3)));
        complexData.add(new Data(NAME_COMPLEX_1, 2, MatrixTransformer.create(FinalMatrix.CASE_TWO_2_1),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_2_2),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_2_3),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_2_4),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_2_5),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_2_6)));
        complexData.add(new Data(NAME_COMPLEX_1, 3, MatrixTransformer.create(FinalMatrix.CASE_TWO_3_1),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_3_2),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_3_3),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_3_4),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_3_5),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_3_6)));
        complexData.add(new Data(NAME_COMPLEX_1, 4, MatrixTransformer.create(FinalMatrix.CASE_TWO_4_1),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_4_2),
                MatrixTransformer.create(FinalMatrix.CASE_TWO_4_3)));
        complexData.add(new Data(NAME_COMPLEX_1, 5, MatrixTransformer.create(FinalMatrix.CASE_TWO_5_1)));
    }
    
    public final static void makeComplex2Package() {
        final ArrayList<DataPackage.Data> complexData = getDataPackage().getData(DataPackage.PackageType.COMPLEX_EQUATION_2);
        complexData.clear();
        complexData.add(new Data(NAME_COMPLEX_2, 0, MatrixTransformer.create(FinalMatrix.CASE_THREE_0_1)));
        complexData.add(new Data(NAME_COMPLEX_2, 1, MatrixTransformer.create(FinalMatrix.CASE_THREE_1_1),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_1_2),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_1_3),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_1_4),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_1_5),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_1_6)));
        complexData.add(new Data(NAME_COMPLEX_2, 2, MatrixTransformer.create(FinalMatrix.CASE_THREE_2_1),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_2),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_3),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_4),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_5),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_6),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_7),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_8),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_9),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_10),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_11),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_12),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_13),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_14),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_2_15)));
        complexData.add(new Data(NAME_COMPLEX_2, 3, MatrixTransformer.create(FinalMatrix.CASE_THREE_3_1),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_2),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_3),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_4),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_5),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_6),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_7),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_8),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_9),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_10),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_11),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_12),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_13),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_14),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_15),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_16),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_17),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_18),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_19),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_3_20)));
        complexData.add(new Data(NAME_COMPLEX_2, 4, MatrixTransformer.create(FinalMatrix.CASE_THREE_4_1),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_2),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_3),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_4),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_5),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_6),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_7),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_8),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_9),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_10),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_11),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_12),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_13),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_14),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_4_15)));
        complexData.add(new Data(NAME_COMPLEX_2, 5, MatrixTransformer.create(FinalMatrix.CASE_THREE_5_1),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_5_2),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_5_3),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_5_4),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_5_5),
                MatrixTransformer.create(FinalMatrix.CASE_THREE_5_6)));
        complexData.add(new Data(NAME_COMPLEX_2, 6, MatrixTransformer.create(FinalMatrix.CASE_THREE_6_1)));
    }
    
    public final static void makeComplex3Package() {
        final ArrayList<DataPackage.Data> complexData = getDataPackage().getData(DataPackage.PackageType.COMPLEX_EQUATION_3);
        complexData.clear();
        complexData.add(new Data(NAME_COMPLEX_3, 0, MatrixTransformer.create(FinalMatrix.CASE_FOUR_0_1)));
        complexData.add(new Data(NAME_COMPLEX_3, 1, MatrixTransformer.create(FinalMatrix.CASE_FOUR_1_1),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_1_2),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_1_3),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_1_4)));
        complexData.add(new Data(NAME_COMPLEX_3, 2, MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_1),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_2),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_3),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_4),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_5),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_6),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_7),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_8),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_9),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_10),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_11),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_2_12)));
        complexData.add(new Data(NAME_COMPLEX_3, 3, MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_1),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_2),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_3),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_4),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_5),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_6),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_7),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_8),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_9),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_10),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_11),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_12),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_13),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_14),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_15),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_16),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_17),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_18),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_19),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_3_20)));
        complexData.add(new Data(NAME_COMPLEX_3, 4, MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_1),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_2),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_3),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_4),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_5),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_6),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_7),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_8),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_9),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_10),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_11),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_12),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_13),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_14),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_15),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_16),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_17),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_18),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_19),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_4_20)));
        complexData.add(new Data(NAME_COMPLEX_3, 5, MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_1),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_2),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_3),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_4),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_5),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_6),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_7),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_8),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_9),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_10),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_11),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_5_12)));
        complexData.add(new Data(NAME_COMPLEX_3, 6, MatrixTransformer.create(FinalMatrix.CASE_FOUR_6_1),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_6_2),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_6_3),
                MatrixTransformer.create(FinalMatrix.CASE_FOUR_6_4)));
        complexData.add(new Data(NAME_COMPLEX_3, 7, MatrixTransformer.create(FinalMatrix.CASE_FOUR_7_1)));
    }
}
