package Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person =new Person("Иван","Таранов",10);
        assertEquals("Иван",person.getName());
    }

    @Test
    void getSecondName() {
        Person person =new Person("Иван","Таранов",10);
        assertEquals("Петровский",person.getSecondName());
    }

}