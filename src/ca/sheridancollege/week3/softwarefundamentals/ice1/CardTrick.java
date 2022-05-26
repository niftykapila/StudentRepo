/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nifty
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Random random = new Random();
            int cardNumbers = random.nextInt(13) + 1;
            Card c = new Card();
            c.setValue(cardNumbers);
            int cardSuits = random.nextInt(4);
            c.setSuit(Card.SUITS[cardSuits]);
            magicHand[i] = c;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(11);
        luckyCard.setSuit("Spades");
        boolean flag = false;
        for(int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                System.out.println("Card found!");
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("Card not found!");
        }
        
    }
    
}
