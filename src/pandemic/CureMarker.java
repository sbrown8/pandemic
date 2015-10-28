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
public class CureMarker {
    private String colour;
    private boolean cured;
    private boolean eradicated;
    
    public CureMarker(String colour){
        this.colour=colour;
        this.cured=false;
        this.eradicated=false;
    }
    
    public void cureDisease() throws InvalidMoveException{
        if(this.cured==true) throw new InvalidMoveException("Cannot cure a disease that was already cured");
        this.cured=true;
    }
    
    public void eradicateDisease() throws InvalidMoveException{
        if(this.cured == false) throw new InvalidMoveException("Cannot eradicate a disease that has not been cured");
        if(this.eradicated == true) throw new InvalidMoveException("Cannot eradicate a disease that has already been eradicated");
    }
    
    public boolean isCured(){
        return this.cured;
    }
    
    public boolean isEradicated(){
        return this.eradicated;
    }
}


