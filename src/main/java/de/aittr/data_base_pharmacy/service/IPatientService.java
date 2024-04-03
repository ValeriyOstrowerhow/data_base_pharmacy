package de.aittr.data_base_pharmacy.service;

import de.aittr.data_base_pharmacy.model.Patient;


import java.util.List;

/**
 * Service interface for managing
 * patients.
 */
public interface IPatientService {

    /**
     *  Adds a new patient.
     *
     * @param patient the patient to add
     * @return the added patient.
     */
    Patient addPatient(Patient patient);

    /**
     * Retrieves all patients.
     *
     * @return the list of patients
     */
    List<Patient> getPatients();

    /**
     * Updates an existing patient.
     *
     * @param patient the patient to update
     * @param id the id of the patient to update
     * @return the update patient
     */

    Patient updatePatient(Patient patient, Long id);

    /**
     * Retrieves a patient by ID.
     * @param id the id of the patient to retrieve
     * @return the patient with the given ID
     */
    Patient getPatientById(Long id);

    /**
     * Deletes a patient by ID.
     *
     * @param id the id of the patient to delete
     */
    void deletePatient(Long id);

}

