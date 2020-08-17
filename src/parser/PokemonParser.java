package parser;

import model.Pokemon;
import org.json.JSONObject;

public class PokemonParser {
    public static JSONObject toJson(Pokemon pokemon){
        JSONObject json = new JSONObject();
        json.put("name", pokemon.getName());
        json.put("height", pokemon.getHeight());
        json.put("weight", pokemon.getWeight());
        json.put("id", pokemon.getId());
        json.put("type", pokemon.getType());
        json.put("sprite", pokemon.getSprite());
        json.put("description", pokemon.getDescription());

        return json;
    }

    public static Pokemon fromJson(JSONObject json){
        Pokemon pokemon = new Pokemon(
                json.getString("name"),
                json.getInt("height"),
                json.getInt("weight"),
                json.getInt("id"),
                json.getString("type"),
                json.getString("sprite"),
                json.getString("description")
        );
        return pokemon;
    }
}
