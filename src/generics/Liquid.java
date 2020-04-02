package generics;

public class Liquid <T> {
    private T value;

    public Liquid(){
    }

    public Liquid(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
