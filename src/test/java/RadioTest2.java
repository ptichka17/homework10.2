import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioNumberTest {

    @Test
    public void switchRadio() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(20);

        int expected = 20;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioboundaryValue() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioboundaryValueNext() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}