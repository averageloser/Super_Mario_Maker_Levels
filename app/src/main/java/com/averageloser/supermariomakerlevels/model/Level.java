package com.averageloser.supermariomakerlevels.model;

/**
 * Created by tj on 10/9/2015.
 *
 * Represents a Super Mario Maker level in the database.
 */
public class Level {
    private String name; //The level name
    private String code; //the code to access the level.
    private int rating; //How many people liked this level.
    private int flag; //How many times was this level flagged as inappropriate?

    public Level(String name, String code) {
        this.setName(name);
        this.setCode(code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
