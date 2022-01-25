package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame window = new JFrame();


        JPanel panel = new JPanel(new GridBagLayout());
        window.add(panel);

        JLabel label = new JLabel("Google");
        panel.setBackground(Color.yellow);
        panel.add(label);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        JButton button = new JButton("BUTTON");
        panel.add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com/search?g=" + textField.getText()));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();

                }
            }
        });


        window.setSize(400,400);
        window.setVisible(true);

    }
}
