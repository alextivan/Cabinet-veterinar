package CabinetVeterinar.repository;


import CabinetVeterinar.model.Consultation;
import CabinetVeterinar.model.Doctor;
import CabinetVeterinar.model.Owner;
import CabinetVeterinar.model.Person;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DoctorRepository {

    GenericRepository<Doctor> doctorGenericRepository = new GenericRepository<>();
    GenericRepository<Person> personGenericRepository = new GenericRepository<>();

    public void saveDoctor(Doctor doctor, Person person) {
        personGenericRepository.save(person);
        doctor.setPerson(person);
        doctorGenericRepository.save(doctor);
    }

    public Doctor findById(Doctor doctor, Integer id) {
        doctorGenericRepository.findById(doctor, id);
        return doctor;

    }

    public void deleteDoctor(Doctor doctor) {
        doctorGenericRepository.delete(doctor);
    }

    public void updateDoctor(Doctor doctor) {
        doctorGenericRepository.update(doctor);
    }


}
