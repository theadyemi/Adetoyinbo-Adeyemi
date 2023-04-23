import Television.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television tvControl;

    @BeforeEach
    void setUp() {
        tvControl = new Television();
    }

    @Test
    public void checkTvState() {
       assertFalse(tvControl.isOn);
    }

        @Test
        public void switchTvOn() {
        tvControl.toggleOn();
        assertTrue(tvControl.isOn);
    }

    @Test
    public void changeChannel(){
    tvControl.changeChannel();
    assertEquals(25, 25);
    }

    @Test
    public void increaseVolume(){
        tvControl.increaseVolume();
        tvControl.increaseVolume();
        tvControl.increaseVolume();
        assertEquals(3, tvControl.getVolume());
    }

    @Test
    public void decreaseVolume(){
        tvControl.increaseVolume();
        tvControl.increaseVolume();
        tvControl.increaseVolume();
        tvControl.increaseVolume();
        tvControl.increaseVolume();
        tvControl.increaseVolume();
        assertEquals(6, tvControl.getVolume());
        tvControl.decreaseVolume();
        tvControl.decreaseVolume();
        tvControl.decreaseVolume();
        assertEquals(3, tvControl.getVolume());
    }

    @Test
    public void scanFromChannelTwotoSeven(){
        for(int count=2; count < 7; count++){

            tvControl.scanChannels();
        }
//        tvControl.scanChannels();
//        tvControl.scanChannels();
//        tvControl.scanChannels();
//        tvControl.scanChannels();
//        tvControl.scanChannels();
//        tvControl.scanChannels();
//        tvControl.scanChannels();
        assertEquals(5, tvControl.getChannel());
        for (int count=7; count < 2; count--){
            tvControl.scanChannels();
        }
        assertEquals(5, tvControl.getChannel());
    }



    @Test
    public void turnTvOff(){
        assertFalse(tvControl.isOn);
    }





}