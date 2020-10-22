package ua.lviv.lgs.job;

public class Main {
    public static void main(String[] args) {
        EmployeeMonth employeeMonth = new EmployeeMonth(4200.0,6.5);
        employeeMonth.salary();
        EmployeeHour employeeHour = new EmployeeHour(55.5,25.5);
        employeeHour.salary();
    }
}
