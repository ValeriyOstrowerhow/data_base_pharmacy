package de.aittr.data_base_pharmacy.service;

import de.aittr.data_base_pharmacy.model.Patient;


import java.util.List;

public interface IPatientService {
    Patient addPatient(Patient patient);
    List<Patient> getPatients();
    Patient updatePatient(Patient patient, Long id);
    Patient getPatientById(Long id);
    void deletePatient(Long id);

}

