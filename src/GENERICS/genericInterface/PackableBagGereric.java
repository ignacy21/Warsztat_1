package GENERICS.genericInterface;

public class PackableBagGereric<T> implements Packable<T> {

    @Override
    public void pack(T element) {

    }

    @Override
    public T empty() {
        return null;
    }
}
