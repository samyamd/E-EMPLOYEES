package com.samyam.e_employees.model;

public class CUDEmployee {
    private int id,age;
    private String name, salary, profile_image;

    public CUDEmployee(int age, String name, String salary) {
//        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
//        this.profile_image = profile_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
