package ua.lviv.lgs.job;

public class EmployeeHour implements Salary {
    private double moneyHour;
    private double countHour;

    EmployeeHour(double moneyHour, double countHour){
        this.moneyHour = moneyHour;
        this.countHour = countHour;
    }

    @Override
    public void salary() {
        double Summa = countHour * moneyHour;
        System.out.println("Працівник з погодинною зарплатою заробляє : "+ Summa);
    }

}
