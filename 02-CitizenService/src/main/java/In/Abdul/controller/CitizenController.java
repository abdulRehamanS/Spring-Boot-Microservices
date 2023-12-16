package In.Abdul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import In.Abdul.entity.Citizen;
import In.Abdul.repository.CitizenRepository;

@RestController
public class CitizenController {

	@Autowired
	private CitizenRepository repository;

	@GetMapping("/")
	public String test() {
		return "API is working";

	}

	@PostMapping("/add")
	public Citizen addCitizen(@RequestBody Citizen citizen) {
		return repository.save(citizen);

	}

	@GetMapping("/get/{id}")
	public List<Citizen> getById(@PathVariable Integer id) {
		List<Citizen> findByvaccineCeneterId = repository.findByvaccineCeneterId(id);

		return findByvaccineCeneterId;
	}

}
