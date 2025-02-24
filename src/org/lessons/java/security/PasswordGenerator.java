package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("inserisci nome");
        String nome = s.nextLine();

        System.out.println("inserisci cognome");
        String cognome = s.nextLine();

        System.out.println("inserisci colore preferito");
        String colore = s.nextLine();

        System.out.println("inserisci giorno di nascita");
        int giorno = s.nextInt();
        sum += giorno;
        
        System.out.println("inserisci mese di nascita");
        int mese = s.nextInt();
        sum += mese;

        System.out.println("inserisci anno di nascita");
        int anno = s.nextInt();
        sum += anno;

        String psw = nome+"-"+cognome+"-"+colore+"-"+sum;
        System.out.println("la tua password è: "+ psw);
        s.close();
    }    
}
