package zadanie2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> peopleList = new ArrayList<>(Arrays.asList(
                "Jerzy Kowalski +48000921891",
                "Jan Kowalski +48000192871",
                "Stefan Nawrocki +48000125847",
                "Anna Tomaszewska +48000421458",
                "Majcej Zadrożny +48000987234",
                "Kuba Zadrożny +48000914590"
        ));
        List<Person> personList = new ArrayList<>();

        for (String onePeople : peopleList) {
            personList.add(new Person(onePeople));
        }

        Map<String, List<Person>> phoneBook = new TreeMap<> (Comparator.naturalOrder());


        List<String> surnames = new ArrayList<>();
        for (Person person : personList) {
            surnames.add(person.getSurname());
        }
        for (String surname : surnames) {
            List<Person> p = new ArrayList<>();
            for (Person person : personList) {
                if (Objects.equals(surname, person.getSurname())) {
                    p.add(person);
                    p.sort((p1, p2) ->p1.getName().compareTo(p2.getName()));
                    phoneBook.put(surname, p);
                }
            }
        }

        // DRUKOWANKO
        for (Map.Entry<String, List<Person>> stringListEntry : phoneBook.entrySet()) {
            System.out.println(stringListEntry);
        }
    }
}
