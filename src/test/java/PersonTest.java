import org.junit.jupiter.api.*;

@DisplayName("Тестирование: Person")

public class PersonTest {
    private Person person;

    @BeforeAll
    static void setUpApp() {
        System.out.println("Начинаем тестирование.");
    }

    @BeforeEach
    void setPerson() {
        person = new Person(10, "Ингеборга", "Дапкунайте");
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
    @DisplayName("Тестирование проверки количества билетов у объекта")
    public void getTicket() {
        Assertions.assertEquals(10, person.getTicket());
    }

    @Test
    @DisplayName("Тестирование проверки вычитания билетов у объекта")
    public void setTicket() {
        person.setTicket();
        Assertions.assertEquals(9, person.getTicket());
    }

}
