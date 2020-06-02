package bogdan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException {

        Scanner in = new Scanner(System.in);
        String[] name = new String[9];

        for (int i = 0; i < 9; i++) {
            System.out.print("Введите имя сотрудника: \n");
            name[i] = in.nextLine();
        }
        try {
        Manager manager1 = new Manager(1,name[0],"Tomson",5600,25);
        Manager manager2=new Manager(2,name[1],"Grit",789,15,manager1);
        Employee employee1 = new Employee(1, name[2],"Tenytska",600, manager2);
        Employee employee2 = new Employee(2,name[3],"Filatova",3520, manager2);

        Employee employee3 = new Employee(3,name[4],"Alekseyev",2847, manager1);
        Manager manager3=new Manager(3,name[5],"Jonson",8547,8);
        Manager manager4 = new Manager(4,name[6],"Romson",5624,5,manager3);
        Manager manager5 = new Manager(5, name[7],"Bild",458,6,manager4);
        Employee employee4 = new Employee(4,name[8],"Wild",1425, manager5);

        System.out.println(employee4.toString());
        System.out.println(manager5.toString());
        System.out.println("Top manager of employee:" + employee4.getId()+" - " +employee4.getTopManager().toString());}
        catch  (FieldLengthLimitException | IncorrectSalaryException  ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }


        Employee employee5 = new Employee();
        System.out.println("Введите id: ");
        employee5.setSalary(in.nextInt ());
        System.out.println("Введите имя : ");
        employee5.setName(in.nextLine());
        System.out.println("Введите фамилию : ");
        employee5.setSurname(in.nextLine());
        System.out.println("Введите зарплату : ");
        employee5.setSalary(in.nextDouble());
        System.out.println("Нам менеджер номер:" + employee5.getId()+" с именем : "+employee5.getName()+" с фамилией : "+employee5.getSurname()+ " и зарплатой : " +employee5.getSalary());



    }
}
