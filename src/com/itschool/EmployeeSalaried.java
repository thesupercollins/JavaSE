package com.itschool;

public class EmployeeSalaried extends Employee implements IEmployee {
    private double typicalSalary = minimalMonthSalary;
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
}
