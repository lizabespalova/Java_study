package com.javacourse.se.lesson1;

public class Lesson1 {
    public static void main(String[] args){
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Robot<SmallHead> robot = new Robot<>(body, smallHead);
        Robot<BigHead> robot1 = new Robot<>(body, bigHead);
        Robot <MediumHead> robot2 = new Robot<>(body, mediumHead);
    }
}
