import org.junit.jupiter.api.*;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Тестирование: Main")
public class MainTest {
    Deque<Person> people = new ArrayDeque<>();

    @BeforeAll
    static void setUpApp() {
        System.out.println("Начинаем тестирование.");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Тест запускается.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Тест завершен ОК");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Все тесты пройдены.");
    }

    @Test
    @DisplayName("Тестирование генератора Коллекции")
    void generateClients() {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person(1, "Николас", "Здравускайте"));
        people.addAll(peopleList);
        Assertions.assertEquals(people.size(), peopleList.size());
        Assertions.assertEquals(1, peopleList.size());
        Assertions.assertEquals(1, people.size());
    }
}
