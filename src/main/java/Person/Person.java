package Person;


public class Person {
    private String name;
    private String secondName;
    private int tickets;

    public Person(String name, String secondName, int tickets) {
        this.name = name;
        this.secondName = secondName;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getTickets() {
        return tickets;
    }

    public int setTickets(int tickets) {
        this.tickets = tickets - 1;
        return tickets;
    }

}