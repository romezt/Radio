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
    void shouldNextCurrentStation() {
        Radio rad = new Radio();
        rad.currentStation = 8;
        int expected = 9;
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
        rad.currentVolume = 8;
        int expected = 9;
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



}
