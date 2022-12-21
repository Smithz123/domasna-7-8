import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        VnesiProverka vnesiProverka = new VnesiProverka();
        Scanner scanner = new Scanner(System.in);

        int br = 1;

        while(br == 1) {
            System.out.println("1. Prevod" +
                    "\n2. Iskluci");

            br = scanner.nextInt();

            if(br == 1) {

                System.out.println("\nVnesi zbor koj sakate da se prevedi:");
                vnesiProverka.VnesIPrevod(scanner.next());

            }
        }
        System.out.println("\nPozdrav.");
    }
}
