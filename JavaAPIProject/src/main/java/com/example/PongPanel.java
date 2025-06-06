package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PongPanel extends JPanel implements Runnable{
    private Thread gameThread;
    private Image image;
    private Graphics graphics;
    private Paddle paddle1, paddle2;
    private Ball ball;
    private PongScore score;

    public PongPanel() {
        newPaddles();
        newBall();
        score = new PongScore();

        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(new Dimension(1000, 555));

        gameThread = new Thread(this);
        gameThread.start();

    }

    public void newBall() {
        ball = new Ball(500, 267, 30, 30);
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
        ball.draw(g);
        score.draw(g);
        g.drawLine(500, 0, 500, 555);
    }

    // Makes movement smoother
    public void move() {
        paddle1.move();
        paddle2.move();
        ball.move();
    }

    // Prevents paddle from going out of bounds (window)
    public void checkCollision() {
        if (paddle1.y <= 0) {
            paddle1.y = 0;
        }
        if (paddle1.y >= 455) {
            paddle1.y = 455;
        }
        if (paddle2.y <= 0) {
            paddle2.y = 0;
        }
        if (paddle2.y >= 455) {
            paddle2.y = 455;
        }

        if (ball.y <= 0 || ball.y >= 525) {
            ball.setYDirection(-ball.ySpeed);
        }

        if (ball.intersects(paddle1) || ball.intersects(paddle2)) {
            ball.xSpeed *= -1;
            if (ball.xSpeed < 0) {
                ball.xSpeed--;
            }
            else {
                ball.xSpeed++;
            }

            if (ball.intersects(paddle1)) {
                score.increaseScore(paddle1);
                ball.x = paddle1.x + paddle1.width + 1;
            }
            else if (ball.intersects(paddle2)) {
                score.increaseScore(paddle2);
                ball.x = paddle2.x - ball.width - 1;;
            }
            
        }

        if (ball.x >= 970 || ball.x <= 0) {
            this.setEnabled(false);
        }
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