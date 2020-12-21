package com.k7;

public class ArrayProcessor <T>{
    private T[] arr;

    public ArrayProcessor(T[] arr) {
        this.arr = arr;
    }

    public void processor(ElementProcessor elementProcessor){
        for (int i = 0; i < arr.length ; i++) {
            elementProcessor.run(arr[i]);
        }
    }
}
