package com.dilan.interfaces;

import javax.swing.*;

public class MainDesktop  extends javax.swing.JFrame {

    private JPanel panel1;
    private JTextField holaTextField;

    public static void main(String[] args) {
        MainDesktop window = new MainDesktop();
        window.setContentPane(window.panel1);
        window.setTitle("Dilan App");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");


        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        window.setJMenuBar(menuBar);
        window.setVisible(true);
    }
}
