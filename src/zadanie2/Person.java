package zadanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private final String name;
    private final String surname;
    private final String phoneNumber;

    public Person(String input) {
        String[] arrString = input.split(" ");

        if (arrString.length == 3) {
            this.name = arrString[0];
            this.surname = arrString[1];
            this.phoneNumber = arrString[2];
        }
        else {
            throw new RuntimeException("Wrong input: " + input + " you suck");
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        return phoneNumber != null ? phoneNumber.equals(person.phoneNumber) : person.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + phoneNumber;
    }
}
