package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("inserisci nome");
        String nome = s.nextLine();

        System.out.println("inserisci cognome");
        String cognome = s.nextLine();

        System.out.println("inserisci colore preferito");
        String colore = s.nextLine();

        System.out.println("inserisci giorno di nascita");
        int giorno = s.nextInt();

        System.out.println("inserisci mese di nascita");
        int mese = s.nextInt();

        System.out.println("inserisci anno di nascita");
        int anno = s.nextInt();

        String psw = nome+"-"+cognome+"-"+colore+"-"+giorno+"-"+mese+"-"+anno;
        System.out.println("la tua password è: "+ psw);
        s.close();
    }    
}
