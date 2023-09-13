package view;

import javax.swing.*;

public class panelClient {
    public JTabbedPane tabpanel;
    public panelClient()
    {
        tabpanel = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        tabpanel.addTab("Книги",panel1);
        tabpanel.addTab("Пользователи",panel2);
        tabpanel.setVisible(true);
    }
}
