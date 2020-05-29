public class UnderGradStud extends Student {
    private double GPA;
    private double Hours;
    //Setter Methods
    public void setGPA(double gpa){this.GPA=gpa;}
    public void setHours(double hours){this.Hours=hours;}
    //Getter Methods
    public double getGPA(){return GPA;}

    public double getHours() {
        return Hours;
    }

    public UnderGradStud(){
        GPA=0.0;
        Hours=0.0;

    }
    public UnderGradStud(double gpa,double hours){
        this.GPA=gpa;
        this.Hours=hours;
    }
}
