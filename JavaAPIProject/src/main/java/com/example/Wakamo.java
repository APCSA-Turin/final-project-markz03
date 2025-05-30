package com.example;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;

public class Wakamo {
    JFrame game;
    JLabel textLabel;
    JLabel timeLabel;
    JPanel textPanel, boardPanel;
    JButton[] board;
    ImageIcon moleIcon;
    ImageIcon holeIcon;

    JButton currMoleTile;

    Random random = new Random();
    Timer setMoleTimer;
    Timer timer;
    int score = 0;

    public Wakamo() {
        game = new JFrame();
        textLabel = new JLabel();
        textPanel = new JPanel();
        boardPanel = new JPanel();
        board = new JButton[9];
        timeLabel = new JLabel();

        game = new JFrame("Whack-a-Mole");
        game.setSize(600, 750);
        game.setLayout(new BorderLayout());
        game.setResizable(false);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        textLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        textLabel.setText("Score: 0");
        textLabel.setOpaque(true);
        textLabel.setHorizontalAlignment(JLabel.CENTER);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        game.add(textPanel, BorderLayout.NORTH);


        boardPanel.setLayout(new GridLayout(3,3));
        game.add(boardPanel);

        Image holeImg = new ImageIcon(getClass().getResource("./hole.png")).getImage();
        holeIcon = new ImageIcon(holeImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Image moleImg = new ImageIcon(getClass().getResource("./mole.png")).getImage();
        moleIcon = new ImageIcon(moleImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));

        timeLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timer = new Timer(1000, new ActionListener() {
            int remainingSeconds = 30;
            @Override
            public void actionPerformed(ActionEvent e) {
                remainingSeconds--;
                timeLabel.setText("Time: " + remainingSeconds);
                if (remainingSeconds <= 0) {
                    timer.stop();
                    timeLabel.setText("Time's up!");
                    System.out.println("TIMES OUT");
                    for (int i = 0; i < 9; i++) {
                        board[i].setEnabled(false);
                    }
                    setMoleTimer.stop();
                }
            }
        });
        timer.start();
        game.add(timeLabel, BorderLayout.SOUTH);



        for (int i = 0; i < 9; i++) {
            JButton hole = new JButton();
            board[i] = hole;
            hole.setFocusable(false);
            boardPanel.add(hole);
            hole.setIcon(holeIcon);

            hole.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton hole = (JButton) e.getSource();
                    if (hole == currMoleTile) {
                        score+=5;
                        textLabel.setText("Score: " + Integer.toString(score));
                    }
                    
                }
            });

        }




        setMoleTimer = new Timer(750, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currMoleTile != null) {
                    currMoleTile.setIcon(holeIcon);
                    currMoleTile = null;
                }

                int num = random.nextInt(9);
                JButton hole = board[num];

                currMoleTile = hole;
                currMoleTile.setIcon(moleIcon);
            }
        });
        setMoleTimer.start();

    


        game.setVisible(true);

    }

    public static void main(String[] args) {
        Wakamo wack = new Wakamo();

    }
}
