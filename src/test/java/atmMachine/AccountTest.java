package atmMachine;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
    }

    @Test
    @DisplayName("Testing withdraw")
    void withdraw(){
        Account account = new Account();
        assertTrue(true, String.valueOf(account));
    }

    @Test
    @DisplayName("Testing balance")
    void balance(){
        Account account = new Account();
        assertTrue(true, String.valueOf(account));
    }

    @Test
    @DisplayName("Testing anotherTransaction")
    void anotherTransaction(){
        Account account = new Account();
        assertTrue(true, String.valueOf(account));
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
