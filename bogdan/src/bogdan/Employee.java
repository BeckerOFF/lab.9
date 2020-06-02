package bogdan;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private double salary=1000;
    private Manager manager;

    public int getId(){
        return  id;
    }

    public void setId(int a) throws IncorrectSalaryException{
        if (a <= 0) {
            throw new IncorrectSalaryException("ID должно быть больше 0");
        } else {
            a = id;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException{
        if(name.length() > 15){
            throw new FieldLengthLimitException("Имя должно быть меньше 15 символов!");
        }
        else{
            this.name=name;
        }
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String c) throws FieldLengthLimitException{
        if(c.length() > 15){
            throw new FieldLengthLimitException("Фамилия должна быть меньше 15 символов!");
        }
        else {surname=c;}
    }

    public void setSalary(double d) throws IncorrectSalaryException {
        if (d <= 0) {
            throw new IncorrectSalaryException("Зарплата должна быть больше 0");
        } else {
            d = salary;
        }
    }

    public double getSalary(){
        return salary;
    }
    public Manager getManager(){return manager;}
    public Employee(){};

    public Employee(int id, String name, String surname, double salary) throws IncorrectSalaryException, FieldLengthLimitException{
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }
    public Employee(int id, String name, String surname, double salary, Manager manager) throws IncorrectSalaryException, FieldLengthLimitException{
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.manager=manager;
    }

    public double raiseSalary(int n){
        return salary*(double)n;
    }

    //public String toString()
   // {
   //     return "Our employee: id - " + id + ", name - " + name + ", surname - " + surname + ", salary - " + salary + ", manager of this employee - "+getManagerName();

   // }
    public final String getManagerName()
    {
        if (manager==null)
            return "Nomanager";
        else
            return  manager.toString();

    }

    public Employee getTopManager(){
        if(manager == null){
            return this;
        } else {
            return getManager().getTopManager();
        }
    }
    @Override
    public String toString() {

        return "Id - " + getId() + ", Имя - " + getName()  + ", salary= " + getSalary()+ ", manager= {"+getManagerName()+ " } "+"\n ";
    }

}
