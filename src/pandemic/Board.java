/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandemic;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shannon
 */
public class Board {
    private final int EASY = 4;
    private final int MEDIUM = 5;
    private final int HARD = 6;    
    private final int numberOfResearchStations = 6;
    private int researchStationsLeft;
    private FullCubeSupply fullCubeSupply;
    private InfectionRate infectionRate;
    private CureMarkers cureMarkers;
    private City startingCity;
    private ArrayList players;
    
    private City atlanta;
    private City washington;
    private City sanfrancisco;
    private City chicago;
    private City montreal;
    private City newyork;
    private City london;
    private City essen;
    private City stpetersburg;
    private City madrid;
    private City paris;
    private City milan;
    private City losangeles;
    private City mexicocity;
    private City miami;
    private City santiago;
    private City lima;
    private City bogota;
    private City buenosaires;
    private City saopaulo;
    private City lagos;
    private City kinshasa;
    private City johannesburg;
    private City khartoum;
    private City algiers;
    private City istanbul;
    private City moscow;
    private City tehran;
    private City delhi;
    private City kolkata;
    private City cairo;
    private City baghdad;
    private City karachi;
    private City riyadh;
    private City mumbai;
    private City chennai;
    private City beijing;
    private City seoul;
    private City tokyo;
    private City shanghai;
    private City bangkok;
    private City hongkong;
    private City taipei;
    private City osaka;
    private City jakarta;
    private City hochiminhcity;
    private City manila;
    private City sydney;
    //Roles left?
    
