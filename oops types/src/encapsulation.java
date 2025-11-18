import java.util.Scanner;

class encapsul{
    private int age;
    private double height;
    private int g=0;

    public int getAge() {
        age=age+1;
        return age;
    }

    public int setAge(int age1) {
        if(age1>0) {
            this.age = age1;
        }
        return age;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        encapsul c = new encapsul();
        System.out.println(c.setAge(-1));
        System.out.println(c.getAge());
        System.out.println(c.setAge(3));
        System.out.println(c.getAge());
    }

}
