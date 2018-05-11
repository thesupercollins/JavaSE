package com.itschool;

import com.itschool.Exceptions.IDException;

public class EmployeeSalaried extends Employee implements IEmployee {
    private double typicalSalary = minimalMonthSalary;

    public EmployeeSalaried(){
        super();
        typicalSalary = minimalMonthSalary;
    }

    public EmployeeSalaried (long ID) throws IDException {
        super(ID);
        typicalSalary = minimalMonthSalary;
    }

    public EmployeeSalaried ( long ID, double typicalSalary) throws IDException{
        super(ID);
        this.setTypicalSalary(typicalSalary);
    }

    public EmployeeSalaried (long ID, String name, double typicalSalary) throws IDException{
        super(ID, name);
        this.setTypicalSalary(typicalSalary);
    }

    @Override
    public double CalculateSalary() {
        return this.typicalSalary;
    }

    public EmployeeSalaried(double typicalSalary) {
        this.typicalSalary = typicalSalary;
    }

    public double getTypicalSalary() {
        return typicalSalary;
    }

    public void setTypicalSalary(double typicalSalary) {
        this.typicalSalary = (typicalSalary < minimalMonthSalary ? minimalMonthSalary : typicalSalary);
    }
    @Override
    public String toString() {
        return super.toString() + ", минимальная зарплата " + this.minimalMonthSalary + ", зарплата " + this.CalculateSalary();
    }
}
