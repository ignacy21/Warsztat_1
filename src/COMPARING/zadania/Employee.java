package COMPARING.zadania;

import java.math.BigDecimal;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final String surname;
    private final Integer age;
    private final BigDecimal salary;

    public Employee(String name, String surname, Integer age, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                name +
                " " + surname +
                " age: " + age +
                ", salary:" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        int result = this.name.compareTo(emp.name);
        if (!this.name.equals(emp.name)) {
            return result;
        }
        int result1 = emp.surname.compareTo(this.surname);
        if (!this.surname.equals(emp.surname)) {
            return result1;
        }
        int result2 = this.age.compareTo(emp.age);
        if (!emp.age.equals(this.age)) {
            return result2;
        }
        int result3 = emp.salary.compareTo(this.salary);
        return result3;
    }

}
