package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland",new BigDecimal("37980000")));
        europe.addCountry(new Country("Russia",new BigDecimal("146900000")));
        europe.addCountry(new Country("Germany",new BigDecimal("83200000")));
        europe.addCountry(new Country("Turkey",new BigDecimal("82000000")));
        europe.addCountry(new Country("France",new BigDecimal("66950000")));
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China",new BigDecimal("1400050000")));
        asia.addCountry(new Country("India",new BigDecimal("1298040000")));
        asia.addCountry(new Country("Indonesia",new BigDecimal("264200000")));
        asia.addCountry(new Country("Japan",new BigDecimal("126250000")));
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        //When
        BigDecimal resultOfGetPeopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedResult = new BigDecimal("3505570000");
        Assert.assertEquals(expectedResult,resultOfGetPeopleQuantity);
    }

}
