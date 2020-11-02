package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan")));
    }
    
    @Test
    void testGetCities(){
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
    }

    @Test
    void testClearCities(){
        CityList cityList = mockCityList();
        cityList.add(new City("Regina", "Saskatchewan"));
        cityList.add(new City("Vancouver", "British Columbia"));
        cityList.clearCities();
        assertEquals(0, cityList.countCities());

    }
        
}
