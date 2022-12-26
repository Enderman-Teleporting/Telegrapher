package com.typer.Window;

import java.awt.*;

import static java.lang.System.exit;

public class Buttons {
    public static Panel Exit(){
        Panel panel = new Panel();
        Button b = new Button("Exit");
        b.setPreferredSize(new Dimension(100,40));
        b.addActionListener(e -> exit(0));
        panel.add(b);
        return panel;
    }
}
