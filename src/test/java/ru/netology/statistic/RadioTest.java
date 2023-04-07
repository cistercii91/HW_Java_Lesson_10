package ru.netology.statistic;
import org.example.Radio;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {

    @Test
    public void inputChanelMax() {
        int expected = 8;
        Radio radio = new Radio();
        radio.setChannel(8);
        int actualResult = radio.getChannel();

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelInvalid1() {
        Radio radio = new Radio();
        radio.setChannel(-1);
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelInvalid2() {
        Radio radio = new Radio();
        radio.setChannel(10);
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelIncrease1() {
        Radio radio = new Radio();
        radio.setChannel(9);
        radio.next();
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelСhangeIncrease2() {
        Radio radio = new Radio();
        radio.setChannel(0);
        radio.next();
        int actualResult = radio.getChannel();
        int expected = 1;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelСhangeDecrease1() {
        Radio radio = new Radio();
        radio.setChannel(0);
        radio.prev();
        int actualResult = radio.getChannel();
        int expected = 9;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelСhangeDecrease2() {
        Radio radio = new Radio();
        radio.setChannel(9);
        radio.prev();
        int actualResult = radio.getChannel();
        int expected = 8;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputVolumeInput() {
        Radio radio = new Radio();
        radio.setVolume(1);
        int actualResult = radio.getVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputVolumeСhangeIncrease1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();
        int actualResult = radio.getVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputVolumeСhangeIncrease2() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int actualResult = radio.getVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputVolumeСhangeDecrease1() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.reduceVolume();
        int actualResult = radio.getVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputVolumeСhangeDecrease2() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.reduceVolume();
        int actualResult = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }
}
