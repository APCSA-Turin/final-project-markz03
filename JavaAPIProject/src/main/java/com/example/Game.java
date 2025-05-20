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

public class Game {
    private int points;
    
    public Game(String gameName) {
        JFrame game = new JFrame(gameName);
        game.setSize(500, 500);
        if (gameName.equals("Whack-A-Mole")) {
            game.setLayout();
        }
        game.setResizable(false);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setLayout(null);
//        game.getContentPane().setBackground(new Color(53, 18, 105));
        
        points = 0;
        
    }
    
    public int getPoints() {
        return points;
    }
    
    public void gainPoints(int amt) {
        points += amt;
    }
}
