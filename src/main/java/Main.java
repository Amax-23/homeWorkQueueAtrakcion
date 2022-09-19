import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> people = new ArrayDeque<>();
        people.addAll(generateClients());
        while (!people.isEmpty()) {
            Person name = people.pop();
            if (name.getTicket() > 0) {
                name.setTicket();
                System.out.println(name + " прокатился на атракционе.");
                people.addLast(name);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Николас", "Здравускайте"));
        people.add(new Person(2, "Апполинария", "Новохудоносова"));
        people.add(new Person(3, "Лориэрик", "Константинопольский"));
        people.add(new Person(2, "Максимилиан", "Христорождественский"));
        people.add(new Person(1, "Евфросиния", "Вкосмослетающая"));
        people.add(new Person(5, "Розенкранций", "Говорящийсдраконами"));
        return people;
    }
}