import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.print("Юматова А.С. Б762-2 Вариант 13 (задание 1)");
        StudentDatabase studentDatabase = new StudentDatabase();

        System.out.println("\nСтуденты факультета ФКНТ:");
        for (Student student : studentDatabase.getStudentsByFaculty("ФКНТ")) {
            System.out.println(student);
        }

        System.out.println("\nСписки студентов для каждого факультета и курса:");
        studentDatabase.printStudentsByFacultyAndCourse();

        System.out.println("\nСтуденты, родившиеся после 2000 года:");
        for (Student student : studentDatabase.getStudentsBornAfterYear(2000)) {
            System.out.println(student);
        }

        System.out.println("\nСтуденты группы Б762-2:");
        for (Student student : studentDatabase.getStudentsByGroup("Б762-2")) {
            System.out.println(student);
        }
    }
}

class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String lastName, String firstName, String middleName, String dateOfBirth,
                   String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", Дата рождения: " + dateOfBirth + ", Факультет: " + faculty + ", Курс: " + course + ", Группа: " + group;
    }
}

class StudentDatabase {
    private List<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
        // Добавление примеров студентов по факультетам
        students.add(new Student(1, "Иванов", "Иван", "Иванович", "2000-05-15", "ул. Ленина, д. 1", "1234567890", "ФКНТ", 3, "Б762-2"));
        students.add(new Student(2, "Петров", "Петр", "Петрович", "2001-11-20", "ул. Луговая, д. 10", "2345678901", "ФКНТ", 2, "Б762-1"));
        students.add(new Student(3, "Сидоров", "Сидор", "Сидорович", "2002-06-12", "ул. Парковая, д. 5", "3456789012", "МСФ", 1, "М-11"));
        students.add(new Student(4, "Кузнецов", "Алексей", "Фёдорович", "1999-04-08", "ул. Тверская, д. 3", "4567890123", "СФ", 4, "С-41"));
        students.add(new Student(5, "Смирнов", "Дмитрий", "Алексеевич", "2000-12-25", "ул. Дружбы, д. 17", "5678901234", "ФСТД", 2, "ТД-21"));
        students.add(new Student(6, "Васильева", "Мария", "Ивановна", "2001-03-17", "ул. Победы, д. 4", "6789012345", "ФЭУ", 3, "ЭУ-31"));
        students.add(new Student(7, "Григорьев", "Николай", "Владимирович", "1998-07-14", "пр. Ломоносова, д. 8", "7890123456", "ТК", 4, "К-41"));
        students.add(new Student(8, "Яковлева", "Екатерина", "Игоревна", "2002-11-23", "ул. Гагарина, д. 9", "8901234567", "ИПИБ", 1, "ИБ-11"));
    }

    public List<Student> getStudentsByFaculty(String faculty) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                result.add(student);
            }
        }
        return result;
    }

    public void printStudentsByFacultyAndCourse() {
        for (String faculty : Arrays.asList("ФКНТ", "МСФ", "СФ", "ФСТД", "ФЭУ", "ТК", "ИПИБ")) {
            for (int course = 1; course <= 4; course++) {
                System.out.println("Факультет: " + faculty + ", Курс: " + course);
                for (Student student : students) {
                    if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
                        System.out.println(student);
                    }
                }
            }
        }
    }

    public List<Student> getStudentsBornAfterYear(int year) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            int birthYear = Integer.parseInt(student.getDateOfBirth().split("-")[0]);
            if (birthYear > year) {
                result.add(student);
            }
        }
        return result;
    }

    public List<Student> getStudentsByGroup(String group) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                result.add(student);
            }
        }
        return result;
    }
}
