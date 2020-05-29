public class Employee extends Person {
    private int EID;
    private MyDate HDate;
    private double Salary;
    private String Name;
    //Setter Methods
    public void setEID(int id){this.EID=id;}
    public void setHDate(int day,int month,int year){
        HDate.Day=day;
        HDate.Month=month;
        HDate.Year=year;
    }
    public void setSalary(double salary){this.Salary=salary;}
    //Getter Methods
    public int getEID(){return EID;}
    public MyDate getHDate(){return HDate;}
    public double getSalary() { return Salary; }
    //The First Constructor is Defualt that is Called when create new object
    //There are no-args and parametized Constructors
    public Employee(){Salary=0.0; }
    public Employee(double salary){ this.Salary=salary;}
}
