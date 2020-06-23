package com.design.models;

/**
 * BUILDER PATTERN
 */
public class Employee
{
    private int id;
    private String name;
    private String location;
    private String role;
    private String salary;

    public Employee(int id, String name, String location, String role, String salary)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.role = role;
        this.salary = salary;
    }

    public Employee(EmployeeBuilder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.location = builder.location;
        this.role = builder.role;
        this.salary = builder.salary;
    }

    public static class EmployeeBuilder
    {
        private int id;
        private String name;
        private String location;
        private String role;
        private String salary;

        public EmployeeBuilder setId(int id)
        {
            this.id = id;
            return this;
        }
        public EmployeeBuilder setName(String name)
        {
            this.name = name;
            return this;
        }
        public EmployeeBuilder setLocation(String location)
        {
            this.location = location;
            return this;
        }
        public EmployeeBuilder setRole(String role)
        {
            this.role = role;
            return this;
        }
        public EmployeeBuilder setSalary(String salary)
        {
            this.salary = salary;
            return this;
        }

        public Employee build()
        {
            Employee e = new Employee(this);
            return e;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
