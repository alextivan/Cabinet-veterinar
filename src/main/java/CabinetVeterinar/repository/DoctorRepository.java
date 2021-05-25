package CabinetVeterinar.repository;



import CabinetVeterinar.model.Doctor;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DoctorRepository {

    public Doctor findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id

        Doctor doctor = session.find(Doctor.class, id);

        //animal.getProjects().forEach( project -> System.out.println(project));

        session.close();
        return doctor;

    }
    public void delete(Doctor doctor)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(doctor);
        transaction.commit();
        session.close();
    }


    public void update(Doctor doctor)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(doctor);
        transaction.commit();
        session.close();
    }


    
}
