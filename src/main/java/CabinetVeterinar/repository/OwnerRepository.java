package CabinetVeterinar.repository;


import CabinetVeterinar.model.Owner;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OwnerRepository {

    public Owner findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id

        Owner owner = session.find(Owner.class, id);

        //animal.getProjects().forEach( project -> System.out.println(project));

        session.close();
        return owner;

    }
    public void delete(Owner owner)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(owner);
        transaction.commit();
        session.close();
    }


    public void update(Owner owner)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(owner);
        transaction.commit();
        session.close();
    }


}
