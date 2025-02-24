package org.lessons.java.security;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String psw;
        
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        int i = r.nextInt(AlphaNumericStr.length());
        char randomLetter = AlphaNumericStr.charAt(i);


        System.out.println("inserisci nome");
        String nome = s.nextLine();
        int iRandomName = r.nextInt(nome.length());
        
        System.out.println("inserisci cognome");
        String cognome = s.nextLine();
        int iRandomSurname = r.nextInt(cognome.length());

        System.out.println("inserisci colore preferito");
        String colore = s.nextLine();
        int iRandomColor = r.nextInt(colore.length());

        System.out.println("inserisci giorno di nascita");
        int giorno = s.nextInt();

        System.out.println("inserisci mese di nascita");
        int mese = s.nextInt();

        System.out.println("inserisci anno di nascita");
        int anno = s.nextInt();
        

        //prima psw
        psw = ""+nome.charAt(iRandomName)+ cognome.charAt(iRandomSurname)+colore.charAt(iRandomColor)+giorno+mese+anno+randomLetter;

        System.out.println("la tua password è: "+ psw);
        s.close();
    }
}
