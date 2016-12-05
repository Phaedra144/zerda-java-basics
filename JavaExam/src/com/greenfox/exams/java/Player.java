package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Player {

    private String name;
    ArrayList<Card> playedCards;
    Card temp01;
    Deck deck01;

    public Player (String name){
        this.name = name;
        playedCards = new ArrayList<Card>();
    }

    public String drawAndAddCard (){
        deck01 = new Deck();
        temp01 = deck01.getCard(0);
        addCard();
        return temp01.toString();

    }

    public void addCard(){
        playedCards.add(temp01);
    }

    public int sumCards(){
        int i;
        int sum = 0;
        for(i = 1; i < playedCards.size(); i++){
            sum += playedCards.get(i).getValue();
        }
        return sum;
    }




}
