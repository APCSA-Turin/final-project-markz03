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
    private ImageIcon wakamoIcon, pongIcon, snakeIcon;


    public SelectionGui() {
        initialize();
    }

    public void initialize() {
        selectionGui = new JFrame("Select A Game");
        boardPanel = new JPanel();
        gameIcons = new JButton[3];
        boardPanel.setBackground(new Color(53, 18, 105));


        
        selectionGui.setSize(600, 600);
        selectionGui.setResizable(false);
        selectionGui.setLocationRelativeTo(null);
        selectionGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        selectionGui.setLayout(new GridLayout(1,3));
        selectionGui.getContentPane().setBackground(new Color(53, 18, 105));

        Image wakamoImg = new ImageIcon(getClass().getResource("./selectWaka.png")).getImage();
        wakamoIcon = new ImageIcon(wakamoImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Image pongImg = new ImageIcon(getClass().getResource("./pong.png")).getImage();
        pongIcon = new ImageIcon(pongImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Image snakeImg = new ImageIcon(getClass().getResource("./snake.png")).getImage();
        snakeIcon = new ImageIcon(snakeImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        
        for (int i = 0; i < 3; i++) {
            JButton icon = new JButton();
            gameIcons[i] = icon;
            icon.setFocusable(false);
            boardPanel.add(icon);
            if (i == 0) {
                icon.setIcon(wakamoIcon);
            }
            else if (i == 1) {
                icon.setIcon(pongIcon);
            }
            else if (i == 2) {
                icon.setIcon(snakeIcon);
            }

            icon.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton icon = (JButton) e.getSource();
                    if (icon.getIcon() == wakamoIcon) {
                        Wakamo waka = new Wakamo();
                    }
                    else if (icon.getIcon() == pongIcon) {
                        Pong pongGame = new Pong();
                    }
                    else if (icon.getIcon() == snakeIcon) {
                        Snake snake = new Snake();
                    }
                    
                }
            });

        }
        selectionGui.add(boardPanel);

        selectionGui.setVisible(true);
    }
}
