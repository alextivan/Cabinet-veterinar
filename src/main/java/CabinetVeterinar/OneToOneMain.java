package CabinetVeterinar;

import CabinetVeterinar.model.Doctor;
import CabinetVeterinar.model.Person;
import CabinetVeterinar.repository.PersonRepository;
import CabinetVeterinar.utils.SessionManager;

public class OneToOneMain {

    public static void main(String[] args) {

        //   DepartmentRepository departmentRepository = new DepartmentRepository();

        Person person1 = new Person();
        person1.setEmail("Mircea@gmail.com");
        person1.setUserName("Mircea Cel Batran");
        person1.setPhoneNumber("0744128986");
        person1.setPassword("parolaMCB");
        Person person2 = new Person();
        person2.setEmail("MirceaPopa@gmail.com");
        person2.setUserName("Popa Mircea");
        person2.setPhoneNumber("0744128986");
        person2.setPassword("parolaMP");


        Doctor doctor1 = new Doctor();
        doctor1.setSpecialization("ORL");
        Doctor doctor2 = new Doctor();
        doctor2.setSpecialization("Pediatru");

        PersonRepository personRepository = new PersonRepository();
        personRepository.save(person1, doctor1);
        personRepository.save(person2, doctor2);

    //   System.out.println(personRepository.findById(1));
        //System.out.println(personRepository.findById(2));

        // SessionManager.shutDown();
    }
}
