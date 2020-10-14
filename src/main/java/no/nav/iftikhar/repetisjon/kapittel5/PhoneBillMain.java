package no.nav.iftikhar.repetisjon.kapittel5;

public class PhoneBillMain {

    public static void main(String[] args) {

        PhoneBill faktura = new PhoneBill();
        faktura.lagFaktura();
        faktura.getScanner().close();
    }
}
