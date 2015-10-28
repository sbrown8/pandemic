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
public class InfectionCard extends Card{
    private final String city;
    
    public InfectionCard(String city){
        this.city = city;
    }
    
    public String getCity(){
        return this.city;
    }
}
