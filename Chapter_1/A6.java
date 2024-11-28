public class A6 {
    public static void main(String[] args) {
        // Проверка, получены ли аргументы
        if (args.length < 2) {
            System.out.println("нет данных");
            return;
        }
        String developerLastName = args[0];
        String receivedDateTime = args[1];
        String submittedDateTime = args[2];
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + receivedDateTime);
        System.out.println("Дата и время сдачи задания: " + submittedDateTime);
    }
}
