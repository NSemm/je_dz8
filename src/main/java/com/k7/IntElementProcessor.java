package com.k7;

public class IntElementProcessor<T> implements ElementProcessor<T> {
    @Override
    public void run(T in) {
        System.out.println(in);
    }
}
