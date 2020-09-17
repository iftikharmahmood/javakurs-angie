package kapittel2;

import java.util.Scanner;

public class MadLibs1 {

    public static void main(String args[]){
       //1. Spørr etter årstid
        System.out.println("Tast inn en tilfeldig årstid");
        Scanner scanner = new Scanner(System.in);
        String aarstid = scanner.nextLine();

        //2. spørr etter et adjektiv
        System.out.println("Tast inn et adjektiv");
        String adjektiv = scanner.nextLine();

       //3. spørr etter et heltall
        System.out.println("Tast et vilkårlig heltall");
        int antallKaffeKopper = scanner.nextInt();
        scanner.close();

       //4. kompletter en setning med de innleste verdiene
        System.out.println("På en hvilken som helst "+adjektiv+" dag i "+aarstid+" drikker jeg minst "+antallKaffeKopper+" kaffekopper.");
    }
}
