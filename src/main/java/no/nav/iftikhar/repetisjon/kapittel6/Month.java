package no.nav.iftikhar.repetisjon.kapittel6;

public class Month {

    public static String getMonth(int month) {
        switch (month){
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
            default: return "Ugyldig nummer på måned, prøv med heltall fra 1 - 12, det finnes kun 12 måneder i året for de fleste av oss";
        }
    }

    public static int getMonth(String month) {
        switch (month) {
            case "Januar":
                return 1;
            case "Februar":
                return 2;
            case "Mars":
                return 3;
            case "April":
                return 4;
            case "Mai":
                return 5;
            case "Juni":
                return 6;
            case "Juli":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "Oktober":
                return 10;
            case "November":
                return 11;
            case "Desember":
                return 12;
            default:
                return 0;
        }
    }
}
