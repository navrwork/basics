package com.navr.dsa.leet;

import java.util.function.BinaryOperator;

public class Bitwise {
    public static void main(String[] args) {
        Bitwise obj = new Bitwise();

        //
        int[] arr = {1,2};
        obj.subarrayBitwiseORs(arr);
    }

    private void subarrayBitwiseORs(int[] arr) {
//        int orInt = arr[0]|arr[1];
//        System.out.println(Binary);
        BinaryOperator<Integer> binOp = (x1,x2) -> x1|x2;
        int orInt = binOp.apply(arr[0], arr[1]);
        System.out.printf("arr_1=%d, arr_2=%d, orInt=%d%n", arr[0], arr[1], orInt);

    }
}
