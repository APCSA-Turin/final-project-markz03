package com.example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Pong{
    private JFrame game;
    private PongPanel panel;

    public Pong() {
        initialize();
    }

    public void initialize() {
        game = new JFrame("Pong");
        panel = new PongPanel();

        game.add(panel);
        game.setSize(1000, 555);
        game.setResizable(false);
        game.setBackground(Color.black);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        game.pack();
        game.requestFocusInWindow();

    

        game.setVisible(true);
        
        

        
    }
}
