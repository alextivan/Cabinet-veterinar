package CabinetVeterinar.model;

import javax.persistence.*;
import java.util.List;


@Entity
    @Table(name = "animal")
    public class Animal {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column( name = "animal_id")
        private Integer id;
        @Column(name = "nume")
        private String nume;
        @Column(name = "specie")
        private String specie;
        @Column(name = "rasa")
        private String rasa;
        @Column(name = "sex")
        private String sex;
        @Column(name = "varsta")
        private String varsta;


        @OneToMany(mappedBy = "animal")
        private List<Consultation> consultations;

        public Animal(String nume, String specie, String rasa, String sex, String varsta ) {

            this.nume = nume ;
            this.specie = specie;
            this.rasa = rasa;
            this.sex=sex;
            this.varsta=varsta;
        }

        public Animal() {
        }

        public Integer getAnimalsId() {
            return id;
        }

        public void setAnimalsId(Integer animalsId) {
            this.id = id;
        }

        /////////



       /////////////////////////

        public String getNume() {
           return nume;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        /////////////////////////////////////

        public String getSpecie() {
            return specie;
        }

        public void setSpecie(String specie) {
            this.specie = specie;
        }

        public String getRasa() {
            return rasa;
        }

        public void setRasa(String rasa) {
            this.rasa = rasa;
        }

        public String  getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
        //////////////////////////////
        public String getVarsta() {
            return varsta;
        }

        public void setVarsta (String varsta) {
            this.varsta = varsta;
        }




        @Override
        public String toString() {

            return "Animals{" +
                   "animalsId" + id +
                    ", nume='" + nume + '\'' +
                    ", specie='" + specie + '\'' +
                    ", rasa='" + rasa + '\'' +
                    ", sex='" + sex + '\'' +
                    ", varsta='" + varsta +
                    '}';
        }
    }





