import org.junit.Before;
import org.junit.Test;
import staff.managment.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Elisol", "12J3I39JK",
                80000, "CodeClan", 10000);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.1);
        assertEquals(88000, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1600, director.payBonus(), 0.0);
    }

}
