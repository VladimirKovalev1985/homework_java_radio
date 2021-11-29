package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio rad = new Radio(9);
    Radio rad1 = new Radio(15);

    @Test
    public void shouldSetRadioStationNorm() {

        rad.setRadioStation(1);
        int actual = rad.getRadioStation();
        assertEquals(1, actual);
    }


    @Test
    public void shouldSetRadioStationOver() {

        rad.setRadioStation(rad.getMaxRadioStation() + 1);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getRadioStation() - 1;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchToNextStation() {

        rad.setRadioStation(7);
        rad.nextStation();
        int expected = 8;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationOverLimit() {

        rad.setRadioStation(8);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationUnderLimit() {

        rad.setRadioStation(5);
        rad.prevStation();
        int expected = 4;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationUnderLimitBorder() {

        rad.setRadioStation(rad.getMinRadiostation() - 1);
        rad.prevStation();
        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationBorder() {

        rad.setRadioStation(5);
        rad.prevStation();
        int expected = 4;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {

        rad.setVolume(5);
        int expected = 5;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchIfVolumeMax() {

        rad.setVolume(rad.getMaxVolume());
        rad.plusVolume();

        int actual = rad.getVolume();
        assertEquals(100, actual);
    }

    @Test
    public void shouldSwitchIfVolumeMin() {

        rad.setVolume(rad.getMinVolume());
        rad.minusVolume();
        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNormVolume() {

        rad.setVolume(5);
        rad.plusVolume();
        int expected = 6;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchVolumeDown() {

        rad.setVolume(1);
        rad.minusVolume();
        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation1() {

        rad1.setRadioStation(11);
        int expected = 11;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationOver1() {

        rad1.setRadioStation(rad1.getMaxRadioStation() + 1);
        rad1.nextStation();

        int expected = 0;
        int actual = rad1.getRadioStation() - 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation1() {

        rad1.setRadioStation(12);
        rad1.nextStation();
        int expected = 13;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchIfStationUnderLimit1() {

        rad1.setRadioStation(11);
        rad1.prevStation();
        int expected = 10;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);

    }

}


