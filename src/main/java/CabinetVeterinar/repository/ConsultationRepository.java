package CabinetVeterinar.repository;

import CabinetVeterinar.model.Animal;
import CabinetVeterinar.model.Consultation;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ConsultationRepository {

    public Consultation findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id

        Consultation consultation = session.find(Consultation.class, id);

        //consultation.getProjects().forEach( project -> System.out.println(project));

        session.close();
        return consultation;
    }

    public void save(Consultation consultation)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //The save method persists the object to the database
        session.save(consultation);
        transaction.commit();
        session.close();
    }

    public void delete(Consultation consultation)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(consultation);
        transaction.commit();
        session.close();
    }


    public void update(Consultation consultation)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(consultation);
        transaction.commit();
        session.close();
    }



}
