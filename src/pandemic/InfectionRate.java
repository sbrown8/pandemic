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
public class InfectionRate {

    private final int MAX_INCREMENT = 6;
    private final int[] RATES_AT_EACH_INCREMENT = {2,2,2,3,3,4,4};  //FIXME: Values not immutable
    private int increment;
    private int rate;

    public InfectionRate() {
        this.increment = 0;
        this.rate = RATES_AT_EACH_INCREMENT[0];
    }
    
    public int getInfectionRate(){
        return this.rate;
    }
    
    public boolean increaseInfectionRate(){
        if(this.increment==MAX_INCREMENT) return false;
        else{
            this.increment++;
            this.rate=RATES_AT_EACH_INCREMENT[this.increment];
            return true;
        }
    }
}


