package Domaci;

import java.util.Scanner;

public class DomaciDevetWhile {
    public static void main(String[] args) {
//         int i = 10;
//        while (i<3) {
//            System.out.println("World");
//            i++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi neki broj");
        int broj = sc.nextInt();
        int zbir = 0;
        while (zbir<broj){
            zbir++;
        }
        System.out.println("Zbir je " + zbir);
    }

}
