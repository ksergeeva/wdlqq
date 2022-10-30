import Person.Person;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) throws RuntimeException {
        Deque<Person> Attraction = new ArrayDeque<>(generateClients());
        while (!Attraction.isEmpty()) {
            Person visitor = Attraction.poll();
            int tickets = visitor.getTickets();
            if (tickets > 0) {
                System.out.println("Доступно для использования ");
                System.out.println(visitor.getName());
                System.out.println(visitor.getSecondName());
                System.out.println(visitor.getTickets());
                visitor.setTickets(tickets);
                Attraction.offer(visitor);
            }
        }
        System.out.println("Билетов нет");


    }

    private static List<Person> generateClients() {
        ArrayList<Person> people = new ArrayList<>();
        Person people1 = new Person("Иван ", "Таранов ", 10);
        Person people2 = new Person("Людка", "Стеклова", 14);
        Person people3 = new Person("Валера", "Пузырев", 5);
        Person people4 = new Person("Саша", "Довыдов", 9);
        Person people5 = new Person("Лида", "Воронина", 21);
        people.add(people1);
        people.add(people2);
        people.add(people3);
        people.add(people4);
        people.add(people5);
        return people;
    }
}