    public Board(int numberOfPlayers, int difficulty) throws InvalidMoveException, NotAColourException{
        if(numberOfPlayers<2||numberOfPlayers>4) throw new InvalidMoveException("Number of players must be between 2 and 4");
        if(difficulty>HARD||difficulty<EASY) {
            throw new InvalidMoveException("Invalid difficulty level.");
        } 
        this.players = new ArrayList(numberOfPlayers);
        
        for(int i=0; i<numberOfPlayers; i++){
            createNewPlayer();
        }
        
        atlanta = new City("blue", this.fullCubeSupply);
        atlanta.addResearchStation();
        this.startingCity = atlanta;
        washington = new City("blue", this.fullCubeSupply);
        sanfrancisco = new City("blue", this.fullCubeSupply);
        chicago = new City("blue", this.fullCubeSupply);
        montreal = new City("blue", this.fullCubeSupply);
        newyork = new City("blue", this.fullCubeSupply);
        london = new City("blue", this.fullCubeSupply);
        essen = new City("blue", this.fullCubeSupply);
        stpetersburg = new City("blue", this.fullCubeSupply);
        madrid = new City("blue", this.fullCubeSupply);
        paris = new City("blue", this.fullCubeSupply);
        milan = new City("blue", this.fullCubeSupply);
        losangeles = new City("yellow", this.fullCubeSupply);
        mexicocity = new City("yellow", this.fullCubeSupply);
        miami = new City("yellow", this.fullCubeSupply);
        santiago = new City("yellow", this.fullCubeSupply);
        lima = new City("yellow", this.fullCubeSupply);
        bogota = new City("yellow", this.fullCubeSupply);
        buenosaires = new City("yellow", this.fullCubeSupply);
        saopaulo = new City("yellow", this.fullCubeSupply);
        lagos = new City("yellow", this.fullCubeSupply);
        kinshasa = new City("yellow", this.fullCubeSupply);
        johannesburg = new City("yellow", this.fullCubeSupply);
        khartoum = new City("yellow", this.fullCubeSupply);
        algiers = new City("black", this.fullCubeSupply);
        istanbul = new City("black", this.fullCubeSupply);
        moscow  = new City("black", this.fullCubeSupply);
        tehran  = new City("black", this.fullCubeSupply);
        delhi  = new City("black", this.fullCubeSupply);
        kolkata  = new City("black", this.fullCubeSupply);
        cairo  = new City("black", this.fullCubeSupply);
        baghdad = new City("black", this.fullCubeSupply);
        karachi = new City("black", this.fullCubeSupply);
        riyadh  = new City("black", this.fullCubeSupply);
        mumbai  = new City("black", this.fullCubeSupply);
        chennai  = new City("black", this.fullCubeSupply);
        beijing  = new City("red", this.fullCubeSupply);
        seoul = new City("red", this.fullCubeSupply);
        tokyo = new City("red", this.fullCubeSupply);
        shanghai = new City("red", this.fullCubeSupply);
        bangkok = new City("red", this.fullCubeSupply);
        hongkong = new City("red", this.fullCubeSupply);
        taipei = new City("red", this.fullCubeSupply);
        osaka = new City("red", this.fullCubeSupply);
        jakarta = new City("red", this.fullCubeSupply);
        hochiminhcity = new City("red", this.fullCubeSupply);
        manila = new City("red", this.fullCubeSupply);
        sydney = new City("red", this.fullCubeSupply);
        sanfrancisco.attachCity(tokyo);
        sanfrancisco.attachCity(manila);
        sanfrancisco.attachCity(losangeles);
        sanfrancisco.attachCity(chicago);
        chicago.attachCity(sanfrancisco);
        chicago.attachCity(losangeles);
        chicago.attachCity(mexicocity);
        chicago.attachCity(atlanta);
        chicago.attachCity(montreal);
        montreal.attachCity(chicago);
        montreal.attachCity(washington);
        montreal.attachCity(newyork);
        newyork.attachCity(montreal);
        newyork.attachCity(washington);
        newyork.attachCity(london);
        newyork.attachCity(madrid);
        atlanta.attachCity(chicago);
        atlanta.attachCity(washington);
        atlanta.attachCity(miami);
        washington.attachCity(atlanta);
        washington.attachCity(montreal);
        washington.attachCity(newyork);
        washington.attachCity(miami);
        london.attachCity(newyork);
        london.attachCity(madrid);
        london.attachCity(paris);
        london.attachCity(essen);
        essen.attachCity(london);
        essen.attachCity(paris);
        essen.attachCity(milan);
        essen.attachCity(stpetersburg);
        stpetersburg.attachCity(essen);
        stpetersburg.attachCity(istanbul);
        stpetersburg.attachCity(moscow);
        madrid.attachCity(newyork);
        madrid.attachCity(london);
        madrid.attachCity(paris);
        madrid.attachCity(algiers);
        madrid.attachCity(saopaulo);
        paris.attachCity(london);
        paris.attachCity(essen);
        paris.attachCity(milan);
        paris.attachCity(algiers);
        paris.attachCity(madrid);
        milan.attachCity(paris);
        milan.attachCity(essen);
        milan.attachCity(istanbul);
        losangeles.attachCity(sydney);
        losangeles.attachCity(sanfrancisco);
        losangeles.attachCity(chicago);
        losangeles.attachCity(mexicocity);
        mexicocity.attachCity(losangeles);
        mexicocity.attachCity(chicago);
        mexicocity.attachCity(miami);
        mexicocity.attachCity(bogota);
        mexicocity.attachCity(lima);
        miami.attachCity(mexicocity);
        miami.attachCity(atlanta);
        miami.attachCity(washington);
        miami.attachCity(bogota);
        bogota.attachCity(mexicocity);
        bogota.attachCity(miami);
        bogota.attachCity(lima);
        bogota.attachCity(buenosaires);
        bogota.attachCity(saopaulo);
        lima.attachCity(santiago);
        lima.attachCity(mexicocity);
        lima.attachCity(bogota);
        santiago.attachCity(lima);
        buenosaires.attachCity(bogota);
        buenosaires.attachCity(saopaulo);
        saopaulo.attachCity(buenosaires);
        saopaulo.attachCity(bogota);
        saopaulo.attachCity(madrid);
        saopaulo.attachCity(lagos);
        lagos.attachCity(saopaulo);
        lagos.attachCity(khartoum);
        lagos.attachCity(kinshasa);
        khartoum.attachCity(cairo);
        khartoum.attachCity(johannesburg);
        khartoum.attachCity(kinshasa);
        khartoum.attachCity(lagos);
        kinshasa.attachCity(lagos);
        kinshasa.attachCity(khartoum);
        kinshasa.attachCity(johannesburg);
        johannesburg.attachCity(kinshasa);
        johannesburg.attachCity(khartoum);
        algiers.attachCity(madrid);
        algiers.attachCity(paris);
        algiers.attachCity(istanbul);
        algiers.attachCity(cairo);
        istanbul.attachCity(algiers);
        istanbul.attachCity(milan);
        istanbul.attachCity(stpetersburg);
        istanbul.attachCity(moscow);
        istanbul.attachCity(baghdad);
        istanbul.attachCity(cairo);
        moscow.attachCity(istanbul);
        moscow.attachCity(stpetersburg);
        moscow.attachCity(tehran);
        cairo.attachCity(algiers);
        cairo.attachCity(istanbul);
        cairo.attachCity(baghdad);
        cairo.attachCity(riyadh);
        cairo.attachCity(khartoum);
        baghdad.attachCity(istanbul);
        baghdad.attachCity(tehran);
        baghdad.attachCity(karachi);
        baghdad.attachCity(riyadh);
        baghdad.attachCity(cairo);
        tehran.attachCity(baghdad);
        tehran.attachCity(moscow);
        tehran.attachCity(delhi);
        tehran.attachCity(karachi);
        riyadh.attachCity(cairo);
        riyadh.attachCity(baghdad);
        riyadh.attachCity(karachi);
        karachi.attachCity(riyadh);
        karachi.attachCity(baghdad);
        karachi.attachCity(tehran);
        karachi.attachCity(delhi);
        karachi.attachCity(mumbai);
        delhi.attachCity(karachi);
        delhi.attachCity(tehran);
        delhi.attachCity(kolkata);
        delhi.attachCity(chennai);
        delhi.attachCity(mumbai);
        kolkata.attachCity(delhi);
        kolkata.attachCity(hongkong);
        kolkata.attachCity(bangkok);
        kolkata.attachCity(chennai);
        mumbai.attachCity(karachi);
        mumbai.attachCity(delhi);
        mumbai.attachCity(chennai);
        chennai.attachCity(mumbai);
        chennai.attachCity(delhi);
        chennai.attachCity(kolkata);
        chennai.attachCity(bangkok);
        chennai.attachCity(jakarta);
        beijing.attachCity(seoul);
        beijing.attachCity(shanghai);
        seoul.attachCity(beijing);
        seoul.attachCity(shanghai);
        seoul.attachCity(tokyo);
        shanghai.attachCity(beijing);
        shanghai.attachCity(seoul);
        shanghai.attachCity(tokyo);
        shanghai.attachCity(taipei);
        shanghai.attachCity(hongkong);
        tokyo.attachCity(shanghai);
        tokyo.attachCity(seoul);
        tokyo.attachCity(sanfrancisco);
        tokyo.attachCity(osaka);
        bangkok.attachCity(chennai);
        bangkok.attachCity(kolkata);
        bangkok.attachCity(hongkong);
        bangkok.attachCity(hochiminhcity);
        bangkok.attachCity(jakarta);
        hongkong.attachCity(bangkok);
        hongkong.attachCity(kolkata);
        hongkong.attachCity(shanghai);
        hongkong.attachCity(taipei);
        hongkong.attachCity(manila);
        hongkong.attachCity(hochiminhcity);
        taipei.attachCity(hongkong);
        taipei.attachCity(shanghai);
        taipei.attachCity(osaka);
        taipei.attachCity(manila);
        osaka.attachCity(taipei);
        osaka.attachCity(tokyo);
        jakarta.attachCity(chennai);
        jakarta.attachCity(bangkok);
        jakarta.attachCity(hochiminhcity);
        jakarta.attachCity(sydney);
        hochiminhcity.attachCity(jakarta);
        hochiminhcity.attachCity(bangkok);
        hochiminhcity.attachCity(hongkong);
        hochiminhcity.attachCity(manila);
        manila.attachCity(hochiminhcity);
        manila.attachCity(hongkong);
        manila.attachCity(taipei);
        manila.attachCity(sanfrancisco);
        manila.attachCity(sanfrancisco);
        manila.attachCity(sydney);
        sydney.attachCity(jakarta);
        sydney.attachCity(manila);
        sydney.attachCity(losangeles);
    }

        private void createNewPlayer(){
    
    }
    //If disease is cured and cube supply is full, disease is eradicated
}   
    

    
    
}
