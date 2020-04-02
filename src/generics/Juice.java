package generics;

public class Juice extends Liquid {
    public Juice() {

    }

    public Juice(Object value) {
        super(value);
    }

    @Override
    public Object getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }
}
