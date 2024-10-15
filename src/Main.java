import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] FIRSTNAMES = {"Егор", "Ильхом", "Влад", "Валентин", "Дима", "Сергей", "Руслан", "Рустам", "Ваня", "Якуб"};
    private final static String[] LASTNAMES = {"Мыльников", "Арипов", "Семенов", "Воробьев", "Павлов", "Решетников", "Симонов", "Тимиров", "Беляков", "Нагданов"};
    private final static String[] PATRONYMIC_NAMES = {"Захариевич", "Михайлович", "Игоревич", "Владимирович", "Сергеевич", "Викторович", "Николаевич", "Иванович", "Джабраилович"};


    private static final Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = LASTNAMES[RANDOM.nextInt(LASTNAMES.length)] + " " + FIRSTNAMES[RANDOM.nextInt(FIRSTNAMES.length)] + " " + PATRONYMIC_NAMES[RANDOM.nextInt(PATRONYMIC_NAMES.length)];

            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 10), RANDOM.nextInt(50_000, 100_000));
        }
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(" ");
        print();
        System.out.println(" ");
        System.out.println("Сумма зарплаты сотрудников: " + calculateSalary());
        System.out.println(" ");
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalary());
        System.out.println(" ");
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalary());
        System.out.println(" ");
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println(" ");
        printFullNames();

    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int calculateSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += (int) employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalary() {
        Employee minSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (minSalary == null || employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    private static Employee findMaxSalary() {
        Employee maxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (maxSalary == null || employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    private static double calculateAverageSalary() {
        return (double) calculateSalary() / EMPLOYEES.length;
    }
    private static void printFullNames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }

    }
}

