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
public class FullCubeSupply {
    private CubeSupply red;
    private CubeSupply blue;
    private CubeSupply yellow;
    private CubeSupply black;
    
    public FullCubeSupply(){
        this.red = new CubeSupply("red");
        this.blue = new CubeSupply("blue");
        this.black = new CubeSupply("black");
        this.yellow = new CubeSupply("yellow");
    }
    
   public CubeSupply getCubeSupply(String colour) throws NotAColourException{
        switch(colour){
            case "red":
               return this.red;
            case "blue":
               return this.blue;
            case "black":
               return this.black;
            case "yellow":
               return this.yellow;
            default:
                throw new NotAColourException(colour + " is not a cube colour.");
        }
    }
    
}
