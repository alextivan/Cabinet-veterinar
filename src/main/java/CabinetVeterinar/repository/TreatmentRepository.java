package CabinetVeterinar.repository;


import CabinetVeterinar.model.Treatment;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TreatmentRepository {

    public Treatment findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id

        Treatment treatment = session.find(Treatment.class, id);

        //consultation.getProjects().forEach( project -> System.out.println(project));

        session.close();
        return treatment;
    }

    public void save(Treatment treatment)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //The save method persists the object to the database
        session.save(treatment);
        transaction.commit();
        session.close();
    }

    public void delete(Treatment treatment)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(treatment);
        transaction.commit();
        session.close();
    }


    public void update(Treatment treatment)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(treatment);
        transaction.commit();
        session.close();
    }
}
