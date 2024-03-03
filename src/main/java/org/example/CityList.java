package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class keeps track of a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if that city does not already exist.
     *
     * @param city The city to add.
     * @throws IllegalArgumentException If the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list.");
        }
        cities.add(city);
    }

    /**
     * Deletes a city from the list.
     * @param city The city to delete.
     * @throws IllegalArgumentException If the city does not exist in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not exist.");
        }
        cities.remove(city);
    }

    /**
     * Returns the total number of cities in the list.
     * @return The total number of cities.
     */
    public int count() {
        return cities.size();
    }

    /**
     * Returns a sorted list of cities 
     *
     * @return The sorted list of cities.
     */
    public List<City> getCities() {
        List<City> cityList = cities;
        cityList.sort(new sortByCity());
        return cityList;
    }
}

