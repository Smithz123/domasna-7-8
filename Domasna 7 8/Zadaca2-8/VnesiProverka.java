import java.util.HashMap;
import java.util.Map;

public class VnesiProverka {
    Map<String, String> recnik = new HashMap<>();

    public VnesiProverka() {
        recnik.put("hi", "здраво");
        recnik.put("bye", "чао");
        recnik.put("time", "време");
        recnik.put("monitor", "монитор");
        recnik.put("router", "рутер");
    }

    public void VnesIPrevod(String zbor){

        String prevod = recnik.get(zbor);
        Prevod(zbor, prevod);

    }

    public void Prevod(String zbor, String prevod){
        if (prevod != null) {
            System.out.println("\nVrednosta na " + zbor + " e: " + prevod);
        } else {
            System.out.println("\nZborot " + zbor + " ne postoi vo recnikot.");
        }
    }
}