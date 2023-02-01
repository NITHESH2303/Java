import java.util.*;
import java.util.stream.*;
//define class Employee

class Employee{
    String name;
    String dept;
    int salary;
    public Employee(String name, String department, int salary) {
        this.name = name;
        dept = department;
        this.salary = salary;
    }
    public String getname(){
        return name;
    }
    public String getdept(){
        return dept;
    }
    public int getsalary(){
        return salary;
    }
    public String toString(){
        String str =  "";
        str =  str + name + " : " + dept + " : " + salary;
        return str;
    }
}


class FClass{
    //define method query
    public Stream<Employee> query(List<Employee> emp, String dept, int salary){
        Stream<Employee> empst = emp.stream().filter(v -> v.getdept().equals(dept))
    }

    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));
        String d = sc.next();       //read department
        double s = sc.nextInt();    //read salary
		
        var st = query(eList, d, s);
        st.forEach(n -> System.out.println(n + " "));
    }
}