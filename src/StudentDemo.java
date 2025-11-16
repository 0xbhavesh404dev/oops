class Student{
    int roll;
    String name;
    String Dept;
    int mar;
    //methods
    public void getdetails(int roll,String name,String Dept,int mar){
        this.roll=roll;
        this.name=name;
        this.Dept=Dept;
        this.mar=mar;
    }
    public void getdetail2(int roll2,String name2,String dept2,int mar2){
        roll=roll2;
        name=name2;
         Dept=dept2;
         mar=mar2;
    }
    //methods for printing
    public void printdetails(){
        System.out.println("Roll no.: "+this.roll);
        System.out.println("Name.: "+this.name);
        System.out.println("Dept.: "+this.Dept);
        System.out.println("Mar.: "+this.mar);
    }
    public void printdetails2(){
        System.out.println("Roll no.: "+roll);
        System.out.println("Name.: "+name);
        System.out.println("Dept.: "+Dept);
        System.out.println("Mar.: "+mar);
    }


}



public class StudentDemo {
    public static void main(String[] args){
       Student s=new Student();
       s.getdetails(77,"Bhavesh Kumar","CSE",98);
       s.printdetails();
        s.getdetails(121,"Manash Kumar","ECE",96);
        s.printdetails();
        s.getdetail2(71,"Faizu Kumar","CSE",97);
        s.printdetails2();//s.printdetails bhi kam kare ga

    }

}
