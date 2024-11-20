/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NagyDominik(Szf_N_20
 */
public class KoPapirOllo{
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Válassz! (kő/papír/olló) (Kérlek használj kis betüket)");
       String jatekos = scanner.nextLine();


       Random random = new Random();
       int randomSzam = random.nextInt(3);

       String gepValaszt;
       if (randomSzam == 0) {
           gepValaszt = "Kő";
       } else if (randomSzam == 1) {
           gepValaszt = "Papír";
       } else {
           gepValaszt = "Olló";
       }
       System.out.println("A gép választása: " + gepValaszt + "!");

       if (jatekos.equals("kő")) {
           if (gepValaszt.equals("Papír")) {
               System.out.println("A gép nyert!");
           } else if (gepValaszt.equals("Olló")) {
               System.out.println("Te nyertél!");
           } else {
               System.out.println("Döntetlen!");
           }
       } else if (jatekos.equals("papír")) {
           if (gepValaszt.equals("Olló")) {
               System.out.println("A gép nyert!");
           } else if (gepValaszt.equals("Kő")) {
               System.out.println("Te nyertél!");
           } else {
               System.out.println("Döntetlen!");
           }
       } else if (jatekos.equals("olló")) {
           if (gepValaszt.equals("Kő")) {
               System.out.println("A gép nyert!");
           } else if (gepValaszt.equals("Papír")) {
               System.out.println("Te nyertél!");
           } else {
               System.out.println("Döntetlen!");
           }
       } else {
           System.out.println("Érvénytelen választás!");
       }
    }
}