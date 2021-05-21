package CabinetVeterinar.model;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "doctor_id")
    private Integer doctorId;
    @Column(name = "specialization")
    private String specialization;

    @OneToOne
    @JoinColumn(name = "person_id") //doctor id este din baza de date /
    private Person person;

    public Doctor(String specialization) {
        this.specialization = specialization;
    }

    public Doctor() {
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", specialization='" + specialization + '\'' +
                ", person=" + person +
                '}';
    }
}
