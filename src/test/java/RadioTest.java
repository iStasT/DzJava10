import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.neyology.domain.Radio;

public class RadioTest {

    @Test
    public void TestBorders() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBorders2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBorders3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBorders4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBorders5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBorders6() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBorders7() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNext2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNext3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNext4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNext5() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNext6() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrev2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrev3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrev4() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prevStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBordersVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBordersVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBordersVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBordersVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);


        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBordersVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);


        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBordersVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBordersVolume7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();


        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.increaseVolume();


        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestIncreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestIncreaseVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();


        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.decreaseVolume();


        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestDecreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(54);

        radio.decreaseVolume();


        int expected = 53;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestDecreaseVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.decreaseVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestDecreaseVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestDecreaseVolume7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}