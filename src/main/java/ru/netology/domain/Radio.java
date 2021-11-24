package ru.netology.domain;

public class Radio {

    private int radioStation;
    private int volume;
    private int maxRadioStation = 9;
    private int minRadiostation = 0;

    public Radio(int radioStation) {
        this.radioStation = radioStation;
    }

    public Radio() {
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < minRadiostation) {
            return;
        }
        if (radioStation > maxRadioStation) {
            return;
        }
        this.radioStation = radioStation;

    }


    public void nextStation() {
        int next = radioStation + 1;
        setRadioStation(next);
        if (next > maxRadioStation) {
            setRadioStation(minRadiostation);
        }

    }

    public void prevStation() {
        int prev = radioStation - 1;
        setRadioStation(prev);
        if (prev < minRadiostation) {
            setRadioStation(maxRadioStation);
        }
    }

    public void numberStation() {
        int numStation = radioStation;
        setRadioStation(numStation);

    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void plusVolume() {
        int plus = volume + 1;
        setVolume(plus);
        if (plus > 100) {
            setVolume(100);
        }
    }

    public void minusVolume() {
        int minus = volume - 1;
        setVolume(minus);
        if (minus < 0) {
            setVolume(0);
        }
    }


}





