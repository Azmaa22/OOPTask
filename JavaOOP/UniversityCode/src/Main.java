
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyDate date = new MyDate();
        Person P =new Person();
        Student S  = new Student();
        Employee E = new Employee();
        UnderGradStud UGS = new UnderGradStud();
        PostGradStudent PGS = new PostGradStudent();
        PhdStud phds = new PhdStud();
        MasterStud ms = new MasterStud();
        int test ,SID,EID , day ,month ,year, CLASS , RI;
        double GRAD , GPA ,SALARY,HOURS,RD ;
        String NAME , SSN, ADDRESS , EMAIL ,BIRTHDAY,RS ;
        Scanner sc = new Scanner(System.in);
        //-------------------------------------------------------------
        System.out.println("-----------------TESTING-----------------");
        System.out.println("Entering Person Information");
        System.out.println();
        System.out.print("Please Enter your National Number"+" :");
        SSN = sc.nextLine();
        P.setSsn(SSN);
        //sc.nextLine();
        System.out.print("Please Enter your Name"+" :");
        NAME=sc.nextLine();
        P.setName(NAME);
        System.out.print("Please Enter your EMail"+" :");
        EMAIL=sc.nextLine();
        P.setEmail(EMAIL);
        System.out.print("Please Enter your Address"+" :");
        ADDRESS=sc.nextLine();
        P.setAddress(ADDRESS);

        System.out.print("Please Enter your BirthDay like this day ,month and year"+" :");
        day = sc.nextInt();
        month =sc.nextInt();
        year = sc.nextInt();
        P.setBDate(day,month,year);

        System.out.println("Pleasr Enter 1 if you are steudent and Enter 2 if you are Employee");

        test = sc.nextInt();
        if (test==1){
            System.out.println("Entering Student Information");
            System.out.println();
            System.out.println("Please Enter Your ID  : ");
            SID=sc.nextInt();
            S.setSID(SID);
            System.out.println("Please Enter YOur Grad : " );
            GRAD=sc.nextDouble();
            S.setGrad(GRAD);
            System.out.println("Please Enter Your Class Statu Number 1,2,3,or 4 and 5 for master Student or 6 for PHDStudent: ");
            CLASS = sc.nextInt();
            S.setClass_statu(CLASS);
            System.out.println("Please Enter 1 if you are undergraduate Student or 2 if you are Postgraduate Student");
            test=sc.nextInt();
            if(test==1){
                System.out.println("Entering UnderGraduate Student Information");
                System.out.println();
                System.out.println("Please Enter Your GPA : ");
                GPA=sc.nextDouble();
                UGS.setGPA(GPA);
                System.out.println("Please Enter Your Cridet Hours : ");
                HOURS=sc.nextDouble();
                UGS.setHours(HOURS);

            }else {
                System.out.println("You are PostGraduate Stedent and Your Information : ");

            }
        }else
        {
            System.out.println("Entering Employee Information");
            System.out.println();
            System.out.println("Please Enter Your ID : ");
            EID=sc.nextInt();
            E.setEID(EID);
            System.out.println("Please Enter Your Salary : ");
            SALARY=sc.nextDouble();
            E.setSalary(SALARY);
            System.out.println("Please Enter your HDate like this day ,month and year\"+\" :");
            day = sc.nextInt();
            month =sc.nextInt();
            year = sc.nextInt();
            E.setHDate(day,month,year);
        }
        System.out.println("Please Enter 1 to display person information");
        System.out.println("Please Enter 2 to display Student information");
        System.out.println("Please Enter 3 to display UnderGraduate Student information");
        System.out.println("Please Enter 4 to display PostGraduate Student information");
        System.out.println("Please Enter 5 to display Master Student information");
        System.out.println("Please Enter 6 to display PHD Student information");
        System.out.println("Please Enter 7 to display Employee information");
        test=sc.nextInt();
        if(test==1){
            System.out.println("----------- Person Information-----------");
            System.out.println();
            RS=P.getSsn();
            System.out.println("SSN: "+RS);
            RS = P.getName();
            System.out.println("Name: "+RS);
            RS = P.getAddress();
            System.out.println("Address: "+RS);
            RS = P.getEmail();
            System.out.println("Email: "+RS);
            date = P.getBDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
        }
        if(test==2){
            System.out.println("----------- Student Information-----------");
            System.out.println();
            RS=S.getSsn();
            System.out.println("SSN: "+RS);
            RS = S.getName();
            System.out.println("Name: "+RS);
            RS = P.getAddress();
            System.out.println("Address: "+RS);
            RS = P.getEmail();
            System.out.println("Email: "+RS);
            date = P.getBDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
            RI=S.getSID();
            System.out.println("SID : "+RI);
            RD=S.getGrad();
            System.out.println("Grad : "+RD);
            RI=S.getClass_statu();
            System.out.println("Clas_Statu : "+RI);
        }
        if(test==3){
            System.out.println("----------- UnderGraduate Student Information-----------");
            System.out.println();
            RS=UGS.getSsn();
            System.out.println("SSN: "+RS);
            RS = UGS.getName();
            System.out.println("Name: "+RS);
            RS = P.getAddress();
            System.out.println("Address: "+RS);
            RS = P.getEmail();
            System.out.println("Email: "+RS);
            date = P.getBDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
            RI=S.getSID();
            System.out.println("SID : "+RI);
            RD=S.getGrad();
            System.out.println("Grad : "+RD);
            RI=S.getClass_statu();
            System.out.println("Clas_Statu : "+RI);
            RD =UGS.getGPA();
            System.out.println("GPA : "+RD);
            RD =UGS.getHours();
            System.out.println("Cridet Hours : "+RD);


        }
        if(test==4){
            System.out.println("----------- PostGraduate Student Information-----------");
            System.out.println();
            RS=P.getSsn();
            System.out.println("SSN: "+RS);
            RS = P.getName();
            System.out.println("Name: "+RS);
            RS = P.getAddress();
            System.out.println("Address: "+RS);
            RS = P.getEmail();
            System.out.println("Email: "+RS);
            date = P.getBDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
            RI=S.getSID();
            System.out.println("SID : "+RI);
            RD=S.getGrad();
            System.out.println("Grad : "+RD);
            RI=S.getClass_statu();
            System.out.println("Clas_Statu : "+RI);
        }
        if(test==5){
            System.out.println("----------- Master  Student Information-----------");
            System.out.println();
            RS=P.getSsn();
            System.out.println("SSN: "+RS);
            RS = P.getName();
            System.out.println("Name: "+RS);
            RS = P.getAddress();
            System.out.println("Address: "+RS);
            RS = P.getEmail();
            System.out.println("Email: "+RS);
            date = P.getBDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
            RI=S.getSID();
            System.out.println("SID : "+RI);
            RD=S.getGrad();
            System.out.println("Grad : "+RD);
            RI=S.getClass_statu();
            System.out.println("Clas_Statu : "+RI);
        }
        if(test==6){
            System.out.println("----------- PHD  Student Information-----------");
            System.out.println();
            RS=P.getSsn();
            System.out.println("SSN: "+RS);
            RS = P.getName();
            System.out.println("Name: "+RS);
            RS = P.getAddress();
            System.out.println("Address: "+RS);
            RS = P.getEmail();
            System.out.println("Email: "+RS);
            date = P.getBDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
            RI=S.getSID();
            System.out.println("SID : "+RI);
            RD=S.getGrad();
            System.out.println("Grad : "+RD);
            RI=S.getClass_statu();
            System.out.println("Clas_Statu : "+RI);
        }
        if(test==7){
            System.out.println("----------- Employee Information-----------");
            System.out.println();
            RS=E.getSsn();
            System.out.println("SSN: "+RS);
            RS = E.getName();
            System.out.println("Name: "+RS);
            RS = P.getAddress();
            System.out.println("Address: "+RS);
            RS = P.getEmail();
            System.out.println("Email: "+RS);
            date = P.getBDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
            RI=E.getEID();
            System.out.println("EID : "+RI);
            date = E.getHDate();
            System.out.println(date.Day+"/"+date.Month+"/"+date.Year);
            RD=E.getSalary();
            System.out.println("Salary : "+RD);

        }


    }
}

