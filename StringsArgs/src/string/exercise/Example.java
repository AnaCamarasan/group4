package string.exercise;

public class Example {
    public static void main (String[] args) {
        String s = "Hello";
        s = meth(s);
        System.out.println(s);
    }

    public static String meth (String x) {
        return (x + " World!");
    }
}
