package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Calgary", "AB"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        assertFalse(list.hasCity());
        list.addCity(new City("Cochrane", "AB"));
        assertTrue(list.hasCity());
    }

    @Test
    public void deleteCityTest() {
        list.addCity(new City("Cochrane", "AB"));
        int listSize = list.getCount();
        list.deleteCity();
        assertEquals(list.getCount(), listSize - 1);
    }

    @Test
    public void countCityTest() {
        assertEquals(list.getCount(), 0);
        list.addCity(new City("Cochrane", "AB"));
        assertEquals(list.getCount(), 1);
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), 2);
    }
}
