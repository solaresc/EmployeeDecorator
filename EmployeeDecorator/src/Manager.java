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

public class Manager extends Employee {
    Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDesc() {
        return employee.getDesc() + ", Manager";
    }
}
