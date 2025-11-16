class Employee{
    int empid;
    String empname;
    String desig;
    double Sala;
    // methods
    public void getdetail(int e,String n,String d,double s){
        empid=e;
        empname=n;
        desig=d;
        Sala=s;
    }
    public void printdetails(){
        System.out.println("Employee details:");
        System.out.println("Employee id: "+empid);
        System.out.println("Employee name: "+empname);
        System.out.println("Employee desig: "+desig);
        System.out.println("Employee Sala: "+Sala);
    }

}


public class Employeedemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdetail(1,"bhavesh","Softare engineer",1000330000);
        emp.printdetails();
        emp.getdetail(2,"Manash","IAS",100463000);
        emp.printdetails();
        emp.getdetail(3,"Faizu","Business man",1006732);
        emp.printdetails();
    }
}
