package CabinetVeterinar.repository;

import CabinetVeterinar.model.Person;

public class PersonRepository {
    GenericRepository<Person> personGenericRepository = new GenericRepository<>();

    public void savePerson(Person person) {personGenericRepository.save(person);}


}
