import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartUpsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void startupInstantiates() throws Exception{
        StartUps testStartUp = new StartUps("Jeff Bezos", "Amazon", "Technology", 100);
        assertEquals(true, testStartUp instanceof StartUps);
    }
}