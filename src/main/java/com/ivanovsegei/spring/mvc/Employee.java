package com.ivanovsegei.spring.mvc;

import com.ivanovsegei.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, max = 40, message = "name must be minimal 2 or maximum 40 symbols")//message - вывод ошибки,
    // не укажем- выведет дефолтное
    private String name;

    //@NotNull
   // @NotEmpty(message = "surname - is required field")
    @NotBlank(message = "surname - is required field")
    private String surname;

    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1500, message = "must be lesser than 1501")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private Map<String, String> languageList;
    private String carBrand;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("It", "Information Technology");
        departments.put("Hr", "Human resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("WolksVagen", "WolksVagen");
        carBrands.put("AUDI", "AUDI");

        languageList = new HashMap<>();
        languageList.put("FR", "French");
        languageList.put("DE", "Deutsch");
        languageList.put("EN", "English");
        }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
