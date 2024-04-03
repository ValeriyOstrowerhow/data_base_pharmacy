package de.aittr.data_base_pharmacy.repository;

import de.aittr.data_base_pharmacy.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByEmail(String email);
}
