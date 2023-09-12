package com.napredno.doggroom.domain;

public class Person {

    private Long personID;
    private String firstname;
    private String lastname;
    private String contactNumber;
    private int appointmentNumber;

    public Person() {
    }

    public Person(Long personID, String firstname, String lastname, String contactNumber, int appointmentNumber) {
        this.personID = personID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.appointmentNumber = appointmentNumber;
    }

    public Person(String firstname, String lastname, String contactNumber, int appointmentNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.appointmentNumber = appointmentNumber;
    }

    public Long getPersonID() {
        return personID;
    }

    public void setPersonID(Long personID) {
        this.personID = personID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", appointmentNumber=" + appointmentNumber +
                '}';
    }
}
