public class A4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Введите пароль");
            return;
        }

        String pass = args[0];
        String spass = "1234";

        if (pass.equals(spass)) {
            System.out.println("Пароль верный");
        } else {
            System.out.println("Пароль неверный ");
        }
    }
}
