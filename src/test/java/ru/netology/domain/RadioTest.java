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
    public void shouldSwitchIfStationUnderLimitBorder(){
        Radio rad = new Radio();
        rad.setRadioStation(-1);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationBorder(){
        Radio rad = new Radio();
        rad.setRadioStation(5);
        rad.prevStation();
        int expected = 4;
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

    @Test
    public void shouldSetVolume(){
        Radio rad = new Radio();
        rad.setVolume(5);
        int expected = 5;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchIfVolumeMax(){
        Radio rad = new Radio();
        rad.setVolume(10);
        rad.plusVolume();
        int expected = 10;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchIfVolumeMin(){
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.minusVolume();
        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNormVolume(){
        Radio rad = new Radio();
        rad.setVolume(5);
        rad.plusVolume();
        int expected = 6;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchVolumeDown(){
        Radio rad = new Radio();
        rad.setVolume(1);
        rad.minusVolume();
        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

}


