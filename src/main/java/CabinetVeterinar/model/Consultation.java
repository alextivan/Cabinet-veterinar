package CabinetVeterinar.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


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
