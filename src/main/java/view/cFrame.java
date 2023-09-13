package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class cFrame implements TypeViewFrame {
    Dimension screenSize;
    private JFrame myFrame; //Стартовый фрейм
    private panelAuthor panelauthor;
    private panelClient panelclient;
    public class ButtonClickAuthor implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            panelauthor.textf_passw.setText("Ура Все работает!!");
            panelauthor.textf_login.setText("Да да");
            panelauthor.label_login.setVisible(false);
        }
    }

    public class ButtonClickExit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            myFrame.dispose();
        }
    }

    private void inputAuthPanel()
    {
        panelauthor.button_auth.addActionListener(new ButtonClickAuthor());
        panelauthor.button_close.addActionListener(new ButtonClickExit());
        panelauthor.panel.setLocation((screenSize.width/2)-(panelauthor.panel.getWidth()/2),(screenSize.height/2)-(panelauthor.panel.getHeight()/2));
        myFrame.add(panelauthor.panel);
    }

    private void inputClientPanel()
    {
        myFrame.add(panelclient.tabpanel);
        panelclient.tabpanel.setSize(this.screenSize.width,this.screenSize.height);
    }

    public cFrame()
    {
        //создаем базовое окно программы
        myFrame = new JFrame("Библиотека");
        //реакция на закрытие формы
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //тип позиционирования компонентов
        myFrame.setLayout(null);
        //получить размеры экрана и передать их оконной форме
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        myFrame.setSize(screenSize.width,screenSize.height);
        //Добавить ярлык окна программы
        ImageIcon icon = new ImageIcon(".\\src\\main\\resources\\static\\icon-library.png");
        myFrame.setIconImage(icon.getImage());
        //Создаем панели авторизации и клиентской панели
        panelauthor = new panelAuthor();
        panelclient = new panelClient();
        //вызываем функции ввода панелий
        this.inputAuthPanel();
        this.inputClientPanel();

        myFrame.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                panelauthor.panel.setVisible(false);
                panelauthor.panel.setLocation((myFrame.getWidth()/2)-(panelauthor.panel.getWidth()/2),(myFrame.getHeight()/2)-(panelauthor.panel.getHeight()/2));
                panelauthor.panel.setVisible(true);
            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {

            }

            @Override
            public void componentHidden(ComponentEvent e) {

            }
        });
        myFrame.setVisible(true);
    }

    public void setView(int type)
    {
        switch (type) {
            case cFrame.VIEW_AUTHOR ->{}
            case cFrame.VIEW_START ->{}
            default -> {}
        }
    }
}
