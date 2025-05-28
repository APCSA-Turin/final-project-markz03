package com.example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PongScore extends Rectangle{
    int player1Score, player2Score;
    private int gameWidth, gameHeight;


    public PongScore() {
        gameWidth = 1000;
        gameHeight = 555;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Quicksand", Font.PLAIN, 60));
        g.drawString(String.valueOf(player1Score), 410, 50);
        g.drawString(String.valueOf(player2Score), 560, 50);
    }

    public void increaseScore(Paddle pad) {
        if (pad.getID() == 1) {
            player1Score++;
        }
        else {
            player2Score++;
        }
    }
}

