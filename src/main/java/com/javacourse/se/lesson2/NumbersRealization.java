package com.javacourse.se.lesson2;

import java.util.Collection;

public class NumbersRealization <T extends Numbers>{
    private Collection collection;
    private T numbers;

    public NumbersRealization(T numbers) {
        this.numbers = numbers;
    }

    public T getNumbers() {
        return numbers;
    }

    public void setNumbers(T numbers) {
        this.numbers = numbers;
    }
}
