package com.itschool;

import com.itschool.Exceptions.IDException;

abstract public class Employee implements IEmployee {
    private long ID;
    private String name;

    public Employee() {

    }

    public long getID() {
        return ID;
    }

    public Employee(long ID) throws IDException {
        this.setID(ID);
    }

    public Employee(long ID, String name) throws IDException {
        this.setID(ID);
        this.name = name;
    }

    public void setID(long ID) throws IDException {
        boolean error = true;

        if (ID < 10000000000L)
            throw new IDException();

            else
        {
            this.ID = ID;
            error = false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: " + this.name + ", " + this.ID;
    }
}
