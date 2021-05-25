package CabinetVeterinar.repository;

import CabinetVeterinar.model.Doctor;
import CabinetVeterinar.model.Owner;
import CabinetVeterinar.model.Person;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonRepository {
    public Person findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id


        Person person = session.find(Person.class, id);

        //person.getProjects().forEach( project -> System.out.println(project));

        session.close();
        return person;
    }

    public void saveDoctor(Person person, Doctor doctor) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(doctor);//adaugam doctor in baza de date
        doctor.setPerson(person);//setam accountul pe doctor
        session.save(person);//am adaugat person in baza de date si se genereaza in ID pt person
        transaction.commit();
        session.close();
    }

    public void saveOwner(Person person, Owner owner) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(owner);//adaugam owner in baza de date
        owner.setPerson(person); //setam accountul pe owner
        session.save(person);//am adaugat person in baza de date si se genereaza in ID pt person
        transaction.commit();
        session.close();
    }

     public void delete(Person person){
         Session session = SessionManager.getSessionFactory().openSession();
         Transaction transaction = session.beginTransaction();
         session.delete(person);
         transaction.commit();
         session.close();
     }

     public void update(Person person){
         Session session = SessionManager.getSessionFactory().openSession();
         Transaction transaction = session.beginTransaction();
         session.update(person);
         transaction.commit();
         session.close();
     }

//     public List<Employee> findAlEmployeesFromDepartment(String department){
//         Session session = SessionManager.getSessionFactory().openSession();
//         String hqlquery = "from Employee e  where e.department.name = :departmentName ";
//         Query<Employee> employeeQuery = session.createQuery(hqlquery);
//         employeeQuery.setParameter("departmentName",department);
//         List<Employee>employees = employeeQuery.list();
//         session.close();
//         return employees;
//     }



}
