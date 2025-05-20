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


public class test {
    public static void main(String[] args) {
        JPanel a = new JPanel();
        JPanel b = new JPanel();
        JPanel c = new JPanel();

        a.setBackground( Color.RED );
        b.setBackground( Color.GREEN  );
        c.setBackground( Color.BLUE );

        a.setMaximumSize( new Dimension(  10, 10) );
        b.setMaximumSize( new Dimension(  50, 10) );

        a.setAlignmentX( Component.LEFT_ALIGNMENT );//0.0
        b.setAlignmentX( Component.LEFT_ALIGNMENT );//0.0
        c.setAlignmentX( Component.LEFT_ALIGNMENT );//0.0

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(a);
        panel.add(b);
        panel.add(c);

        int result = JOptionPane.showConfirmDialog(null, panel, "Please enter values.", JOptionPane.OK_CANCEL_OPTION);
    }
}
