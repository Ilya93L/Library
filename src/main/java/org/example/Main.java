package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static JTextField textField3 = new JTextField();
    static class TestButtonclick implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            textField3.setText("Ура кнопка работает");
        }
    }
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Авторизация пользователя");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JButton button1 = new JButton("Войти"); button1.setSize(150,25);
        ActionListener onCLick = new TestButtonclick();
        button1.addActionListener(onCLick);


        JLabel label1 = new JLabel("Введите логин:");  label1.setSize(100,25);
        JLabel label2 = new JLabel("Введите пароль"); label2. setSize(100,25);

        JTextField textField1 = new JTextField(); textField1.setSize(100,25);
        JTextField textField2 = new JTextField(); textField2.setSize(100,25);
        textField3.setSize(100,25); textField3.setLocation(50,175);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        label1.setLocation(50,50);
        panel.add(label1);
        textField1.setLocation(50,75);
        panel.add(textField1);
        label2.setLocation(50,100);
        panel.add(label2);
        textField2.setLocation(50,125);
        panel.add(textField2);
        button1.setLocation(50,150);
        panel.add(button1);

        panel.add(textField3);
        panel.setSize(400,300);
        panel.setVisible(true);

        ImageIcon icon = new ImageIcon(".\\src\\main\\resources\\static\\icon-library.png");
        frame.setIconImage(icon.getImage());

        frame.add(panel);
        frame.setVisible(true);

    }
}