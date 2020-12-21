package com.k7;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 5, 9, 0};
        String[] strArr = {
                "First",
                "Second",
                "Third",
                "Forth"
        };
        ElementProcessor<Integer> intElemProc = new IntElementProcessor<>();
        ElementProcessor<String> strElemProc = new IntElementProcessor<>();
        ArrayProcessor<Integer> intArrProc = new ArrayProcessor<>(intArr);
        ArrayProcessor<String> strArrProc = new ArrayProcessor<>(strArr);
        intArrProc.processor(intElemProc);
        strArrProc.processor(strElemProc);
    }
}
