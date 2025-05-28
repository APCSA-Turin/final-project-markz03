package com.example;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SelectionGui {
    private JFrame selectionGui;
    private JPanel boardPanel;
    private JButton[] gameIcons;
    private ImageIcon wakamo, pong, game3;


    public SelectionGui() {
        initialize();
    }

    public void initialize() {
        selectionGui = new JFrame("Select A Game");
        boardPanel = new JPanel();
        gameIcons = new JButton[3];


        
        selectionGui.setSize(600, 600);
        selectionGui.setResizable(false);
        selectionGui.setLocationRelativeTo(null);
        selectionGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        selectionGui.setLayout(new GridLayout(1,3));
        selectionGui.getContentPane().setBackground(new Color(53, 18, 105));

        Image wakamoImg = new ImageIcon(getClass().getResource("./selectWaka.png")).getImage();
        wakamo = new ImageIcon(wakamoImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Image pongImg = new ImageIcon(getClass().getResource("./pong.png")).getImage();
        pong = new ImageIcon(pongImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Image game3IMG = new ImageIcon(getClass().getResource("./mole.png")).getImage();
        game3 = new ImageIcon(game3IMG.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        
        for (int i = 0; i < 3; i++) {
            JButton icon = new JButton();
            gameIcons[i] = icon;
            icon.setFocusable(false);
            boardPanel.add(icon);
            if (i == 0) {
                icon.setIcon(wakamo);
            }
            else if (i == 1) {
                icon.setIcon(pong);
            }
            else if (i == 2) {
                icon.setIcon(game3);
            }

            icon.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton icon = (JButton) e.getSource();
                    if (icon.getIcon() == wakamo) {
                        Wakamo waka = new Wakamo();
                    }
                    else if (icon.getIcon() == pong) {
                        Pong pongGame = new Pong();
                    }
                    else if (icon.getIcon() == game3) {
                        Wakamo waka = new Wakamo();
                    }
                    // if (icon == ) {
                        
                    // }
                    
                }
            });

        }
        selectionGui.add(boardPanel);

        selectionGui.setVisible(true);
    }
}
