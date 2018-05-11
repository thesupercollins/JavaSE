package com.itschool;

import com.itschool.Exceptions.IDException;

public class EmployeeTimed extends Employee implements IEmployee {
    private double typicalSalary;

    public EmployeeTimed() {
        super();
        typicalSalary = minimalHourSalary;
    }

    public EmployeeTimed(long ID) throws IDException {
        super(ID);
        typicalSalary = minimalHourSalary;
    }

    public EmployeeTimed(long ID, double typicalSalary) throws IDException {
        super(ID);
        this.setTypicalSalary(typicalSalary);
    }

    public EmployeeTimed(long ID, String name, double typicalSalary) throws IDException {
        super(ID, name);
        this.setTypicalSalary(typicalSalary);
    }

    @Override
    public double CalculateSalary() {
        return typicalsMonthDays * hoursPerDay * typicalSalary;
    }

    public double getTypicalSalary() {
        return typicalSalary;
    }

    public void setTypicalSalary(double typicalSalary) {
        this.typicalSalary = (typicalSalary < minimalHourSalary ? minimalHourSalary : typicalSalary);
    }

    @Override
    public String toString() {
        return super.toString() + ", часовая оплата " + this.typicalSalary + ", зарплата " + this.CalculateSalary();
    }
}
