import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        double armut , elma, domates,muz,patlıcan,para,para1,para2,para3,para4,toplam;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut miktarı:");
        armut = input.nextDouble();
        para = armut*2.14;
        System.out.println("Elma miktarı:");
        elma = input.nextDouble();
        para1 = elma*3.67;
        System.out.println("Domates miktarı");
        domates = input.nextDouble();
        para2 = domates*1.11;
        System.out.println("Muz miktarı:");
        muz = input.nextDouble();
        para3 = muz*0.95;
        System.out.println("Patlıcan miktarı:");
        patlıcan = input.nextDouble();
        para4 = patlıcan*5.00;

        toplam = para+para1+para2+para3+para4;
        System.out.println("Toplam tutar:"+toplam);



    }
}
