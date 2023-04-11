package ru.netology.statistic;
import org.example.Radio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class RadioTest {

    // тесты для каналов по конструктору без задачи количества каналов (по умолчанию)
    @Test
    public void inputChanelMax() { //
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

    // тесты для каналов по конструктору с задачей количества каналов
    // _____________________________
    @Test
    public void inputChanelWithConstructor() { //задача канала через сет, корректный ввод
        int expected = 8;
        Radio radio = new Radio(9);
        radio.setChannel(8);
        int actualResult = radio.getChannel();

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelInvalidWithConstructor1() { //задача канала через сет, некорректный ввод 1
        Radio radio = new Radio(10);
        radio.setChannel(-1);
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelInvalidWithConstructor2() { //задача канала через сет, некорректный ввод 2
        Radio radio = new Radio(8);
        radio.setChannel(10);
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelInvalidWithConstructor3() { //задача канала через сет, некорректный ввод 3
        Radio radio = new Radio(0);
        radio.setChannel(9);
        int actualResult = radio.getChannel();
        int expected = 9;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelInvalidWithConstructor4() { //задача канала через сет, некорректный ввод 4
        Radio radio = new Radio(0);
        radio.setChannel(0);
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelInvalidWithConstructor5() { //задача канала через сет, некорректный ввод 5
        Radio radio = new Radio(-1);
        radio.setChannel(0);
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelIncreaseWithConstructor1() { //переключение канала через метод +, вариант 1
        Radio radio = new Radio(10);
        radio.setChannel(9);
        radio.next();
        int actualResult = radio.getChannel();
        int expected = 0;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelСhangeIncreaseWithConstructor2() { //переключение канала через метод +, вариант 2
        Radio radio = new Radio(10);
        radio.setChannel(0);
        radio.next();
        int actualResult = radio.getChannel();
        int expected = 1;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelСhangeDecreaseWithConstructor1() { //переключение канала через метод -, вариант 1
        Radio radio = new Radio(10);
        radio.setChannel(0);
        radio.prev();
        int actualResult = radio.getChannel();
        int expected = 9;

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void inputChanelСhangeDecreaseWithConstructor2() { //переключение канала через метод -, вариант 2
        Radio radio = new Radio(10);
        radio.setChannel(9);
        radio.prev();
        int actualResult = radio.getChannel();
        int expected = 8;

        Assertions.assertEquals(expected, actualResult);
    }

    // тесты написанные для переменной звука
    //-----------------------------------------------------------------
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
