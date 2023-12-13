public class Plane extends Aircraft{
    private String model;
    private int mesta;
    public Plane(){
        super();
        model="";
        mesta=0;
    }
    public Plane(String Firma,int speed, String name, int k){
        super(Firma,speed);
            model=name;
            mesta=k;
    }
    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setMesta(int k){
        mesta=k;
    }
    public int getMesta(){
        return mesta;
    }
    public String toString(){
        return getFirma()+" "+getMaxSpeed()+" "+model+" "+mesta;
    }

}
