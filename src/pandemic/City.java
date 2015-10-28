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
public class City {
    
    private String colour;
    private Cubes cityCubes;
    private HashMap<String, Cubes> colouredCubes;
    private FullCubeSupply fullCubeSupply;
    private ArrayList attachedCities;
    private boolean hasResearchStation;
    
    public City(String colour, FullCubeSupply fullCubeSupply) throws NotAColourException{
        this.colour = colour;
        this.fullCubeSupply = fullCubeSupply;
        this.colouredCubes.put("red", new Cubes("red", fullCubeSupply.getCubeSupply("red")));
        this.colouredCubes.put("yellow", new Cubes("yellow", fullCubeSupply.getCubeSupply("yellow")));
        this.colouredCubes.put("black", new Cubes("black", fullCubeSupply.getCubeSupply("black")));
        this.colouredCubes.put("blue", new Cubes("blue", fullCubeSupply.getCubeSupply("blue")));
        this.attachedCities = new ArrayList(5);
        this.cityCubes = (Cubes) this.colouredCubes.get(this.colour);
    }
    
    public boolean attachedTo(City attachedCity){
        return attachedCities.contains(attachedCity);
    }
    
    public void attachCity(City attachedCity){
        this.attachedCities.add(attachedCity);
    }
    
    public boolean hasResearchStation(){
        return this.hasResearchStation;
    }
    
    public void addResearchStation() throws InvalidMoveException{
        if(this.hasResearchStation) throw new InvalidMoveException("Cannot add more than one research station");
        this.hasResearchStation = true;
    }
    
    public void removeResearchStation() throws InvalidMoveException{
        if(!this.hasResearchStation) throw new InvalidMoveException("No research station on city");
        this.hasResearchStation = false;
    }
    
    /*
    *returns true if cube successfully added and false if this caused an outbreak
    */
    public boolean infectCity() throws PlayerLoses{
        return this.cityCubes.addCube();
    }
    
    /*
    *returns true if cube successfully added and false if this caused an outbreak
    */
    public boolean infectCityWithColour(String colour) throws PlayerLoses{
        Cubes cubes = (Cubes) this.colouredCubes.get(colour);
        return cubes.addCube();
    }
}
