/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandemic;

/**
 *
 * @author Shannon
 */
public class Player {
    private PlayerHand hand;
    private int movesLeft;
    private City location;
        
    public void Player(City location){
        this.hand = new PlayerHand();
        this.movesLeft = 0;
        this.location = location;
    }
    
    public void changeLocation(City newLocation){
        this.location = newLocation;
    }
    
    public PlayerHand getHand(){
        return this.hand;
    }
    
    public City getLocation(){
        return this.getLocation();
    }
}
