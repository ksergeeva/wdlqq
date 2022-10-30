import Person.Person;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private Person person;

        @BeforeEach
        void setUp() {
            person= new Person("Иван ", "Таранов ", 10);
            assertEquals(10,person.setTickets(10)); }

}