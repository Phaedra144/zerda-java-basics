package com.greenfox.exams.java;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Card {

    private String colour;
    private String value;


    public Card(String suit, String value){
        this.colour = suit;
        this.value = value;
    }
    public enum valueOfCard {

        ACE("A", 1),
        _2("2", 2),
        _3("3", 3),
        _4("4", 4),
        _5("5", 5),
        _6("6", 6),
        _7("7", 7),
        _8("8", 8),
        _9("9", 9),
        _10("10", 10),
        JACK("J", 11),
        QUEEN("Q", 12),
        KING("K", 13);

        String name;
        int value;

        valueOfCard(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return colour + " " + value;
    }

}
