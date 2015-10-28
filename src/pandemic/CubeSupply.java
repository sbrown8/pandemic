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
public class CubeSupply {
    private final int INITIAL_SUPPLY = 24;
    private String colour;
    private int amount;
    
    public CubeSupply(String colour){
        this.colour = colour;
        this.amount = INITIAL_SUPPLY;
    }
    
    public void decrease(int n) throws PlayerLoses{
        if((this.amount - n )<0) throw new PlayerLoses("Ran out of " + this.colour + " cubes.");
        this.amount -= n;
    }
    
    public void increase(int n) throws InvalidMoveException{
        if((this.amount + n)>24) throw new InvalidMoveException("Cannot increase the supply of " + this.colour + " cubes beyond initial amount.");
        this.amount += n;
    }
}
