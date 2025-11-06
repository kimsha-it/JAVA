package c.oop2;

import java.util.Scanner;

public class AccModifier {
    public static   void main(String[] args){
        PrivateClass pc = new PrivateClass(10);
        // private
        // pc.value = 100; //error
        pc.resetValue();
        System.out.println(pc.getValue());

        // public
        pc.value2 = "test message";
    }
}
