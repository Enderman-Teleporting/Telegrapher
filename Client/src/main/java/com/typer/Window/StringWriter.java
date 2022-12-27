package com.typer.Window;

import javax.swing.*;
import java.awt.*;


public class StringWriter {
    public static JPanel string(){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        JLabel label = new JLabel("Telegrapher");
        label.setFont(new Font("Type 1",Font.BOLD,50));
        panel.add(label,BorderLayout.NORTH);
        return panel;
    }
}
