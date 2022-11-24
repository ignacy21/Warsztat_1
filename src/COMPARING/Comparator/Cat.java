package COMPARING.Comparator;

public  class Cat {

    private final Integer id;
    private final String name;

    public Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " +
                id +
                ", " +
                name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
