//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 35;
        int sayi3 = 25;

        if (sayi1 < sayi2 && sayi2 > sayi3) {
            System.out.println("sayi 2 en buyuktur");

        } else if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("sayi1 en buyuktur");


        }
        if (sayi1 < sayi3 && sayi2 < sayi3) {
            System.out.println("sayi3 en buyuktur");

        }
    }
}