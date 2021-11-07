package ru.netology.domain;

public class Radio {

    private int currentStation;

    private int currentVolume;

    private int maxStationAmount = 10;

    public Radio(int maxStationAmount) {
        this.maxStationAmount = maxStationAmount;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStationAmount - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int nextCurrentStation() {
        if (currentStation >= 9) {
            return currentStation = 0;
        }
        currentStation = currentStation + 1;
        return currentStation;
    }

    public int previousCurrentStation() {
        if (currentStation <= 0) {
            return currentStation = 9;
        }
        currentStation = currentStation - 1;
        return currentStation;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0 ) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
