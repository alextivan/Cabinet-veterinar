package CabinetVeterinar.repository;

import CabinetVeterinar.model.Animal;
import CabinetVeterinar.model.Person;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnimalRepository {
    public Animal findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id

        Animal animal = session.find(Animal.class, id);

        //animal.getProjects().forEach( project -> System.out.println(project));

        session.close();
        return animal;
    }

    public void save(Animal animal)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //The save method persists the object to the database
        session.save(animal);
        transaction.commit();
        session.close();
    }

    public void delete(Animal animal)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(animal);
        transaction.commit();
        session.close();
    }


    public void update(Animal animal)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(animal);
        transaction.commit();
        session.close();
    }




}
