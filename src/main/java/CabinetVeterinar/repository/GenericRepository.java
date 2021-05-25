package CabinetVeterinar.repository;

import CabinetVeterinar.model.Animal;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;

public class GenericRepository<T> {

    public T findById(T object, Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id
        Query query = session.createQuery("from " + object.getClass().getName() + " where id=" +
                id + "");
        T result = (T) query.getSingleResult();
        session.close();
        return object;
    }

    public void save(T object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //The save method persists the object to the database
        session.save(object);
        transaction.commit();
        session.close();
    }

    public void delete(T object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
    }


    public void update(T object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
    }


}

