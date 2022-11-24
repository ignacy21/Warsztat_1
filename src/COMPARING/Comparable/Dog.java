package COMPARING.Comparable;

public class Dog implements Comparable<Dog> {

    private final String name;
    private final Integer id;

    public Dog(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return " Dog:" + id + ", " + name;
    }

    @Override
    public int compareTo(Dog o) {
        int result = this.id - o.id;
        if (result != 0) {
            return result;
        }
        return this.name.compareTo(o.name);
    }
}
