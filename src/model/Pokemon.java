package model;

// Represents the pokemon
public class Pokemon {
    String name;
    int height;
    int weight;
    int id;
    String type;
    String sprite;
    String description;

    public Pokemon(String name, int height, int weight, int id, String type, String sprite, String description) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.id = id;
        this.type = type;
        this.sprite = sprite;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSprite() {
        return sprite;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", sprite='" + sprite + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
