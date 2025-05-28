package com.example;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Snake extends Game{
    private JFrame snakeGui;
    private SnakePanel snakePanel;

    public Snake() {
        snakeGui = new JFrame("Snake");
        snakePanel = new SnakePanel();


        snakeGui.add(snakePanel);
        snakeGui.setSize(500, 500);
        snakeGui.setResizable(false);
        snakeGui.setBackground(Color.black);
        snakeGui.setLocationRelativeTo(null);
        snakeGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        snakeGui.setVisible(true);
    }
}
