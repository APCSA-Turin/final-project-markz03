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
<<<<<<< HEAD
    private ImageIcon wakamo, pong, game3;
=======
    private ImageIcon wakamo, Pong, game3;
>>>>>>> 5ff819970bcce5ce468cad1ac05203bb88e062c2


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
<<<<<<< HEAD
        Image pongImg = new ImageIcon(getClass().getResource("./pong.png")).getImage();
        pong = new ImageIcon(pongImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
=======
        Image pongImg = new ImageIcon(getClass().getResource("./hole.png")).getImage();
        Pong = new ImageIcon(pongImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
>>>>>>> 5ff819970bcce5ce468cad1ac05203bb88e062c2
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
<<<<<<< HEAD
                icon.setIcon(pong);
=======
                icon.setIcon(Pong);
>>>>>>> 5ff819970bcce5ce468cad1ac05203bb88e062c2
            }
            else if (i == 2) {
                icon.setIcon(game3);
            }

            icon.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton icon = (JButton) e.getSource();
<<<<<<< HEAD
                    if (icon.getIcon() == wakamo) {
                        Wakamo waka = new Wakamo();
                    }
                    else if (icon.getIcon() == pong) {
                        Wakamo waka = new Wakamo();
                    }
                    else if (icon.getIcon() == game3) {
                        Wakamo waka = new Wakamo();
                    }
=======
                    // if (icon == ) {
                        
                    // }
>>>>>>> 5ff819970bcce5ce468cad1ac05203bb88e062c2
                    
                }
            });

        }
        selectionGui.add(boardPanel);

        selectionGui.setVisible(true);
    }
}
