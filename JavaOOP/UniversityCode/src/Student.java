public class Student extends Person {
    private int SID;
    private double Grad;
    private int class_statu;
    //Setter Methods
    public void setSID(int id){this.SID=id;}
    public void setGrad(double grad){this.Grad=grad;}
    public void setClass_statu(int statu){this.class_statu=statu;}
    //Getter Methods
    public int getSID(){return SID;}
    public int getClass_statu(){return class_statu;}
    public double getGrad(){return  Grad;}
    //The First Constructor is Defualt that is Called when create new object
    //There are no-args and parametized Constructors
    public Student(){
        Grad=0.0;
        class_statu=0;
    }
    public Student(double grad,int statu){
        this.Grad=grad;
        this.class_statu=0;
    }


}
