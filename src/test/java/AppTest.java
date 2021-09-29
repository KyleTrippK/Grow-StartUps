import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void adittionAddsCorreclty(){
        App app = new App();
        int a = app.addition(5, 8);
        assertEquals(13, a);
    }

}