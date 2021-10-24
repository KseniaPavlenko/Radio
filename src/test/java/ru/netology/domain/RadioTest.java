package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.net.PortUnreachableException;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldGetMinNumberRadioStation() {
        Radio rad = new Radio();

        int actual = rad.getMinNumberRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMaxNumberRadioStation() {
        Radio rad = new Radio();

        int actual = rad.getMaxNumberRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinSoundVolume() {
        Radio rad = new Radio();

        int actual = rad.getMinSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void getMaxSoundVolume() {
        Radio rad = new Radio();

        int actual = rad.getMaxSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumber5() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationLessMinNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationMinNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationNumber1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationNumber8() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationMaxNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationMoreMaxNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationUnknownNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(500);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        Radio rad = new Radio();

        rad.decreaseRadioStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio rad = new Radio();

        rad.increaseRadioStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);

    }
}
