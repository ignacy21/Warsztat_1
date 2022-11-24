package COMPARING.zadania;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Adam", "Kozieratka", 23, BigDecimal.valueOf(11896)),
                new Employee("Janusz", "Bąk", 28, BigDecimal.valueOf(4321)),
                new Employee("Sebastian", "Sram", 37, BigDecimal.valueOf(3574)),
                new Employee("Jakub", "Maruda", 41, BigDecimal.valueOf(19821)),
                new Employee("Agnieszka", "Flaczek", 56, BigDecimal.valueOf(7192)),
                new Employee("Maria", "Sęp", 18, BigDecimal.valueOf(5400)),
                new Employee("Jakub", "Olej", 38, BigDecimal.valueOf(6710)),
                new Employee("Adam", "Szarak", 44, BigDecimal.valueOf(9710)),
                new Employee("Jan", "Rogacz", 99, BigDecimal.valueOf(10710)),
                new Employee("Olek", "Huncwot", 14, BigDecimal.valueOf(110710))

//                new Employee("Aa", "Aa", 1, 11),
//                new Employee("Aa", "Aa", 2, 22),
//                new Employee("Aa", "Aa", 2, 33),
//                new Employee("Bb", "Bb", 1, 33),
//                new Employee("Bb", "Aa", 2, 22),
//                new Employee("Bb", "Bb", 2, 33)
        ));

//        print(employees);
        Collections.sort(employees);
        print(employees);
        System.out.println();

        Comparator<Employee> comparingName = (o1, o2) -> o2.getName().compareTo(o1.getName());
        Comparator<Employee> comparingSurname = comparingName.thenComparing((o1, o2) -> o2.getSurname().compareTo(o1.getSurname()));
        Comparator<Employee> comparingAge = comparingSurname.thenComparing((o1, o2) -> o1.getAge() - (o2.getAge()));
        Comparator<Employee> comparingSalary = comparingAge.thenComparing((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
        Comparator<Employee> finalComparison = comparingSalary;
//        print(employees);
        employees.sort(comparingSalary);
        print(employees);
        System.out.println();


        Comparator<Employee> comparatorReverse = finalComparison.reversed();
//        print(employees);
        employees.sort(comparatorReverse);
        print(employees);


    }

    private static void print(List<Employee> employees) {
        System.out.println("### Printing employee list ###");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("### Finished printing employee list ### \n");
    }
}
