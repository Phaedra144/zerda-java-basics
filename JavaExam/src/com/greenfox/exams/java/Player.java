package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Player {

    Card temp01;
    Deck deck01;
    private String name;
    ArrayList<Card> playedCards = new ArrayList<Card>();

    public Player (String name){
        this.name = name;
    }

    public void drawCard (){
        deck01 = new Deck();
        deck01.getCard(0);
    }



//    public int sumCards(){
//        int i;
//        int sum = 0;
//        for(i = 1; i < playedCards.size(); i++){
//            sum += playedCards.get(i).temp.valueOfCard();
//        }
//        return sum;
//    }


    public void addCard(){
        playedCards.add(temp01);
    }

}
