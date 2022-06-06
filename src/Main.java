import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pokemon pok1 = new FirePokemon( "Charmillion",7,"petrol station", "red", "M");
        Pokemon pok2 = new WaterPokemon("Kyogre", 4, "water dam", 365, true);
        Pokemon pok3 = new ElectroPokemon("Zapdos", 9,"building area", "87%", 4);
        Pokemon pok4 = new GrassPokemon("Serperior", 5, "grazing land", "Heracleum", "swelling and fever");


        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(pok1);
        pokemons.add(pok2);
        pokemons.add(pok3);
        pokemons.add(pok4);

        for(Pokemon pok : pokemons) {
            //pok.getName();
            pok.makesSound();
            pok.fightsWith();
            System.out.println("\r ---+---");
        }

    }
}
