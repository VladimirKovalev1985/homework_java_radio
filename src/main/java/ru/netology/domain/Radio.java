package ru.netology.domain;

public class Radio {

    private int radioStation;
    private int volume;
    private int minRadiostation = 0;
    private int numberOfStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxRadioStation = 8;

    public Radio(int numberOfStation) {
        maxRadioStation = numberOfStation - 1;
        this.numberOfStation = numberOfStation;
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

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadiostation() {
        return minRadiostation;
    }

    public int nextStation() {
        int next = radioStation + 1;
        setRadioStation(next);
        if (next > maxRadioStation){
            setRadioStation(minRadiostation);
        }
        return radioStation;
    }
    // int next = radioStation + 1;
    //  setRadioStation(next);
    //  if (next > maxRadioStation) {
    //      setRadioStation(minRadiostation);
    //   }

    // }

    public int prevStation() {
        setRadioStation(radioStation - 1);
        return radioStation;
    }
    //   int prev = radioStation - 1;
    // setRadioStation(prev);
    //if (prev < minRadiostation) {
    //  setRadioStation(maxRadioStation);
    // }
    // }

    // public void numberStation() {
    //   int numStation = radioStation;
    // setRadioStation(numStation);

    //}


    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            volume = minVolume;
        }
        if (volume > maxVolume) {
            volume = maxVolume;
        }
        this.volume = volume;
    }

    public int plusVolume() {
        setVolume(volume + 1);
        return volume;
    }

    public int minusVolume() {
        setVolume(volume - 1);
        return volume;
    }
}







