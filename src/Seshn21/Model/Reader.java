package Seshn21.Model;

import Seshn21.Enum.Gender;

import java.util.List;

public class Reader {
    private int id;
    private String fullName;
    private String email;
    private int PhoneNumber;
    private Gender gender;
    private static int idd=1;

    public Reader( String fullName, String email, int phoneNumber, Gender gender) {
        this.id = idd++;
        this.fullName = fullName;
        this.email = email;
        PhoneNumber = phoneNumber;
        this.gender = gender;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Reader.idd = idd;
    }

    @Override
    public String
    toString() {
        return "Reader{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", gender=" + gender +"\n";
    }
}
