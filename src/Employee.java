public class Employee {

    private static int idgenerator = 1;


    private final int id;
    private final String fullName;
    private int departament;
    private double salary;

    public Employee(String fullName, int departament, double salary) {
        id = idgenerator++;
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id = " + id + ", Полное имя = " + fullName + ", Отдел = " + departament + ", зарплата = " + salary;
    }
}
