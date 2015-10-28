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
public class Deck {
    
    Stack<Card> deck;
    
    public Deck(){
    this.deck = new Stack();
    }
    
    public void addCard(Card card){
    this.deck.push(card);
    }
    
    public Card takeTopCard() throws InvalidMoveException{
        if(this.deck.isEmpty()) throw new InvalidMoveException("Cannot take card, no cards in this deck");
        return this.deck.pop();
    }
    
    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }
    
    public void stackDeckOnDeck(Deck addedDeck){
        Stack<Card> placeHolder = new Stack();
        try{
        while(true) placeHolder.push(addedDeck.takeTopCard());
        } catch (InvalidMoveException e){}
        while(!placeHolder.isEmpty()){
            this.deck.push(placeHolder.pop());
        }
    }
    
    public Card removeFromDeck(Card cardToRemove) throws InvalidMoveException{
        Stack<Card> putBackOn = new Stack();
        boolean cardRemoved = false;
        while(!this.deck.isEmpty() && !cardRemoved){
            Card topCard = this.deck.pop();
            if(topCard==cardToRemove) cardRemoved=true;
            else putBackOn.push(topCard);
        }
        while(!putBackOn.isEmpty()){
            this.deck.push(putBackOn.pop());
        }
        if(cardRemoved) return cardToRemove;
        else throw new InvalidMoveException("Cannot remove. This card is not in this deck.");
    }
    
}
