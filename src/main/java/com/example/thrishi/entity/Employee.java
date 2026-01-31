package com.example.thrishi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "current_role_name", nullable = false)
    private String currentRole;

    @Column(name = "current_location", nullable = false)
    private String currentLocation;

    @Column(name = "leaving_location")
    private String leavingLocation;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "leaving_date")
    private LocalDate leavingDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "joining_date")
    private LocalDate joiningDate;

    @Column(name = "new_role_name")
    private String newRole;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "new_joining_date")
    private LocalDate newJoiningDate;

    @Column(name = "years_of_experience")
    private int yearsOfExperience;

    // ===== Constructors =====

    public Employee() {
    }

    // ===== Getters and Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getLeavingLocation() {
        return leavingLocation;
    }

    public void setLeavingLocation(String leavingLocation) {
        this.leavingLocation = leavingLocation;
    }

    public LocalDate getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(LocalDate leavingDate) {
        this.leavingDate = leavingDate;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getNewRole() {
        return newRole;
    }

    public void setNewRole(String newRole) {
        this.newRole = newRole;
    }

    public LocalDate getNewJoiningDate() {
        return newJoiningDate;
    }

    public void setNewJoiningDate(LocalDate newJoiningDate) {
        this.newJoiningDate = newJoiningDate;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
