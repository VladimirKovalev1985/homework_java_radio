package ru.netology.domain;

public class Radio {

    private int radioStation;
    private int volume;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation){
        if(radioStation < 0){
            return;
        }
        if(radioStation > 9){
            return;
        }
        this.radioStation = radioStation;

   }

   public void nextStation(){
        int next = radioStation+1;
        setRadioStation(next);
        }


    public int getVolume(){
        return volume;
    }

}

