package com.example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PongPanel extends JPanel implements Runnable{
    private Thread gameThread;
    private Image image;
    private Graphics graphics;
    private Random random;
    private Paddle paddle1, paddle2;
    private Ball ball;

    public PongPanel() {
        newPaddles();
        newBall();

        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(new Dimension(1000, 555));


        gameThread = new Thread(this);

    }

    public void newBall() {

    }

    public void newPaddles() {
        paddle1 = new Paddle(0, 227, 25, 100, 1);
        paddle2 = new Paddle(975, 227, 25, 100, 2);
    }
    
    public void paint(Graphics g) {
        image = createImage(1000, 555);
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0,0, this);
    }

    public void draw(Graphics g) {
        paddle1.draw(g);
        paddle2.draw(g);
    }

    public void move() {
        paddle1.move();
    }

    public void checkCollision() {

    }

    public void run() {
        long lastTime = System.nanoTime();
        double amountTicks = 60.0;
        double ns = 1000000000 / amountTicks;
        double delta = 0;
        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                move();
                checkCollision();
                repaint();
                delta--;
            }
        }
    }

    public class AL extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            paddle1.keyPressed(e);
            paddle2.keyPressed(e);
        }
        
        public void keyReleased(KeyEvent e) {
            paddle1.keyReleased(e);
            paddle2.keyReleased(e);
        }
    }
}