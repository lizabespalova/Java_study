package com.javacourse.se.lesson2;

import java.util.Collection;

public class Palindrom extends Numbers{
   private Collection<Integer> collection;

    public Palindrom(Collection collection) {
        this.collection = collection;
    }

    public Collection<Integer> getCollection() {
        return collection;
    }

    public void setCollection(Collection<Integer> collection) {
        this.collection = collection;
    }

    public void show(){
    System.out.println("Amount of palidrom elements:");
   }
    @Override
    public void elements(Collection collection) {
        super.elements(collection);
    }
}
