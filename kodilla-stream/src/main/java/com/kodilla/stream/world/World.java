package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent){
        this.continentList.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeopleQuantity = getContinentList().stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum.add(current));
        return totalPeopleQuantity;
    }

    public List<Continent> getContinentList() {
        return new ArrayList<>(continentList);
    }
}
