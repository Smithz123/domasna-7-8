import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet<String>();
        Set<String> mnozestvo2 = new TreeSet<String>();

        mnozestvo1.add("Eden");
        mnozestvo1.add("Dva");
        mnozestvo1.add("Tri");
        mnozestvo1.add("Cetriri");
        mnozestvo1.add("Pet");

        mnozestvo2.add("Sest");
        mnozestvo2.add("Dva");
        mnozestvo2.add("Osum");
        mnozestvo2.add("Pet");
        mnozestvo2.add("Sedum");

        System.out.println("Unija na 2 mnozestva: ");

        mnozestvo1.addAll(mnozestvo2);
        System.out.println(mnozestvo1);

    }
}
