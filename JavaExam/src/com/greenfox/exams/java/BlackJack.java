package com.greenfox.exams.java;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class BlackJack extends JPanel {

    private JFrame frame1;
    private JButton add;
    private JButton remove;
    private JButton removeAll;


    public BlackJack(){


    }

    public void createJFrame (){
        frame1 = new JFrame("Black Jack game");
        frame1.setSize(500, 500);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJack();
            }
        });

    }
}
