import org.junit.Test;
import static org.junit.Assert.*;

public class Disarium_ {

    @Test(expected = IndexOutOfBoundsException.class)
    public void if_number_is_less_than_0_return_exception(){
        Disarium.disarium(-5);
    }

    @Test
    public void if_number_is_an_unique_decimal(){
        assertEquals(Disarium.disarium(5),"Disarium");
    }

    @Test
    public void if_number_is_two_decimal_and_is_not_disarium(){
        assertEquals(Disarium.disarium(11),"Not disarium");
    }

    @Test
    public void if_number_is_two_decimal_and_is_disarium(){
        assertEquals(Disarium.disarium(89),"Disarium");
    }

    @Test
    public void if_number_is_any_number_decimal(){
        assertEquals(Disarium.disarium(349),"Not disarium");
        assertEquals(Disarium.disarium(175),"Disarium");
    }


}
