package demibenari;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * Created by demi on 08/10/14.
 */
public class EntityTest {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Setup before class");
    }

    @Test
    public void createEntity() {
        Entity entity = new Entity("Some name", 100);
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Tear down after class");
    }
}
