package Domaci;

import java.util.Scanner;

public class DomaciSedam {
    public static void main(String[] args) {
        //Napraviti program gde unosite neki broj i kao rezultat
        // vracate njegov faktorijel.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj");
        int x = sc.nextInt();
        int faktorijel = 1;
        for (int i = 1; i <= x; i++){
            faktorijel = faktorijel * i;

        }
        System.out.println("Faktorijel broja koji ste uneli je " + faktorijel);
        System.out.println("Kraj programa");
    }

}
