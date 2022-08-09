package Person;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private double salary;
    private String hiredDate;


    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String hiredDate) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }



    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", datehired=" + hiredDate +
                '}';
    }
}
