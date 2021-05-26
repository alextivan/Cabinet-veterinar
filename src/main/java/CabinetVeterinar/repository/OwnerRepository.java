package CabinetVeterinar.repository;


import CabinetVeterinar.model.Doctor;
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

    public Owner findById(Owner owner, Integer id) {
        ownerGenericRepository.findById(owner, id);
        return owner;

    }

    public void deleteOwner(Owner owner) {
        ownerGenericRepository.delete(owner);
    }

    public void updateOwner(Owner owner) {
        ownerGenericRepository.update(owner);
    }


}
