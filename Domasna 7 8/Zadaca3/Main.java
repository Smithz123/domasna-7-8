import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SportskiKlub> klubovi = new ArrayList<SportskiKlub>();
        SportskiKlub suns = new SportskiKlub("Suns", "Kosarka", 15);
        SportskiKlub pelister = new SportskiKlub("Pelister", "Fudbal", 15);
        SportskiKlub vardar = new SportskiKlub("Vardar", "Fudbal", 20);
        SportskiKlub lakers = new SportskiKlub("Lakers", "Kosarka", 15);

        klubovi.add(suns);
        klubovi.add(pelister);
        klubovi.add(vardar);
        klubovi.add(lakers);

        Comparator<SportskiKlub> mainComparator = new Comparator<SportskiKlub>() {
            @Override
            public int compare(SportskiKlub o1, SportskiKlub o2) {
                return o1.getImeNaKlub().compareTo(o2.getImeNaKlub());
            }
        };

        klubovi.sort(mainComparator);

        for(SportskiKlub k : klubovi){
            System.out.println(k.getImeNaKlub());
            System.out.println(k.getSport());
            System.out.println(k.getClenovi() + "\n");
        }

    }
}
