package com.company;

import java.util.Locale;

public class Vector2D {
    double vX;
    double vY;
    static int count = 0;
    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }
    public Vector2D(double X, double Y) {
        this.vX = X;
        this.vY = Y;
        count++;
    }
    public Vector2D(Vector2D copy) {
        this.vX = copy.vX;
        this.vY = copy.vY;
        count++;
    }
    public void print() {
        System.out.println("("+String.format(Locale.US, "%.2f", vX)+", "+String.format(Locale.US, "%.2f", vY)+")");
    }

    public double length() {
        return Math.sqrt(this.vX*this.vX+this.vY*this.vY);
    }
    public void add(Vector2D v) {
        this.vX+=v.vX;
        this.vY+=v.vY;
    }
    public void sub(Vector2D v) {
        this.vX-=v.vX;
        this.vY-=v.vY;
    }
    public void scale(double scaleFactor) {
        this.vX*=scaleFactor;
        this.vY*=scaleFactor;
    }
    public void normalized() {
        double len = Math.sqrt(this.vX*this.vX+this.vY*this.vY);
        this.vX = this.vX / len;
        this.vY = this.vY / len;
    }
    public double dotProduct(Vector2D v) {
        return this.vX*v.vX+this.vY*v.vY;
    }
}
