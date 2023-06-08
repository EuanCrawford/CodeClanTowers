import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Wilfred", "Bob", 14);
    }

    @Test
    public void hasShoeSize(){
        assertEquals(14, guest.getShoeSize());
    }
}
