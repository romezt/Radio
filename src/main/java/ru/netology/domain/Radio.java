package ru.netology.domain;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
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

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
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
