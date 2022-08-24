package com.javacourse.se.lesson1;

public class Robot<T extends Head>{
    private Body body;
    private T head;
    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }
    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
/*public Robot(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }*/
}
