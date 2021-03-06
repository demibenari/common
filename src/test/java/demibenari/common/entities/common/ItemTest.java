package demibenari.common.entities.common;

import demibenari.common.entities.Item;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * Created by Demi Ben-Ari on 08/10/14.
 */
public class ItemTest {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Setup before class");
    }

    @Test
    public void createEntity() {
        Item item = new Item("Some name", 100);
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Tear down after class");
    }
}
