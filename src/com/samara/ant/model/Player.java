package com.samara.ant.model;

/**
 * Created by user on 25.04.2016.
 */
public class Player {
    private final String name;
    private final String figure;

    public Player(final String name, final String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }
}
