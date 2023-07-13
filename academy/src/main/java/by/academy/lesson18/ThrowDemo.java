package by.academy.lesson18;

public class ThrowDemo {
    public static void doSomething() throws NullPointerException{
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Перехвачено внутри doSomething." + e);
            e.printStackTrace();
//            throw e; // повторно возбудить исключение
        }
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (NullPointerException e) {
            System.out.println("ПОВТОРНЫЙ перехват: " + e);
        }
    }
}