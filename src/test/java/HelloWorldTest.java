import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloTao () {
        HelloWorld helloWorld = new HelloWorld();
        String actualResult = helloWorld.greeting("tao");
        assertEquals("Hello tao", actualResult);



    }
}