package model;

import java.util.ArrayList;
import java.util.List;

// List of pokemons. Congats! You caught them all!
public class PokemonList {
    private List<Pokemon> pokemons;

    // Constructor
    public PokemonList() {
        this.pokemons = new ArrayList<>();
    }

    // Getter
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    // add Pokemon
    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }
}
