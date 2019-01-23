/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;
    
    public Card (String s, int v){
        boolean goodToGo = false;
        for(String check : new String[]{"Hearts","Diamonds", "Spades", "Clubs"}){
            if(s.equals(check)){
                goodToGo = true;
                break;
            }
        }
        if(!goodToGo){
            System.out.println("That card type is not acceptable");
            System.out.println("Please use 'Hearts' 'Diamonds' 'Spades' or 'Clubs'");
            throw new IllegalArgumentException();
        }else{
        
            if(v <= 13 && v >= 1){
                this.value = v;
                this.suit = s;

            }else{
                System.out.println("That card number is not acceptable");
                System.out.println("Please enter a number between 1 and 13");
                throw new IllegalArgumentException();
            }
        }

    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}
