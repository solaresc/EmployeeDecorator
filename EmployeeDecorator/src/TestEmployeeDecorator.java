/***************************************************************
******
 Author : Caleb Solares
 Course : COP4814
 Professor : Caryl Rahn
 Program : Lab 6
 Purpose : To use decorator classes to add capabilities to employees
 Due Date : 11/11/2018
 Certification:
 I hereby certify that this work is my own and none of it is the work of any other person.
 ..........{ Caleb Solares }..........
****************************************************************
*****/

public class TestEmployeeDecorator {
    public static void main(String args[]) {
        Employee employee = new SalariedEmployee();
        employee = new DepartmentHead(employee);
        employee = new Manager(employee);
        employee = new Recruiter(employee);
        employee = new CommunityLiaison(employee);
        employee.setlast("Solares");
        System.out.println(employee.getlast() + ": " + employee.getDesc());

        Employee employee2 = new SalariedEmployee();
        employee2 = new Manager(employee2);
        employee2 = new Recruiter(employee2);
        employee2.setlast("Stark");
        System.out.println(employee2.getlast() + ": " + employee2.getDesc());

        Employee employee3 = new SalariedEmployee();
        employee3 = new Manager(employee3);
        employee3 = new Recruiter(employee3);
        employee3 = new CommunityLiaison(employee3);
        employee3.setlast("Rogers");
        System.out.println(employee3.getlast() + ": " + employee3.getDesc());

        Employee employee4 = new SalariedEmployee();
        employee4 = new Recruiter(employee4);
        employee4 = new CommunityLiaison(employee4);
        employee4.setlast("Odinson");
        System.out.println(employee4.getlast() + ": " + employee4.getDesc());

        Employee employee5 = new SalariedEmployee();
        employee5 = new CommunityLiaison(employee5);
        employee5.setlast("Banner");
        System.out.println(employee5.getlast() + ": " + employee5.getDesc());
    }
}