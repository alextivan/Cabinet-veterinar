package CabinetVeterinar.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "treatment")
public class Treatment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "treatment_id")
    private Integer id;
    @Column(name = "test_name")
    private String testName;
    @Column(name = "price")
    private Integer price;

    @ManyToMany(mappedBy = "treatments")
    private Set<Consultation> consultations = new HashSet<>();


    public Treatment(String testName, Integer price) {
        this.testName = testName;
        this.price = price;
    }

    public Treatment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "id=" + id +
                ", testName='" + testName + '\'' +
                ", price=" + price +
                '}';
    }
}
