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

public class GUI {
    public GUI() throws IOException {
        initialize();
    }

    public void initialize() throws IOException {
        JFrame gui = new JFrame("Arcade");
        gui.setSize(420, 500);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setLayout(null);
        gui.getContentPane().setBackground(new Color(53, 18, 105));

        JPanel panel = new JPanel();
        panel.setSize(420, 500);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(53, 18, 105));
        gui.add(panel);

        BufferedImage myPicture = ImageIO.read(new File("JavaAPIProject/src/main/java/com/example/img.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        picLabel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.add(picLabel);

        JButton but1 = new JButton("Play");
        but1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(but1);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wakamo game = new Wakamo();

            }
        });
        
        gui.setVisible(true);
    }
}
