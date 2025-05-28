package com.example;

import java.awt.*;
import java.util.*;
import java.util.Random;

public class Ball extends Rectangle{
    int xSpeed, ySpeed;
    int speedScale = 2;

    public Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        int randX = (int) (Math.random() * 2);
        if (randX == 0) {
            randX--;
        }
        setXDirection(randX * speedScale);

        int randY = (int) (Math.random() * 2);
        if (randY == 0) {
            randY--;
        }
        setYDirection(randY * speedScale);
    }

    public void setXDirection(int randXDirection) {
        xSpeed = randXDirection;
    }
    
    public void setYDirection(int randYDirection) {
        ySpeed = randYDirection;
    }

    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }
}
