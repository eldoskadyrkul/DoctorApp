package com.DoctorApp.model;

import java.util.List;

public class Doctor {

    private int doctorID;
    private String nameDoctor;
    private String lnameDoctor;
    private String otchestvo;
    private List<String> dateDoctor;

    /* конструктор */
    public Doctor(int doctorID, String nameDoctor, String lnameDoctor, String otchestvo, List<String> dateDoctor) {
        this.doctorID = doctorID;
        this.nameDoctor = nameDoctor;
        this.lnameDoctor = lnameDoctor;
        this.otchestvo = otchestvo;
        this.dateDoctor = dateDoctor;
    }

    public Doctor() {}

    /* геттеры и сеттеры */

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getLnameDoctor() {
        return lnameDoctor;
    }

    public void setLnameDoctor(String lnameDoctor) {
        this.lnameDoctor = lnameDoctor;
    }

    public List<String> getDateDoctor() {
        return dateDoctor;
    }

    public void setDateDoctor(List<String> dateDoctor) {
        this.dateDoctor = dateDoctor;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    // метод toString

    @Override
    public String toString() {
        return String.format("Doctor {%d, %s %s %s, %s}", doctorID, nameDoctor, lnameDoctor, otchestvo, dateDoctor);
    }
}
