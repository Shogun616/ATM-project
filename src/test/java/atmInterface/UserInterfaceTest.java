package atmInterface;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class UserInterfaceTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
    }

    @Test
    @DisplayName("Testing exit")
    void exit() {
        assertTrue(UserInterface.exit(true, true));
    }

    @Test
    @DisplayName("Testing menu")
    void menu() {
        UserInterface userInterface = new UserInterface();
        assertNotEquals("0", userInterface);
        assertNotEquals("1", userInterface);
        assertNotEquals("2", userInterface);
    }

    @Test
    @DisplayName("Testing InputMismatchException")
    void verifyInputMismatchExceptionIsThrown() {

        String input = "bad input";

        // Här fejkar vi användarinput genom att ändra inputstream från konsolen till variabeln input ovan
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(NoSuchElementException.class, UserInterface::readInteger);
    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }
}
