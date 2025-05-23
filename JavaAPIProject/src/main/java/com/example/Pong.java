package com.example;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Pong extends Game{
    private JFrame game;
    private JPanel panel;



    private int ballDiameter, paddleWidth, paddleHeight;
    private Thread gameThread;
    private Image image;
    private Graphics graphic;
    private Random random;
    private Paddle paddle1, paddle2;
    private Ball ball;

    public Pong() {
        initialize();
    }

    public void initialize() {
        game = new JFrame("Pong");
        panel = new JPanel();

        game.setSize(600, 750);
        game.setLayout(null);
        game.setResizable(false);
        game.setLocationRelativeTo(null);
        
        

        
    }
}
