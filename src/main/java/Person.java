
public class Person {

    private int ticket = 0;
    private String name;
    private String lastName;

    public Person(int ticket, String name, String lastName) {
        this.ticket = ticket;
        this.name = name;
        this.lastName = lastName;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket() {
        ticket = ticket - 1;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
