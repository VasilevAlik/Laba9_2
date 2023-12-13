import java.util.ArrayList;
public class AviaCompany {
    private ArrayList<Aircraft> masPlane=new ArrayList<Aircraft>();
    public void addPlane(Plane p){
        masPlane.add(p);
    }
    public void addPlane(Helicopter h) {
        masPlane.add(h);
    }
    public AviaCompany(){

    }
    public boolean find(Plane p){
        return masPlane.contains(p);
    }
    public AviaCompany(ArrayList<Aircraft> n){
        masPlane=n;
    }
    public void printAvia(){
        System.out.println("У нас есть: ");
        for(Aircraft a:masPlane){
            if(a instanceof Plane){
                System.out.println("Это самолет ");
                System.out.println("\t"+a.toString());
            }
            else{
                System.out.println("Это вертолет ");
                System.out.println("\t"+a.toString());
            }
        }

    }

}

