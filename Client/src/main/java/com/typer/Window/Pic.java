package com.typer.Window;

import javax.swing.*;
import java.awt.*;
public class Pic{
    public static Panel mainPic(){
        Panel panel = new Panel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Pic.class.getResource("/pics/telegraph1.jpg"))));
        label.setPreferredSize(new Dimension(200,140));
        panel.setPreferredSize(new Dimension(200,140));
        panel.add(label);
        return panel;
    }
}
