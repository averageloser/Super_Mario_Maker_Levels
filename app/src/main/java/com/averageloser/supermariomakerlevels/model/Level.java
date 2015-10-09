package com.averageloser.supermariomakerlevels.model;

/**
 * Created by tj on 10/9/2015.
 *
 * Represents a Super Mario Maker level in the database.
 */
public class Level {
    private String name; //The level name
    private String description; //The summary of the level.
    private String creator; //The creator of the level.
    private String dateTime; //The date and time the level was added to the database.
    private int rating; //How many people liked this level.
    private int flag; //How many times was this level flagged as inappropriate?

    public Level(String name, String description, String creator, int rating, int flag) {
        this.setName(name);
        this.setDescription(description);
        this.setCreator(creator);
        this.setRating(rating);
        this.setFlag(flag);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
