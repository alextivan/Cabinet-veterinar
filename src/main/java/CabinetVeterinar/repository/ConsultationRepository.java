package CabinetVeterinar.repository;

import CabinetVeterinar.model.Animal;
import CabinetVeterinar.model.Consultation;
import CabinetVeterinar.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ConsultationRepository {
    GenericRepository<Consultation> consultationGenericRepository = new GenericRepository<>();

    public void saveConsultation(Consultation consultation) {
        consultationGenericRepository.save(consultation);
    }

    public Consultation findById(Consultation consultation, Integer id) {
        consultationGenericRepository.findById(consultation, id);
        return consultation;

    }

    public void deleteConsultation(Consultation consultation) {
        consultationGenericRepository.delete(consultation);
    }

    public void updateConsultation(Consultation consultation) {
        consultationGenericRepository.update(consultation);
    }

}