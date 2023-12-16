package In.Abdul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import In.Abdul.entity.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

	public List<Citizen> findByvaccineCeneterId(Integer id);
}
