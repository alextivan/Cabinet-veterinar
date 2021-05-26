package CabinetVeterinar.repository;

import CabinetVeterinar.model.Animal;
import CabinetVeterinar.model.Person;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnimalRepository {
    GenericRepository<Animal> animalGenericRepository = new GenericRepository<>();

    public void saveAnimal(Animal animal) {
        animalGenericRepository.save(animal);
    }

    public Animal findById(Animal animal, Integer id) {
        animalGenericRepository.findById(animal, id);
        return animal;
    }

    public void deleteAnimal(Animal animal) {
        animalGenericRepository.delete(animal);
    }

    public void updateAnimal(Animal animal) {
        animalGenericRepository.update(animal);
    }
}
