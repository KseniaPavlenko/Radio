package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < getMinNumberRadioStation()) {
            return;
        }
        if (newCurrentRadioStation > getMaxNumberRadioStation()) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void increaseRadioStation() {
        if (currentRadioStation < 10) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public int getMinNumberRadioStation() {
        return 0;
    }

    public int getMaxNumberRadioStation() {
        return 9;
    }

    public int getMinSoundVolume() {
        return 0;
    }

    public int getMaxSoundVolume() {
        return 10;
    }
}
