

public class Person extends MyDate {

    private static String Ssn;
    private static String Name;
    private String Address;
    private String Email;
    private MyDate BDate = new MyDate() ;
public void d(String x){System.out.println(x);}
    //Setter Methods
    public void setSsn(String ssn){ this.Ssn=ssn;}
    public void setName(String name){this.Name=name;}
    public void setAddress(String address){this.Address=address;}
    public void setEmail(String email) { Email = email; }
    public void setBDate(int day,int month,int year){
        this.BDate.Day=day;
        this.BDate.Month=month;
        this.BDate.Year=year;
    }
    //Getter Methods
    public String getSsn(){return Ssn;}
    public String getName(){return Name;}
    public String getAddress(){return Address;}
    public String getEmail(){return Email;}
    public MyDate getBDate(){return BDate;}
    //The First Constructor is Defualt that is Called when create new object
    //There are no-args and parametized Constructors
    public Person(String name){
        this.Name=name;
    }
    public Person(){
        this.Email=null;this.Name=null;this.Address=null;
    }

}
