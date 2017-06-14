package com.lintcode.simple;

/**
 * Created by eligshn on 2017/6/14.
 */
public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int x, int y) {
        this.height = x;
        this.width = y;
    }
    public int getArea() {
        return width * height;
    }
}
