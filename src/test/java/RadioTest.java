import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void valueInLimit() {        //1
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valueInNotLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(-15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valueInLimitMinus() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValueMinus() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuePositive() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuePlus() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValueIncomingMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValueIncoming() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test                            //второе условие
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.next();
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBoundaruValuesMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBoundaruValuesMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test                                 //3 условие
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSwitchingPositiveMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSwitchingPreviousMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSwitchingPrevious() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test        //громкость звука 1
    public void currentVolumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeIncreaseBoundaruValuesMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeIncreaseBoundaruValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeIncreaseBoundaruValuesMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeReduction() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.reductionVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeReductionBoundaruValuesMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeReductionBoundaruValuesMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.reductionVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingVolumeExcess() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingVolumeBelow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-3);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}