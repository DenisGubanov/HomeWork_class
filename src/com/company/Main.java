package com.company;

public class Main {

    public static void main(String[] args) {
        Vector2D v1 = new Vector2D();
        Vector2D v2 = new Vector2D();
        v2.normalized();
        System.out.println(v2.vX+" "+v2.vY);
        System.out.println(Vector2D.count);
    }
}
