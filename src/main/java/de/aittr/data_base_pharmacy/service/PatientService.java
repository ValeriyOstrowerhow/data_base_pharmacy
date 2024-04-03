package de.aittr.data_base_pharmacy.service;


import de.aittr.data_base_pharmacy.exception.PatientAlreadyExistsException;
import de.aittr.data_base_pharmacy.exception.PatientNotFoundException;
import de.aittr.data_base_pharmacy.model.Patient;
import de.aittr.data_base_pharmacy.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService{
    private final PatientRepository patientRepository;

    @Override
    public List<Patient> getPatients() {

        return patientRepository.findAll();
    }
    @Override
    public Patient addPatient(Patient patient) {
        if
        (patientAlreadyExists(patient.getEmail())
        ){
            throw new
                    PatientAlreadyExistsException(patient.getEmail() + " already exists!");
    }
        return
                patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient, Long id) {
        return
                patientRepository.findById(id).map(pa ->
                {
            pa.setFirstName(patient.getFirstName());
            pa.setLastName(patient.getLastName());
            pa.setEmail(patient.getEmail());
            pa.setDiscount(patient.getDiscount());
            return
                    patientRepository.save(pa);
        }).orElseThrow(() -> new
                        PatientNotFoundException("Sorry, this patient could not be found"));
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException("Sorry, no patient found with the Id: " +id));
    }

    @Override
    public void deletePatient(Long id) {
        if
        (!patientRepository.existsById(id)){
            throw new PatientNotFoundException("Sorry, patient not found");
        }
    }
        private boolean patientAlreadyExists(String email) {
        return
                patientRepository.findByEmail(email).isPresent();


    }
}

