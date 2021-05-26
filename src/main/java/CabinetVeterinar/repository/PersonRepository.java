package CabinetVeterinar.repository;

import CabinetVeterinar.model.Person;

public class PersonRepository {
    GenericRepository<Person> personGenericRepository = new GenericRepository<>();

    public void savePerson(Person person) {
        personGenericRepository.save(person);
    }

    public Person findById(Person person, Integer id) {
        personGenericRepository.findById(person, id);
        return person;

    }

    public void deletePerson(Person person) {
        personGenericRepository.delete(person);
    }

    public void updatePerson(Person person) {
        personGenericRepository.update(person);
    }


}
