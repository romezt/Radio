package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldCurrentStation() {
        Radio rad = new Radio();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        int expected = 6;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationUpBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationHiUpBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationBottomBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationLoBottomBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextCurrentStation() {
        Radio rad = new Radio();
        rad.currentStation = 8;
        int expected = 9;
        int actual = rad.nextCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextCurrentStationBorder() {
        Radio rad = new Radio();
        rad.currentStation = 9;
        int expected = 0;
        int actual = rad.nextCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextCurrentStationHiBorder() {
        Radio rad = new Radio();
        rad.currentStation = 10;
        int expected = 0;
        int actual = rad.nextCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPreviousCurrentStation() {
        Radio rad = new Radio();
        rad.currentStation = 1;
        int expected = 0;
        int actual = rad.previousCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPreviousCurrentStationBorder() {
        Radio rad = new Radio();
        rad.currentStation = 0;
        int expected = 9;
        int actual = rad.previousCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPreviousCurrentStationLoBorder() {
        Radio rad = new Radio();
        rad.currentStation = -1;
        int expected = 9;
        int actual = rad.previousCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 6;
        int expected = 7;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeUpBorder() {
        Radio rad = new Radio();
        rad.currentVolume = 9;
        int expected = 10;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeHiUpBorder() {
        Radio rad = new Radio();
        rad.currentVolume = 10;
        int expected = 10;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 8;
        int expected = 7;
        int actual = rad.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeLoBorder() {
        Radio rad = new Radio();
        rad.currentVolume = 1;
        int expected = 0;
        int actual = rad.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeBottomLoBorder() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        int expected = 0;
        int actual = rad.decreaseVolume();
        assertEquals(expected, actual);
    }
}
