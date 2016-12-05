package com.greenfox.exams.java;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Card {

    private String colour;
    private String value;

    public Card (String colour, String value){
        this.colour = colour;
        this.value = value;
    }

    public Card (){

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
