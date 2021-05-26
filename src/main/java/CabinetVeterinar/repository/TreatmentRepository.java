package CabinetVeterinar.repository;


import CabinetVeterinar.model.Animal;
import CabinetVeterinar.model.Treatment;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TreatmentRepository {
    GenericRepository<Treatment> treatmentGenericRepository = new GenericRepository<>();

    public void saveTreatment(Treatment treatment) {
        treatmentGenericRepository.save(treatment);
    }

    public Treatment findById(Treatment treatment, Integer id) {
        treatmentGenericRepository.findById(treatment, id);
        return treatment;
    }

    public void deleteTreatment(Treatment treatment) {
        treatmentGenericRepository.delete(treatment);
    }

    public void updateTreatment(Treatment treatment) {
        treatmentGenericRepository.update(treatment);
    }


}
