package com.example;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class SnakePanel extends JPanel implements ActionListener{
    private int screenWidth = 1000, screenHeight = 1000;
    private int snakeSize = 4, unitSize = 50, delay = 100, applesEaten, appleX, appleY, gameUnits = (screenHeight * screenWidth) / unitSize;
    private boolean run = false;
    private String direction = "R";
    Timer timer;
    Random random;
    int[] x = new int[gameUnits];
    int[] y = new int[gameUnits];


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
        applesEaten = 0;
        run = true;
        timer = new Timer(delay, this);
        timer.start();

    }

    public void newApple() {
        appleX = random.nextInt((int) (screenWidth/unitSize))*unitSize;
        appleY = random.nextInt((int) (screenHeight/unitSize))*unitSize;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (run) {
            for (int i = 0; i < screenHeight / unitSize; i++) {
                g.drawLine(i * unitSize, 0, i*unitSize, screenHeight);
                g.drawLine(0, i*unitSize, screenWidth, i*unitSize);
            }
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, unitSize, unitSize);

            for (int i = 0; i < snakeSize; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                }
                else {
                    g.setColor(new Color(45, 180, 0));
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                }
            }

            g.setColor(Color.MAGENTA);
            g.setFont(new Font("Quicksand", Font.BOLD, 75));
            FontMetrics met = getFontMetrics(g.getFont());
            g.drawString("Score: " + applesEaten, (screenWidth-met.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
        }
        else {
            gameOver(g);
        }
    }

    public void move() {
        for (int i = snakeSize; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch(direction) {
            case "U": 
                y[0] = y[0] - unitSize;
                break;
            case "D": 
                y[0] = y[0] + unitSize;
                break;
            case "L": 
                x[0] = x[0] - unitSize;
                break;
            case "R": 
                x[0] = x[0] + unitSize;
                break;
            
        }
    }

    public void touchApple() {
        if (x[0] == appleX && y[0] == appleY) {
            snakeSize++;
            newApple();
            applesEaten++;
        }
    }

    public void checkCollision() {
        for (int i = snakeSize; i > 0; i--) {
            // check to see if head collide with body
            if ((x[0] == x[i]) && (y[0] == y[i])) { 
                run = false;
            }
        }

        if (x[0] < 0 || x[0] > screenWidth) {
            run = false;
        }
        if (y[0] < 0 || y[0] > screenHeight) {
            run = false;
        }

        if (!run) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Quicksand", Font.BOLD, 75));

        FontMetrics met = getFontMetrics(g.getFont());
        g.drawString("Score: " + applesEaten, (screenWidth-met.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
        g.drawString("Game Over", (screenWidth-met.stringWidth("Game Over")) / 2, screenHeight / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (run) {
            move();
            touchApple();
            checkCollision();
        }
        repaint();
    }

    public class KA extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (!(direction.equals("R"))) {
                        direction = "L";
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (!(direction.equals("L"))) {
                        direction = "R";
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (!(direction.equals("D"))) {
                        direction = "U";
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (!(direction.equals("U"))) {
                        direction = "D";
                    }
                    break;

                case KeyEvent.VK_A:
                    if (!(direction.equals("R"))) {
                        direction = "L";
                    }
                    break;
                case KeyEvent.VK_D:
                    if (!(direction.equals("L"))) {
                        direction = "R";
                    }
                    break;
                case KeyEvent.VK_W:
                    if (!(direction.equals("D"))) {
                        direction = "U";
                    }
                    break;
                case KeyEvent.VK_S:
                    if (!(direction.equals("U"))) {
                        direction = "D";
                    }
                    break;

            }
        }
        
    }
}
