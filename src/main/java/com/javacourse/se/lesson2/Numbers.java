package com.javacourse.se.lesson2;

import java.util.Collection;

class Numbers<T> {
    public void elements(Collection <T> collection){
        int amount = 0;
        for (T i: collection) {
            amount++;
        }
        System.out.println(amount);
    }
}
