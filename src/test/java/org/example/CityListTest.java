package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CityListTest {
    private CityList cityList = new CityList();

    private City city1  =new City("Sadar","Mymensingh");
    private City city2  =new City("purbadhala","Netrokona");


    @Test
    public void testDeleteCity() {
        cityList.add(city1);
        cityList.add(city2);
        cityList.delete(city1);
        List<City> newCities = cityList.getCities();
        assertEquals(1,newCities.size());
        assertEquals(city2,newCities.get(0));

    }

    @Test
    public void testDeleteCityException() {
        cityList.add(city1);
        cityList.add(city2);
        assertThrows(IllegalArgumentException.class, () -> cityList.delete(new City("telegati","khulna")));
    }

    @Test
    public void testCountCIty() {
        cityList.add(city1);
        cityList.add(city2);
        assertEquals(2, cityList.count());
    }

    @Test
    public void testSortCity() {
        cityList.add(city1);
        cityList.add(city2);
        List<City> cities = cityList.getCities();
        assertEquals(city1,cities.get(0));
        assertEquals(city2,cities.get(1));
    }
}
