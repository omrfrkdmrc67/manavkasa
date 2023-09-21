import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut alacaksınız: ");
        armut = input.nextDouble();

        System.out.print("Kaç kilo elma alacaksınız: ");
        elma = input.nextDouble();

        System.out.print("Kaç kilo domates alacaksınız: ");
        domates = input.nextDouble();

        System.out.print("Kaç kilo muz alacaksınız: ");
        muz = input.nextDouble();

        System.out.print("Kaç kilo patlıcan alacaksınız: ");
        patlican = input.nextDouble();

        double ucret = (armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.0);
        System.out.println("Tüm alışverişiniz " + ucret + " Türk Lirası tutmuştur.");
    }
}