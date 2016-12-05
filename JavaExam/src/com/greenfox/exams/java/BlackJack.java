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
            housePlayed.setText("");
            userPlayed.setText("");
            house.playedCards.clear();
            user.playedCards.clear();



        } else if (e.getSource() == drawACard) {

            if (house.sumCards() < 17){
                housePlayed.setText("House played: " + house.drawAndAddCard());
            }
            else if (house.sumCards() < 21 && house.sumCards()>= 17){
                housePlayed.setText("House stopped");
            }
            else{
                housePlayed.setText("The house LOST");

            }

            userPlayed.setText("User played: " + user.drawAndAddCard());
            if (user.sumCards() < 21 && user.sumCards() >= 17){
                userPlayed.setText("You are between 17 and 21, I recommend you to stop");
            }
            else if (user.sumCards() > 21){
                userPlayed.setText("You LOST");
            }

        }
    }
}
