package ru.netology.domain;

public class Radio {

    private int radioStation = 9;
    private int volume = 100;

    public Radio(int radioStation) {
        this.radioStation = radioStation;
    }

    public Radio() {
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        this.radioStation = radioStation;

    }



    public void nextStation() {
        int next = radioStation + 1;
        setRadioStation(next);
        if (next > 9) {
            setRadioStation(0);
        }

    }

    public void prevStation(){
        int prev = radioStation - 1;
        setRadioStation(prev);
        if (prev < 0){
            setRadioStation(9);
        }
    }

    public void numberStation(){
        int numStation = radioStation;
        setRadioStation(numStation);

    }




    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume){
        if(volume < 0){
            return;
        }
        if(volume > 100){
            return;
        }
        this.volume = volume;
    }

    public void plusVolume(){
        int plus = volume +1;
        setVolume(plus);
        if(plus > 100){
            setVolume(100);
        }
    }

    public void minusVolume(){
        int minus = volume - 1;
        setVolume(minus);
        if(minus < 0){
            setVolume(0);
        }
    }



}

