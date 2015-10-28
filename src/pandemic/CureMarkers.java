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
public class CureMarkers {
    CureMarker yellowCureMarker;
    CureMarker blueCureMarker;
    CureMarker blackCureMarker;
    CureMarker redCureMarker;
    
    public CureMarkers(){
        this.yellowCureMarker = new CureMarker("yellow");
        this.blueCureMarker = new CureMarker("blue");
        this.blackCureMarker = new CureMarker("black");
        this.redCureMarker = new CureMarker("red");
    }
    
    public CureMarker getCureMarker(String colour) throws NotAColourException{
        switch(colour){
            case "yellow":
                return this.yellowCureMarker;
            case "blue":
                return this.blueCureMarker;
            case "black":
                return this.blackCureMarker;
            case "red":
                return this.redCureMarker;
            default:
                throw new NotAColourException(colour+" is not a colour");
        }
    }
}
