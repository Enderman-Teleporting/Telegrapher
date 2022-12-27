package com.typer.Window;

import javax.swing.*;
import java.awt.*;

public class Input{
    public static JPanel wordsShow(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Server IP");
        JLabel label2 = new JLabel("Server Port");
        panel.add(label,BorderLayout.CENTER);
        panel.add(label2,BorderLayout.CENTER);
        panel.setBounds(300,300,300,300);
        return panel;
    }
}
