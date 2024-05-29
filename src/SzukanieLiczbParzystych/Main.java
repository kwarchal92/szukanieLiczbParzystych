package SzukanieLiczbParzystych;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<String> liczby = Arrays.asList("1","2","3","4","5","6","7","8","9","10");

        System.out.println("Lista oryginalna: " + liczby + ".");

        List<Integer> parzyste = liczby.stream()
                .map(s -> Integer.valueOf(s))
                .filter(liczba -> liczba %2 ==0)
                .collect(Collectors.toList());

        System.out.println("");

        System.out.println("Lista przetworzona, wyswietla tylko liczby parzyste: " + parzyste + ".");
    }
}
