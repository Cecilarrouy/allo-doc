package sopra.monRdv.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.monRdv.monrdv.model.LieuDeConsultation;

public interface ILieuDeConsultationRepository extends JpaRepository<LieuDeConsultation, Long>{
	
	@Query("select l from LieuDeConsultation l where l.praticien.id = :id")
	List<LieuDeConsultation> findAllByPraticien(@Param("id") Long id);

}
