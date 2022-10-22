import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi,yaricap,alan,cevre,dilimalani;
        int aci;
        pi =3.14;
        System.out.print("Lütfen yarıçap değerini giriniz : ");
        Scanner scanner = new Scanner (System.in);
        yaricap = scanner.nextDouble();
        alan = (pi*yaricap*yaricap);
        cevre = (2*pi*yaricap);
        System.out.println("Alan = " + alan);
        System.out.println("Cevre = " + cevre);
        System.out.print("Lütfen daire diliminin açısını giriniz : ");
        aci = scanner.nextInt();
        dilimalani = (pi*(yaricap*yaricap)*aci)/360;
        System.out.println("Daire Diliminin Alanı = " + dilimalani);




    }
}