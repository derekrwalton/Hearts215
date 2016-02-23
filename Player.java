/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package player;

import card.Card;

/**
 *
 * @author Derek
 */
public class Player {
    private boolean hasLead; //Used to determine order of play, after first hand.
    private boolean hasTwoOfClubs; //Used to determine order of play, for first hand.
    private int order; //Order of play.. IE: Who's turn is it?
    private int score;
    private Card[] hand; //This players cards.
    
    
    public Card play(){
        Card card;
        
        return card;
    }
    
    public Card[] getHand(){
        
    }
    
    public int calcScore(){
        return score;
    }
    
}
