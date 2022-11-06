public class Employee {
    public static float salary;
    private String FIO;
    private int Departmens;
    private float Salary;
    private int Id;
    private static int Counter;

    public Employee(String fio, int departmens, float salary) {
        this.FIO = fio;
        this.Departmens = departmens;
        this.Salary = salary;
        Id = ++Counter;
    }

    public String getFio() {
        return this.FIO;
    }
    public int getDepartmens() {
        return this.Departmens;
    }

    public float getSalary() {
        return this.Salary;
    }
    public int getId() {
        return this.Id;
    }

    public void setDepartmens(int departmens) {
        this.Departmens = departmens;
    }

    public void setSalary(float salary) {
        this.Salary = salary;
    }

    public String toString() {
        return "ID: " + Id + " Фамилия Имя Отчество сотрудника - " + getFio() + " Номер отдела - "
                + getDepartmens() + " Зарботная плата - " + getSalary();
    }

    }
