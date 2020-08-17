package parser;

import model.PokemonList;
import org.json.JSONArray;
import org.json.JSONObject;

public class PokemonListParser {
    public static JSONArray toJson(PokemonList list){
        JSONArray json = new JSONArray();
        list.getPokemons().forEach( pokemon -> {
            json.put(PokemonParser.toJson(pokemon));
        });
        return json;
    }

    public static PokemonList fromJson(JSONArray json){
        PokemonList list = new PokemonList();
        json.forEach( item -> {
            list.addPokemon(PokemonParser.fromJson((JSONObject) item));
        });
        return list;
    }
}
