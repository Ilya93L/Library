package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class panelAuthor {
    public JPanel     panel;
    public JLabel     label_login;
    public JLabel     label_passw;
    public JTextField textf_login;
    public JTextField textf_passw;
    public JButton    button_auth;
    public JButton    button_close;


    public panelAuthor()
    {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(300,300);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setFont(new Font(Font.DIALOG,30,30));

        label_login = new JLabel(); label_login.setText("Логин");
        label_login.setSize(200,20);
        label_login.setHorizontalAlignment(JLabel.CENTER);
        label_login.setFont(new Font(Font.DIALOG,20,20));

        label_passw = new JLabel(); label_passw.setText("Пароль");
        label_passw.setSize(200,20);
        label_passw.setHorizontalAlignment(JLabel.CENTER);
        label_passw.setFont(new Font(Font.DIALOG,20,20));

        textf_login = new JTextField();
        textf_login.setSize(200,30);
        textf_login.setFont(new Font(Font.DIALOG,20,20));

        textf_passw = new JTextField();
        textf_passw.setSize(200,30);
        textf_passw.setFont(new Font(Font.DIALOG,20,20));

        button_auth = new JButton();
        button_auth.setText("Вход");
        button_auth.setSize(200,30);
        button_auth.setFont(new Font(Font.DIALOG,20,20));

        button_close = new JButton();
        button_close.setText("Выход");
        button_close.setSize(200,30);
        button_close.setFont(new Font(Font.DIALOG,20,20));

        label_login.setLocation(50,10); panel.add(label_login);
        textf_login.setLocation(50,40); panel.add(textf_login);
        label_passw.setLocation(50,80); panel.add(label_passw);
        textf_passw.setLocation(50,110); panel.add(textf_passw);
        button_auth.setLocation(50,160); panel.add(button_auth);
        button_close.setLocation(50,240); panel.add(button_close);
        panel.setVisible(true);
    }
}
