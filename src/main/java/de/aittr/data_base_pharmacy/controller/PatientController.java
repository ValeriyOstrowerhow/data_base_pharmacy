package de.aittr.data_base_pharmacy.controller;

import de.aittr.data_base_pharmacy.model.Patient;
import de.aittr.data_base_pharmacy.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping(value = "/patients")
@RequiredArgsConstructor
public class PatientController {
    private final IPatientService patientService;

    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getPatients() {
        return new ResponseEntity<>(patientService.getPatients(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addPatient(@RequestBody Patient patient) {
        try {
            Patient newPatient =
                    patientService.addPatient(patient);
            return new ResponseEntity<>
                    (newPatient, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("We encountered an issue while registering the patient. Please try again:"
                    + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updatePatient(@RequestBody Patient patient, @PathVariable Long id) {
        try {
            Patient updatePatient = patientService.updatePatient(patient, id);

            return new ResponseEntity<>(updatePatient, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Updating the patient's information failed. Please check the details and try again : "
                    + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable Long id) {
        try {
            patientService.deletePatient(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>("There was a problem removing the patient. Please verify the ID and try again: "
                    + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/patient/{id}")

    public ResponseEntity<?>
    getPatientById(@PathVariable Long id) {
        try {
            Patient patient = patientService.getPatientById(id);
            return new ResponseEntity<>(patient, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("We couldn't find a patient with the provided ID. Please try a different ID:"
                    + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
