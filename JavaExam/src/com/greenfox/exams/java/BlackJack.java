package com.greenfox.exams.java;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class BlackJack extends JPanel {

    private JFrame frame1;
    private JButton newGame, drawACard;
    private JLabel userPlayed, housePlayed;



    public BlackJack(){
        createJFrame();
        frame1.add(this);

        userPlayed = new JLabel("User played:");
        housePlayed = new JLabel("House played:");
        newGame = new JButton("New Game");
        drawACard = new JButton("Draw a drawCard");

        this.add(housePlayed);
        this.add(userPlayed);
        this.add(newGame);
        this.add(drawACard);


    }

    public void createJFrame (){
        frame1 = new JFrame("Black Jack game");
        frame1.setSize(400, 200);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(true);
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
