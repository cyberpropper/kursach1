public class Main {
    public Employee[] employees;

    public Main() {
        employees = new Employee[10];
        initializeEmployees();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.printEmployee();
        System.out.println("Общая сумма затрат на заработную плату в месяц: " + main.getSumSalary());
        System.out.println("Сотрудник с минимальной зработной платой: " + main.getEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной заработной платой: " + main.getEmployeeWithMaxSalary());
        System.out.println("Средняя заработная плата в месяц: " + main.getMonthlyAverageSalary());
        System.out.println("Список сотрудников: ");
        main.printEmployeesFullNames();
    }

    public void initializeEmployees() {
        employees[0] = new Employee("Абрамов Артём Матвеевич", 2, 55000);
        employees[1] = new Employee("Агеев Тимофей Маркович", 1, 43000);
        employees[2] = new Employee("Волкова Алиса Александровна", 3, 38000);
        employees[3] = new Employee("Галкин Александр Степанович", 4, 88000);
        employees[4] = new Employee("Денисов Марк Ильич", 5, 5000);
        employees[5] = new Employee("Карпова Юлия Вкиторовна", 1, 70000);
        employees[6] = new Employee("Морозов Егор Владиславович", 5, 17000);
        employees[7] = new Employee("Хохлов Максим Владимирович", 4, 27000);
        employees[8] = new Employee("Горлова Наталья Константиновна", 2, 4700);
        employees[9] = new Employee("Иванов Андрей Андреевич", 3, 600000);
    }

    public void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int getSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    public Employee getEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double getMonthlyAverageSalary() {
        double monthlyAverageSalary = (double) getSumSalary() / employees.length;
        return monthlyAverageSalary;
    }

    public void printEmployeesFullNames() {
        int idCount = 1;
        for (Employee employee : employees) {
            System.out.printf("%d. %s%n", idCount, employee.getFullName());
            idCount++;
        }
    }
}