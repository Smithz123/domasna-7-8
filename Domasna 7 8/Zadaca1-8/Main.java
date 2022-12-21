import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){
                Map<String, String> recnik = new HashMap<>();

                recnik.put("hi", "здраво");
                recnik.put("bye", "чао");
                recnik.put("time", "време");
                recnik.put("monitor", "монитор");
                recnik.put("router", "рутер");

                System.out.println("Pecatenje na klucevi:");
                for (String kluc : recnik.keySet()) {
                    System.out.println(kluc);
                }

                System.out.println("\nPecatenje na vrednosti:");
                for (String vrednost : recnik.values()) {
                    System.out.println(vrednost);
                }

                System.out.println("\nPecatenje na klucevi i vrednosti:");
                for (Map.Entry<String, String> entry : recnik.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }

                String vrednost = recnik.get("hi");
                if (vrednost != null) {
                    System.out.println("\nVrednosta na hi e: " + vrednost);
                } else {
                    System.out.println("\nZborot hi ne postoi vo recnikot.");
                }
    }
}
