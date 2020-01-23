import org.junit.Test;

public class Disarium_ {

    @Test(expected = IndexOutOfBoundsException.class)
    public void if_number_is_less_than_0_return_exception(){
        Disarium.disarium(-5);
    }
}
