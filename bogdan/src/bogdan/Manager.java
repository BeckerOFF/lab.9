package bogdan;

public class Manager extends Employee{
    private double bonus;
    public Manager(int id, String name, String surname, double salary,double bonus ) throws IncorrectSalaryException, FieldLengthLimitException {
        super(id, name, surname, salary);
        this.bonus = bonus;
    }
    public Manager(int id, String name, String surname, double salary,double bonus,Manager manager ) throws IncorrectSalaryException, FieldLengthLimitException{
        super(id, name, surname, salary, manager);
        this.bonus=bonus;
    }


    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) throws IncorrectSalaryException {
        if (bonus < 0) {
            throw new IncorrectSalaryException("Бонус должен быть больше 0");
        } else {
            this.bonus = bonus;
        }
    }


    @Override
    public String toString()
    {
        return "manager: id- " + getId() + ", name- " + getName() + ", surname- " + getSurname() + ", salary- " + getSalary() + ", bonus- " + getBonus()  ;
    }
}