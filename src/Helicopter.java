import java.util.Scanner;
public class Helicopter extends Aircraft{
    private String model;
    private int power;
    private boolean ekipazh;
    public Helicopter(){
        super();
        model="";
        power=0;
        ekipazh=false;
    }
    public Helicopter(String firm,int speed, String name, int n, boolean f){
        super(firm,speed);
        model=name;
        power=n;
        ekipazh=f;
    }
    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setPower(int n){
        power=n;
    }
    public int getPower(){
        return power;
    }
    public void setEkipazh(boolean f){
        ekipazh=f;
    }
    public boolean isEkipazh(){
        return ekipazh;
    }
    public void setAllinfo(){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите фирму вертолета: ");
        String nazv=in.next();
        setFirma(nazv);
        System.out.println("Введите макс. скорость вертолета: ");
        int s= in.nextInt();
        setMaxSpeed(s);
        System.out.print("Введите модель вертолета: ");
        model=in.next();
        System.out.print("Введите мощность вертолета: ");
        power=in.nextInt();
        System.out.print("Введите признак экипажа в вертолете (true/false): ");
        ekipazh=in.nextBoolean();
        System.out.println();
    }
    public String toString(){
        return "\n\tВертолет"+"\n\t"+"Фирма: "+getFirma()+"\n\t"+"Скорость: "+getMaxSpeed()+"\n\t"+"Модель: "+model+"\n\t"+"Мощность: "+power+"\n\t"+"Признак экипажа: "+ekipazh+"\n";
    }
}
