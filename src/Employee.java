public class Employee {
    private String fio;
    private int departmens;
    private float salary;
    private int id;
    private static int counter;

    public Employee(String fio, int departmens, float salary) {
        this.fio = fio;
        this.departmens = departmens;
        this.salary = salary;
        id = ++counter;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDepartmens() {
        return this.departmens;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartmens(int departmens) {
        this.departmens = departmens;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + " Фамилия Имя Отчество сотрудника - " + getFio() + " Номер отдела - "
                + getDepartmens() + " Зарботная плата - " + getSalary();
    }
}
