package com.greenfox.exams.java;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class BlackJack extends JPanel implements ActionListener {

    private JFrame frame1;
    private JButton newGame, drawACard;
    private JLabel userPlayed, housePlayed;
    Player house = new Player("House player");
    Player user = new Player("User");
    Deck deck01 = new Deck();


    public BlackJack() {
        createJFrame();
        frame1.add(this);

        userPlayed = new JLabel("User played:");
        housePlayed = new JLabel("House played:");
        newGame = new JButton("New Game");
        drawACard = new JButton("Draw a drawCard");

        this.add(housePlayed);
        this.add(userPlayed);
        this.add(newGame);
        newGame.addActionListener(this);
        this.add(drawACard);
        drawACard.addActionListener(this);


    }

    public void createJFrame() {
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


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame) {


        } else if (e.getSource() == drawACard) {
            housePlayed.setText(house.drawCard().toString());
            userPlayed.setText(user.drawCard().toString());
        }
    }
}
