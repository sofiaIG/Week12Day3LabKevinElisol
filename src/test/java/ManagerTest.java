import org.junit.Before;
import org.junit.Test;
import staff.managment.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Elisol", "12J3I39JK",
                80000, "CodeClan");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.1);
        assertEquals(88000, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(800, manager.payBonus(), 0.0);
    }

    @Test
    public void nameNull(){
        manager.setName(null);
        assertEquals("Elisol", manager.getName());
    }



}
