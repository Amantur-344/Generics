package Steams2;

import java.util.HashMap;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        HashMap <Integer, String> streams = new HashMap<>();
        streams.put(0,"Mercedes");
        streams.put(1,"BMW");
        streams.put(2, "Honda");
        streams.put(3,"Volkswagen");
        streams.put(4,"Ford");
        streams.put(5,"Nissan");
        streams.put(6,"Hyundai");
        streams.put(7,"Audi");
        streams.put(8,"Porsche");
        streams.put(9,"Lexus");

        Stream<HashMap<Integer, String>> integerStream = Stream.of(streams);
        integerStream.forEach(x ->);
    }
}
