import java.util.Scanner;
public class TestAir {
    public static void main(String[]args){
        Aircraft air=new Aircraft();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фирму: ");
        String n= in.next();
        air.setFirma(n);
        System.out.println("Введите максимальную скорость: ");
        int s= in.nextInt();
        air.setMaxSpeed(s);
        System.out.println(air.getFirma()+" "+air.getMaxSpeed());
        System.out.println();

        Plane pl1=new Plane("name",453,"model",50);
        Plane pl2=new Plane();
        System.out.print("Введите фирму самолета: ");
        n=in.next();
        pl2.setFirma(n);
        System.out.print("Введите максимальную скорость самолета: ");
        s=in.nextInt();
        pl2.setMaxSpeed(s);
        System.out.print("Введите модель самолета: ");
        n=in.next();
        pl2.setModel(n);
        System.out.print("Введите кол-во мест в самолете: ");
        s=in.nextInt();
        pl2.setMesta(s);
        System.out.println();
        System.out.println("Первый самолет: "+pl1.toString());
        System.out.println("Второй самолет: "+pl2.toString());
        Helicopter hp=new Helicopter();
        hp.setAllinfo();
        System.out.println(hp.toString());

    }
}
