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

abstract class Employee {
    public String description;
    public String last;
    abstract String getDesc();

    public String getlast() {
        return last;
    }

    public void setlast(String last) {
        this.last = last;
    }

}
