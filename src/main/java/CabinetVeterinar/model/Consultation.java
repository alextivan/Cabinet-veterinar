package CabinetVeterinar.model;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "consultation")
public class Consultation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "consultation_id")
    private Integer id;
    @Column(name = "date")
    private Date date;
    @Column(name = "weight")
    private double weight;
    @Column(name = "temperature")
    private float temperature;
    @Column(name = "consultation_price")
    private Integer ConsultationPrice;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToMany
    @JoinTable(name = "consultation_treatments",
            joinColumns = {@JoinColumn(name = "consultation_id")},
            inverseJoinColumns = {@JoinColumn(name = "treatment_id")})
    private Set<Treatment> treatments = new HashSet<>();


    public Consultation(Date date, double weight, float temperature, Integer consultationPrice) {
        this.date = date;
        this.weight = weight;
        this.temperature = temperature;
        ConsultationPrice = consultationPrice;
    }

    public Consultation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Integer getConsultationPrice() {
        return ConsultationPrice;
    }

    public void setConsultationPrice(Integer consultationPrice) {
        ConsultationPrice = consultationPrice;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", date=" + date +
                ", weight=" + weight +
                ", temperature=" + temperature +
                ", ConsultationPrice=" + ConsultationPrice +
                '}';
    }
}
