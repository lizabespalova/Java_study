package com.javacourse.se.lesson2;

import java.util.Arrays;
import java.util.Collection;

public class Odd extends Numbers{
    private Collection<Integer> collection;
    public Odd(Collection collection) {
        this.collection = collection;
    }

    public Collection<Integer> getCollection() {
        return collection;
    }

    public void setCollection(Collection<Integer> collection) {
        this.collection = collection;
    }
    public void show(){
        System.out.println("Amount of odd elements:");
    }
    @Override
    public void elements(Collection collection) {
        super.elements(collection);
    }
}
