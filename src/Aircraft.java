public class Aircraft{
    private String Firma;
    private int MaxSpeed;
    public void setFirma(String firm){
        Firma=firm;
    }
    public void setMaxSpeed(int speed){
        MaxSpeed=speed;
    }
    public int getMaxSpeed(){
        return MaxSpeed;
    }
    public String getFirma(){
        return Firma;
    }
    public Aircraft(){
        Firma="No name";
        MaxSpeed=0;
    }
    public Aircraft(String firm, int speed){
        Firma=firm;
        MaxSpeed=speed;
    }
}