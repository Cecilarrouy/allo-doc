package sopra.monRdv.monrdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.monRdv.monrdv.model.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long>{

}
