package by.academy.lesson5.appender;
public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println("charAt(1) = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println(sb);
    }
}