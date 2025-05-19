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

public class App
{
    public static void main( String[] args ) throws IOException {
        JFrame gui = new JFrame("Arcade");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        gui.setSize(1000, 500);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setLocation(                                                                           );






        gui.add(panel);
        JButton but1 = new JButton("Play");



        BufferedImage myPicture = ImageIO.read(new File("JavaAPIProject/src/main/java/com/example/img.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setLocation(300, 300);
        panel.add(picLabel);

        gui.setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {


    }


}

