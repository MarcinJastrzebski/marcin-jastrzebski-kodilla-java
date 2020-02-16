package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> continentCountries = new ArrayList<>();

    public void addCountry(Country country){
        this.continentCountries.add(country);
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getContinentCountries() {
        return new ArrayList<>(continentCountries);
    }
}
