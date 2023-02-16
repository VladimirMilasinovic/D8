package Domaci;

import java.util.Scanner;

public class DomaciDevetFor {
    public static void main(String[] args) {
//        1. Napraviti program gde cete uneti neki broj i kao rezultat
//        vratiti zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi neki broj");
        int broj = sc.nextInt();
        int zbir = 0;
        for (int i = 0; i < broj; i++){
            zbir++;
        }
        System.out.println("Zbir je " + zbir);
    }
}
