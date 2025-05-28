package com.example;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class SnakePanel extends JPanel implements ActionListener{
    private int screenWidth = 500, screenHeight = 500;
    private int snakeSize, unitSize = 50, delay, applesEaten, appleX, appleY;
    private boolean run = false;
    Timer timer;
    Random random;
    int[] x = new int[(screenWidth * screenHeight) / 50];
    int[] y = new int[(screenWidth * screenHeight) / 50];


    public SnakePanel() {
        random = new Random();

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new KA());
        start();
    }

    public void start() {
        newApple();
        run = true;
        timer = new Timer(delay, this);
        timer.start();

    }

    public void newApple() {
        appleX = random.nextInt((screenWidth/unitSize));
        appleY = random.nextInt((screenHeight/unitSize));

    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.drawLine(i * unitSize, 0, i*unitSize, 500);
            g.drawLine(0, i*unitSize, 0, i*unitSize);
        }
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, unitSize, unitSize);
    }

    public void move() {

    }

    public void touchApple() {
        
    }

    public void checkCollision() {

    }

    public void gameOver() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public class KA extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
        
        public void keyReleased(KeyEvent e) {

        }
    }
}
