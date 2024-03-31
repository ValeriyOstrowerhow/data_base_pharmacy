package de.aittr.data_base_pharmacy.controller;

import de.aittr.data_base_pharmacy.model.Patient;
import de.aittr.data_base_pharmacy.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/patients")
@RequiredArgsConstructor
public class PatientController {
    private final IPatientService patientService;
    @GetMapping
   public ResponseEntity<List<Patient>> getPatients(){
       return new ResponseEntity<>(patientService.getPatients(), HttpStatus.FOUND);
   }
   @PostMapping
   public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);

   }
   @PutMapping("/update/{id}")
   public Patient updatePatient(@RequestBody Patient patient, @PathVariable Long id){
        return patientService.updatePatient(patient, id);

   }
   @DeleteMapping("/delete/{id}")
   public void deleteStudent(@PathVariable Long id){
        patientService.deletePatient(id);
   }
   @GetMapping("/patient{id}")

   public Patient getPatientById(@PathVariable Long id){
        return patientService.getPatientById(id);
   }
}
