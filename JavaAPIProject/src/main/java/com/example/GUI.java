package com.example;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI {
    private JFrame gui;
    private JPanel panel;
    private BufferedImage myPicture;
    private JLabel picLabel;

    public GUI() throws IOException {
        initialize();
    }

    public void initialize() throws IOException {
        gui = new JFrame("Arcade");
        gui.setSize(420, 500);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setLayout(null);
        gui.getContentPane().setBackground(new Color(53, 18, 105));

        panel = new JPanel();
        panel.setSize(420, 500);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(53, 18, 105));
        gui.add(panel);

        myPicture = ImageIO.read(new File("JavaAPIProject/src/main/java/com/example/img.png"));
        picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        picLabel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.add(picLabel);

        JButton but1 = new JButton("Play");
        but1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(but1);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectionGui select = new SelectionGui();

            }
        });
        
        gui.setVisible(true);
    }


}
