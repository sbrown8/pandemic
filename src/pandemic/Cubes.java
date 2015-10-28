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
public class Cubes {
        
    private final String cubeColour;
    private int numberOfCubes;
    private final CubeSupply cubeSupply;
 
public Cubes(String colour, CubeSupply cubeSupply){
    this.numberOfCubes = 0;
    this.cubeColour = colour;
    this.cubeSupply = cubeSupply;
}

public boolean addCube() throws PlayerLoses{
    if(this.numberOfCubes<3){
        this.numberOfCubes++;
        this.cubeSupply.decrease(1);
        return true;
    }
    else{
        return false;
    }
}

public boolean removeCube() throws InvalidMoveException{
    if(this.numberOfCubes>0){
        this.numberOfCubes--;
        this.cubeSupply.increase(1);
        return true;
    }
    else{
        return false;
    }
}

}
