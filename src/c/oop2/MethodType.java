package c.oop2;

public class MethodType {
    int instanceField = 10;
    static int staticField = 20;

    void instanceMethod(){
        System.out.println("인스턴스");
        System.out.println("instanceField: " + instanceField);
        System.out.println("staticField: " + staticField);
    }

    static void staticMethod(){
        System.out.println("static");
        System.out.println("staticField: " + staticField);
        // System.out.println(instanceField); // error
    }

    public static void main(String[] args) {
        MethodType mt = new MethodType(); // 인스턴스화
        mt.instanceMethod();

        MethodType.staticMethod();
    }
}
