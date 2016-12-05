package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Deck{

    ArrayList<Card> cards;
    ArrayList<Card> used = new ArrayList<Card>();

    String[] value = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] colour = {"pikk", "treff", "káró", "kör"};

    static boolean firstThread = true;

    public Deck(){
        cards = new ArrayList<Card>();
        for (int i = 0; i<colour.length; i++) {
            for(int j=0; j<value.length; j++){
                this.cards.add(new Card(colour[i],value[j]));
            }
        }
        //shuffle the deck when its created
        Collections.shuffle(this.cards);

    }



    public void putUsedCard(){


    }



    public Card getCard(int i){
        Card x = cards.get(i);
        return x;
    }



}
