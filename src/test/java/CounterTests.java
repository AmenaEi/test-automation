import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.UnityCommand.AltLoadSceneParams;
import org.junit.jupiter.api.*;

import java.io.IOException;

public class CounterTests {

    private static AltDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new AltDriver();
    }

    @BeforeEach
    public void resetScene() {
        driver.loadScene(
                new AltLoadSceneParams.Builder("SampleScene").build()
        );
    }

    public static void tearDown() throws IOException {
        driver.stop();
    }

    private AltObject findByName(String name) {
        return driver.findObject(
                new AltFindObjectsParams.Builder(AltDriver.By.NAME, name).build()
        );
    }

    @Test
    public void testButtonIsInteractable() {
        AltObject button = findByName("Button");

        Assertions.assertTrue(button.isEnabled(), "Count button should be interactable");
    }

    @Test
    public void testCountIncreasesOnClick() {
        AltObject button = findByName("Button");
        AltObject counter = findByName("CountText");
        int before = Integer.parseInt(counter.getText());
        button.tap();
        int after = Integer.parseInt(counter.getText());

        Assertions.assertTrue(after > before, "Count should increase after clicking the button");

    }

    @Test
    public void testCorrectClickCount() {
        AltObject button = findByName("Button");
        AltObject counter = findByName("CountText");
        Integer check = 10;

        for (int i = 0; i < check; i++) {
            button.tap();
        }

        Assertions.assertEquals(check.toString(), counter.getText(), "Count should be " + check + " after " + check + " clicks");
    }
}