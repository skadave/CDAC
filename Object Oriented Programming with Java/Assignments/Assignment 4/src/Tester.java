import java.util.Scanner;

class Employee{
    String name;
    int empid;
    int salary;
    
    
    void accept(Scanner sc){
        System.out.println("Enter Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        this.empid = sc.nextInt();
        System.out.println("Enter Salary: ");
        this.salary = sc.nextInt();
        sc.nextLine();
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Employee ID: "+this.empid);
        System.out.println("Salary :"+this.salary);
    }

    
}

public class Tester {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      Employee e1 = new Employee();
      e1.accept(sc);
      e1.display();
      
      Employee e2 = new Employee();
      e2.accept(sc);
      e2.display();
      
      
    }

}
