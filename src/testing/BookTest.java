package testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @BeforeEach
    void init(){
        System.out.println("Starting a test");
    }

    @AfterEach
    void passed(){
        System.out.println("Test passed");
    }

    @AfterAll
    static void all(){
        System.out.println("Testing is done");
    }

    @Test
    @DisplayName("Get page method test")
    @Disabled
    void getPage(){

        //Given
        Book book1 = new Book(345,"Java Tutorials");

        //When
        int result = book1.getPage();

        //Then
        assertEquals(true,result > 200);
        System.out.println("This is getPage test method running");

    }

    @Test
    @DisplayName("Get Title page method test")
    void getTitle(){

        //Given & When
        Book book1 = new Book(101, "Java tutorial");

        //When
        assertEquals("Java tutorial", book1.getTitle());
        System.out.println("This is getTitle test method running");

    }

}