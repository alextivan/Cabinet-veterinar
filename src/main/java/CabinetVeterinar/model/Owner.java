package CabinetVeterinar.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_owner")
    private Integer ownerId;

    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name = "person_id") //owner id este din baza de date /
    private Person person;

    @OneToMany(mappedBy = "owner")
    private List<Animal> animals;


    public Owner( String address, Person person) {
        this.address = address;
        this.person = person;
    }

    public Owner() {
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerId=" + ownerId +
                ", address='" + address + '\'' +
                ", person=" + person +
                '}';
    }
}