package com.greenfox.exams.java;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Card {

    private String colour;
    private int value;

    public Card (){

    }


    public Card(String colour, int value) {
        this.colour = colour;
        this.value = value;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return colour + " " + value;
    }

}
