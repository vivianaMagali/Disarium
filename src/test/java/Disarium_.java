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


}
