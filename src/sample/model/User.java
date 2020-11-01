package sample.model;

import sample.car.Car;

import java.util.Date;
import java.util.List;

public class User {
    private int userID;
    private String firstName;
    private String lastName;
    private Address address;
    private PhoneNumber phonenumber;
    private Date birthday;
    private String email;
    private String CNP;
    private DriverLicense license;
    private List<Car> rentedCars;
    private Account account;

    public User(){

    }

    public User(String firstName, String lastName, Address address, PhoneNumber phonenumber, Date birthday, String CNP, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phonenumber = phonenumber;
        this.birthday = birthday;
        this.CNP = CNP;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(PhoneNumber phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DriverLicense getLicense() {
        return license;
    }

    public void setLicense(DriverLicense license) {
        this.license = license;
    }

    public List<Car> getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(List<Car> rentedCars) {
        this.rentedCars = rentedCars;
    }

    public String getBirthdayString() {
        return birthday.toString();
    }

}
