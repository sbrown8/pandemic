/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandemic;

import java.util.*;
     
/**
 *
 * @author Shannon
 */
public class PlayerHand {
    private ArrayList hand;
    
    public void PlayerHand(){
        hand = new ArrayList(7);
    }
    
    public void addCard(PlayerCard newCard){
        this.hand.add(newCard);
    }
    
    public int getNumberOfCards(){
        return hand.size();
    }
}
