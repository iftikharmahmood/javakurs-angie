package no.nav.iftikhar.kapittel6;


/*
* Examples of methode overload
* programmet viser hvordan vi kan bruke
 */
public class Maaned {

    public static String getMaaned(int maaned){
        switch (maaned){
            case 1: return "Januar";
            case 2: return "Februar";
            case 3: return "Mars";
            case 4: return "April";
            case 5: return "Mai";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "August";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Desember";
            default: return "Feil måned, vennligst tast inn et heltall mellom 1 og 12.";

        }
    }
    public static int getMaaned(String maaned){
        switch (maaned){
            case "Januar":
            case "januar":
                return 1;
            case "Februar":
            case "februar":
                return 2;
            case "Mars":
            case "mars":
                return 3;
            case "April":
            case "april":
                return 4;
            case "Mai":
            case "mai":
                return 5;
            case "Juni":
            case "juni":
                return 6;
            case "Juli":
            case "juli":
                return 7;
            case "August":
            case "august":
                return 8;
            case "September":
            case "september":
                return 9;
            case "Oktober":
            case "oktober":
                return 10;
            case "November":
            case "november":
                return 11;
            case "Desember":
            case "desember":
                return 12;
            default: return -1; //"Feil!, vennligst oppgi gyldig månedsnavn mellom januar og desember";
        }
    }
}
