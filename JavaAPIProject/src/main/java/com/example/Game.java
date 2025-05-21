package com.example;
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
    
    public Game() {
        points = 0;
        
    }
    
    public int getPoints() {
        return points;
    }
    
    public void gainPoints(int amt) {
        points += amt;
    }


}
