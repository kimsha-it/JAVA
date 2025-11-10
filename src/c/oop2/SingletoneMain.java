package c.oop2;

public class SingletoneMain {
    public static void main(String[] args) {
        // Singletone s1 = new Singletone();
        // Singletone s2 = new Singletone();

        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();

        System.out.println(s1 == s2);

    }
}
