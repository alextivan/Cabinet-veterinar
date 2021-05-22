package CabinetVeterinar.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Integer id;
    @Column( name = "email")
    private String email;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "password")
    private String password;


    @OneToOne(mappedBy = "person") // person este numele fieldului din Doctor
    private Doctor doctor;

    @OneToOne(mappedBy = "person") // person este numele fieldului din Doctor
    private Owner owner;

    public Person( String email, String userName, String phoneNumber, String password) {

        this.email = email;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public Person() {
    }

    public Integer getPersonId() {
        return id;
    }

    public void setPersonId(Integer personId) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}
