import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Elisol", "12J3I39JK",
                80000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.1);
        assertEquals(88000, developer.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(800, developer.payBonus(), 0.0);
    }
}
