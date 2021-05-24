package CabinetVeterinar.model;

import javax.persistence.*;



    @Entity
    @Table(name = "animals")
    public class Animal {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column( name = "a_id")
        private Integer id;
//        @Column( name = "id_owner")
//        private int id_owner;
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

//        @OneToOne(mappedBy = "animals") // person este numele fieldului din Doctor
//        private Doctor doctor;



        public Animal( int id_owner, String nume, String specie, String rasa, String sex, String varsta ) {

//            this.id_owner = id_owner;
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

        public Integer getId_owner() {
            return id_owner;
        }

        public void setId_owner(Integer email) {
            this.id_owner = id_owner;
        }

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
                    ", id_owner='" + id_owner + '\'' +
                    ", nume='" + nume + '\'' +
                    ", specie='" + specie + '\'' +
                    ", rasa='" + rasa + '\'' +
                    ", sex='" + sex + '\'' +
                    ", varsta='" + varsta +
                    '}';
        }
    }





