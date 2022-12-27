package com.typer.Window;

import java.awt.*;

import static com.typer.Window.AuthorInfo.windowAuthorInfo;
import static com.typer.Window.Help.window;
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

    public static Panel HelpAndAuthorInfo(){
        Panel panel = new Panel();
        Button help=new Button("Help");
        Button author=new Button("Author");
        help.setPreferredSize(new Dimension(50,50));
        help.setLocation(70,1);
        help.addActionListener(e -> window());
        panel.add(help);
        author.setPreferredSize(new Dimension(50,50));
        author.setLocation(70,50);
        author.addActionListener(e -> windowAuthorInfo());
        panel.add(author);
        return panel;
    }
}
