import org.junit.Test;

import static org.junit.Assert.*;

public class mainTest {
    @Test
    public void primerPiso() {
        int a= main.generatePerson();
        assertEquals(1,a);

    }
    @Test
    public void segundoPiso() {
        int a=main.generatePerson();
        assertEquals(2,a);

    }
    @Test
    public void tercerPiso() {
        int a=main.generatePerson();
        assertEquals(3,a);

    }

}