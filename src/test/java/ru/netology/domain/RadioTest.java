package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio rad = new Radio(9);
    Radio rad1 = new Radio();

    @Test
    public void shouldSetRadioStationNorm(){

        rad.setRadioStation(1);
                int actual = rad.getRadioStation();
        assertEquals(1, actual);
    }


    @Test
    public void shouldSetRadioStationOver(){

        rad.setRadioStation(9);

        int actual = rad.getRadioStation();
        assertEquals(9, actual);
    }


    @Test
    public void shouldSwitchToNextStation(){

        rad.setRadioStation(8);
        rad.nextStation();
        int expected = 9;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationOverLimit(){

        rad.setRadioStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationUnderLimit(){

        rad.setRadioStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationUnderLimitBorder(){

        rad.setRadioStation(-1);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationBorder(){

        rad.setRadioStation(5);
        rad.prevStation();
        int expected = 4;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIndicateTheNumberStation(){

        rad.setRadioStation(5);
        rad.numberStation();
        int expected = 5;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume(){

        rad.setVolume(5);
        int expected = 5;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchIfVolumeMax(){

        rad.setVolume(100);
        rad.plusVolume();

        int actual = rad.getVolume();
        assertEquals(100, actual);
    }

    @Test
    public void shouldSwitchIfVolumeMin(){

        rad.setVolume(0);
        rad.minusVolume();
        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNormVolume(){

        rad.setVolume(5);
        rad.plusVolume();
        int expected = 6;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchVolumeDown(){

        rad.setVolume(1);
        rad.minusVolume();
        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

}


