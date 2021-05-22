package CabinetVeterinar.model;

import javax.persistence.*;

@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "id_person")
    private Integer idPerson;

    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "owner") // person este numele fieldului din Doctor
    private Doctor doctor;

    public Owner(Integer idPerson, String address) {

        this.idPerson = idPerson;
        this.address = address;
    }

    public Owner() {

    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "idPerson" + idPerson +
                '}';

    }
}