public class TestAvia {
    public static void main(String[]args){
        AviaCompany mycomp=new AviaCompany();
        Plane pl1=new Plane("firma",421,"name",45);
        mycomp.addPlane(pl1);
        mycomp.addPlane(new Plane("firma", 523, "name",50));
        Helicopter myhel=new Helicopter("firm",245,"name3",431,true);
        mycomp.addPlane(myhel);
        mycomp.printAvia();
        if (mycomp.find(pl1)) {
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }
}
