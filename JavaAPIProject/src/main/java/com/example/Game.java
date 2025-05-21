package com.example;
import org.json.JSONObject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Game() {
    private int points;
    
    public Game(String gameName, int length, int height) {
        JFrame game = new JFrame(gameName);
        game.setSize(length, height);
        if (gameName.equals("Whack-A-Mole")) {
            game.setLayout(new BorderLayout());
        }
        game.setResizable(false);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setLayout(null);
        //game.getContentPane().setBackground(new Color(53, 18, 105));
        points = 0;
        game.setVisible(true);
        
    }
    
    public int getPoints() {
        return points;
    }
    
    public void gainPoints(int amt) {
        points += amt;
    }
}
