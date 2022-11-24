package GENERICS.AmojeCwiczenia;

public class Tea {

    private final String type;
    private final String flavour;

    public Tea(String type, String flavour) {
        this.type = type;
        this.flavour = flavour;
    }

    public String getType() {
        return type;
    }

    public String getFlavour() {
        return flavour;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "type='" + type + '\'' +
                ", flavour='" + flavour + '\'' +
                '}';
    }
}
