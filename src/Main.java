public class Main {
    public static int calculateSumSalary(Employee[] staff) {
        System.out.println();
        int sum = 0;
        for (Employee i : staff) {
            sum += i.getSalary();
        }
        System.out.println("Общая трата на зарплаты сотрудников составила - " + sum + " рублей!");
        return sum;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] staff) {
        Employee result = staff[0];
        float minSalary = result.getSalary();
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println("Минимальная зарплата сотрудника - " + result + " рублей!");
        return result;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] staff) {
        Employee result = staff[0];
        float maxSalary = result.getSalary();
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println("Максимальная зарплата сотрудника - " + result + " рублей!");
        return result;
    }

    public static void calculateAverageSalary(Employee[] staff) {
        int sum = 0;
        for (Employee i : staff) {
            sum += i.getSalary();
        }
        float averageSalary = (sum / staff.length);
        System.out.println("Средняя зарплата равна - " + averageSalary + " рублей!");
    }

    public static void printNames(Employee[] staff) {
        for (Employee i : staff) {
            System.out.println("Сотрудник компании - " + i.getFio());
        }
    }

    public static void main(String[] args) {
        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Палмарчук Евгений Валерьевич", 1, 41000f);
        staff[1] = new Employee("Станисенко Игорь Фёдорович", 1, 42350f);
        staff[2] = new Employee("Павленко Денис Игоревич", 2, 31250f);
        staff[3] = new Employee("Березин Кирилл Алексеевич", 2, 56470f);
        staff[4] = new Employee("Макарьева Жанна Денисовна", 3, 23890f);
        staff[5] = new Employee("Житарь Владислав Михайлович", 3, 60000f);
        staff[6] = new Employee("Коробейников Виктор Никитович", 4, 50700f);
        staff[7] = new Employee("Карпов Евгений Сергеевич", 4, 25800f);
        staff[8] = new Employee("Лещётный Алексей Викторович", 5, 32500f);
        staff[9] = new Employee("Чаботкина Кристина Алексеевна", 5, 81900f);
        for (Employee i : staff) {
            System.out.println(i);
        }
        calculateSumSalary(staff);

        System.out.println();
        findEmployeeWithMinSalary(staff);

        System.out.println();
        findEmployeeWithMaxSalary(staff);

        System.out.println();
        calculateAverageSalary(staff);

        System.out.println();
        printNames(staff);
    }
}