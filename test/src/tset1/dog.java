package tset1;
import  test2.inhertance;
public class dog {

    public static void function(){
        cat c=new cat();
        System.out.println(c.age);
    }

    public static void main(String[] args) {
        inhertance inh=new inhertance();
        inh.fun();
        System.out.println(inh.h);
        function();
    }

}
