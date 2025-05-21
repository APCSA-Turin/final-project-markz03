package com.example;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;

public class Wakamo extends Game{
    JFrame game;
    JLabel Tlabel;
    JPanel Tpanel, Bpanel;
    JButton[] board;

    public Wakamo() {
        super();
        game = new JFrame();
        Tlabel = new JLabel();
        Tpanel = new JPanel();
        Bpanel = new JPanel();
        board = new JButton[9];

        game = new JFrame("Whack-a-mOLE");
        game.setSize(600, 650);
        game.setLayout(new BorderLayout());
        game.setResizable(false);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Tlabel.setFont(new Font("Arial", Font.PLAIN, 50));
        Tlabel.setText("Score: 0");
        Tlabel.setOpaque(true);
        Tlabel.setHorizontalAlignment(JLabel.CENTER);

        Tpanel.setLayout(new BorderLayout());
        Tpanel.add(Tlabel);
        game.add(Tpanel, BorderLayout.NORTH);


        Bpanel.setLayout(new GridLayout(3,3));
        game.add(Bpanel);

        for (int i = 0; i < 9; i++) {
            JButton hole = new JButton();
            board[i] = hole;
            Bpanel.add(hole);
        }



        game.setVisible(true);






    }

    public static void main(String[] args) {
        Wakamo wack = new Wakamo();

    }
}
