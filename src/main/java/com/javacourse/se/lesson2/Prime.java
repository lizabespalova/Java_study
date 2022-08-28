package com.javacourse.se.lesson2;

import java.util.Collection;

public class Prime extends Numbers {
    private Collection<Float> collection;
    public Prime(Collection collection) {
        this.collection = collection;
    }

    public Collection<Float> getCollection() {
        return collection;
    }

    public void setCollection(Collection<Float> collection) {
        this.collection = collection;
    }

    public void show(){
    System.out.println("Amount of prime elements:");
   }

    @Override
    public void elements(Collection collection) {
        super.elements(collection);
    }
}
