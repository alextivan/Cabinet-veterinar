package CabinetVeterinar.repository;


import CabinetVeterinar.model.Owner;
import CabinetVeterinar.model.Person;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OwnerRepository {

    GenericRepository<Owner> ownerGenericRepository = new GenericRepository<>();
    GenericRepository<Person> personGenericRepository = new GenericRepository<>();

    public void saveOwner(Owner owner, Person person) {
        personGenericRepository.save(person);
        owner.setPerson(person);
        ownerGenericRepository.save(owner);


    }


}
