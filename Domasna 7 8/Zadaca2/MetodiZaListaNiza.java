import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MetodiZaListaNiza {
    ArrayList<String> niza = new ArrayList<String>();

    public void ListaVoArray(){
        niza.add("eden");
        niza.add("dva");
        niza.add("tri");
        niza.add("cetri");
        niza.add("pet");

        String arr[] = niza.toArray(new String[niza.size()]);

        System.out.println("Od lista vo array");
        for(String s : arr){
            System.out.println(s);
        }
    }

    public void ArrayVoLista(){
        niza.clear();

        String arr[] = {"one", "two", "three", "four", "five"};

        Collections.addAll(niza, arr);

        System.out.println("\nOd array vo niza");
        for(String s : arr){
            System.out.println(s);
        }
    }

}