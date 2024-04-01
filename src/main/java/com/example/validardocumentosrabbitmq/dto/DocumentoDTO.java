package com.example.validardocumentosrabbitmq.dto;

import java.util.Random;

public class DocumentoDTO {
    public int id;
    private String date;
    private String injuryLocation;
    private String gender;
    private String ageGroup;
    private String incidentType;
    private int daysLost;
    private String plant;
    private String reportType;
    private String shift;
    private String department;
    private double incidentCost;
    private String wkDay;
    private String month;
    private int year;

    // Método para generar un ID único aleatorio
    public void generarIdUnico() {
        Random random = new Random();
        this.id = random.nextInt(1000000); //
    }

    public DocumentoDTO(int id, String date, String injuryLocation, String gender, String ageGroup, String incidentType, int daysLost, String plant, String reportType, String shift, String department, double incidentCost, String wkDay, String month, int year) {
        this.id = id;
        this.date = date;
        this.injuryLocation = injuryLocation;
        this.gender = gender;
        this.ageGroup = ageGroup;
        this.incidentType = incidentType;
        this.daysLost = daysLost;
        this.plant = plant;
        this.reportType = reportType;
        this.shift = shift;
        this.department = department;
        this.incidentCost = incidentCost;
        this.wkDay = wkDay;
        this.month = month;
        this.year = year;
    }

    public DocumentoDTO() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public String getGender() {
        return gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public int getDaysLost() {
        return daysLost;
    }

    public String getPlant() {
        return plant;
    }

    public String getReportType() {
        return reportType;
    }

    public String getShift() {
        return shift;
    }

    public String getDepartment() {
        return department;
    }

    public double getIncidentCost() {
        return incidentCost;
    }

    public String getWkDay() {
        return wkDay;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setInjuryLocation(String injuryLocation) {
        this.injuryLocation = injuryLocation;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public void setDaysLost(int daysLost) {
        this.daysLost = daysLost;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setIncidentCost(double incidentCost) {
        this.incidentCost = incidentCost;
    }

    public void setWkDay(String wkDay) {
        this.wkDay = wkDay;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
