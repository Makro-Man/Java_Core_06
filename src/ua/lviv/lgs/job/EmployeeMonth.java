package ua.lviv.lgs.job;

public class EmployeeMonth implements Salary{
    private double moneyMonth;
    private double countMonth;

    EmployeeMonth(double moneyMonth, double countMonth){
        this.countMonth = countMonth;
        this.moneyMonth = moneyMonth;
    }

    @Override
    public void salary() {
        double summa = countMonth * moneyMonth;
        System.out.println("Працівник з фіксованою місячною зарплатою заробляє : "+ summa);
    }
}
