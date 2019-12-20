package com.samyam.e_employees.model;

public class Employees {
    private int id, employee_age;
    private String employee_name, profile_image;
    private float employee_salary;

    public Employees(int id, int employee_age, String employee_name, String profile_image, float employee_salary) {
        this.id = id;
        this.employee_age = employee_age;
        this.employee_name = employee_name;
        this.profile_image = profile_image;
        this.employee_salary = employee_salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(float employee_salary) {
        this.employee_salary = employee_salary;
    }
}
