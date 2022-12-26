package com.typer.Window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AuthorInfo {
    public static void windowAuthorInfo(){
        Frame frame = new Frame("Author Info");
        frame.addWindowListener(new WindowAdapter() {
                                    @Override
                                    public void windowClosing(WindowEvent e) {
                                        frame.setVisible(false);
                                    }
                                }
        );
        frame.setVisible(true);
    }
}
