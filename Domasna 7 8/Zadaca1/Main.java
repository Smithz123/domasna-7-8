import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<String> lekovi = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        int br;
        String lek;

        System.out.println("Kolku lekovi sakate da vnesete?");
        br = scanner.nextInt();

        for(int i = 0; i < br; i++){

            System.out.println("\nVnesete lek:");

            lek = scanner.next();
            lekovi.add(lek);

        }

        String posleden = lekovi.get(lekovi.size() - 1);

        if(posleden.equals("Paracetamol")){

            System.out.println("Лекот помага за намалување на телесната температура.");

        }else {

            System.out.println("Намената на лекот е непозната!");

        }
    }
}
