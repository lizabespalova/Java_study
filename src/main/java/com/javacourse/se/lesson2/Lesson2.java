package com.javacourse.se.lesson2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Lesson2 {
    public static void main(String[] args){
        ArrayList<Integer> topol = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
        Palindrom pol = new Palindrom(topol);
        ArrayList<Integer> toodd = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        Odd od = new Odd(toodd);
        ArrayList<Float> toprim = new ArrayList<>(Arrays.asList(2.3F, 1.2F, 3.03F));
        Prime prim = new Prime(toprim);
        NumbersRealization <Palindrom> reliz1 = new NumbersRealization<>(pol);
        NumbersRealization <Odd> reliz2 = new NumbersRealization<>(od);
        NumbersRealization <Prime> reliz3 = new NumbersRealization<>(prim);
        reliz1.getNumbers().show();
        reliz1.getNumbers().elements(topol);
        reliz2.getNumbers().show();
        reliz2.getNumbers().elements(toodd);
        reliz3.getNumbers().show();
        reliz3.getNumbers().elements(toprim);
    }
}
