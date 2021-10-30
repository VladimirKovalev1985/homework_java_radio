package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNorm(){
        Radio rad = new Radio();
        rad.setRadioStation(1);
        int expected = 1;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationOver(){
        Radio rad = new Radio();
        rad.setRadioStation(9);
        int expected = 9;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchToNextStation(){
        Radio rad = new Radio();
        rad.setRadioStation(8);
        rad.nextStation();
        int expected = 9;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationOverLimit(){
        Radio rad = new Radio();
        rad.setRadioStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationUnderLimit(){
        Radio rad = new Radio();
        rad.setRadioStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldIndicateTheNumberStation(){
        Radio rad = new Radio();
        rad.setRadioStation(5);
        rad.numberStation();
        int expected = 5;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }


}