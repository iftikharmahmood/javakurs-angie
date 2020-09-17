package kapittel11;


public class Geometri {


}



/** public Geometri(int a, int b) {

 }

 @Override
 static double trekant(int a, int b) {

 //loop for antall rader
 for (int rader = 1; rader < 50; rader++) {

 // lop for mellomrom
 for (int mellomrom = 50; mellomrom >= rader; mellomrom--) {
 System.out.print(" ");
 }

 //loop for å skrive ut stjerner på hver rad
 for (int mellomrom = 1; mellomrom <= rader; mellomrom++) {
 System.out.print("* ");
 }
 System.out.println();
 }
 double c = (a*a)+(b*b);
 return c;

 }


 @Override
 double trekant(int a, int b) {
 //Former trekan = new Geometri(a,b);
 //loop for antall rader
 for (int rader = 1; rader < 50; rader++) {

 // lop for mellomrom
 for (int mellomrom = 50; mellomrom >= rader; mellomrom--) {
 System.out.print(" ");
 }

 //loop for å skrive ut stjerner på hver rad
 for (int mellomrom = 1; mellomrom <= rader; mellomrom++) {
 System.out.print("* ");
 }
 System.out.println();
 }
 double c = (a*a)+(b*b);
 return c;
 }

 @Override
 static void Former.kube() {
 return 0;
 }

 @Override
 static double sirkel(double radius) {
 return super.sirkel(radius);
 }

 public String skrivUt() {
 return super.skrivUt();
 }


 public static void main (String args[]){

 System.out.println(Geometri.trekant(10,15));

 System.out.println(Geometri.sirkel(25));

 System.out.println(Geometri.kube(10, 25, 15));

 } */

