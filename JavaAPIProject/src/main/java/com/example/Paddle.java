package com.example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{
    private int id;
    private int yVelo;
    private int speed;

    public Paddle(int x, int y, int paddleWidth, int paddleHeight, int id) {
        super(x, y, paddleWidth, paddleHeight);
        this.id = id;
        speed = 10;
    }

    public void keyPressed(KeyEvent e) {
        switch(id) {
            case 1: 
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(-speed);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(speed);
                move();
            }
            break;

            case 2:
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(-speed);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(speed);
                move();
            }
            break;
        }
    }
    
    public void keyReleased(KeyEvent e) {
        switch(id) {
            case 1: 
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(0);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(0);
                move();
            }
            break;

            case 2:
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(0);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(0);
                move();
            }
            break;
        }
    }

    public void setYDirection(int yDirection) {
        yVelo = yDirection;
    }

    public void move() {
        y+=yVelo;
        System.out.println(y);
    }

    public void draw(Graphics g) {
        if (id == 1) {
            g.setColor(Color.blue);
        }
        else {
            g.setColor(Color.red);
        }
        g.fillRect(x, y, width, height);
    }
}
