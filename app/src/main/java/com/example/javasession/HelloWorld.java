package com.example.javasession;


import java.util.Random;
import java.util.Scanner;



public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Pogodi broj (od 1 do 20), 5 pokusaja");
        System.out.println("Unesite svoje ime:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Pozzzz, "+name);
        System.out.println("Da li zelite da zapocnete igru? (DA/NE)");
        String odgovor = scanner.next();
        if(odgovor.toUpperCase().equals("DA")){
            System.out.println("Igra pocinje");
            Random random = new Random();
            int number = random.nextInt(20)+1; //od 0 do 20

            System.out.println("Unesite broj:");
            int userNumber = scanner.nextInt();
            int brojPokusaja = 1;
            while (brojPokusaja < 5){
                if(userNumber < number){
                    System.out.println("Pogadjaj vece");
                }
                else if(userNumber > number){
                    System.out.println("Pogadjaj manje");
                }
                else {
                    System.out.println("Broj je pogodjen i to je: "+number+". Bravoo!!!");
                }
                userNumber = scanner.nextInt();
                brojPokusaja++;
                if (brojPokusaja == 5){
                    System.out.println("Iskoristili ste svih 5 pokusaja!");
                }

            }


        }else if(odgovor.toUpperCase().equals("NE")){
            System.out.println("Necete da se igramo :(");
        }

    }



}
