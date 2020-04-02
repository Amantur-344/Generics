package Stream;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer [] mas = new Integer[]{1,2,3,4,5};
        Stream<Integer> strmas = Stream.of(mas);
        strmas.forEach(x -> System.out.println(x * x));

        String [] masString = {"Azat","Shamil"};
        Stream<String> strmasString = Stream.of(masString);
        strmasString.forEach(x -> System.out.println(x .replaceAll("a","o")));
    }
}
