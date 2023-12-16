package In.Abdul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import In.Abdul.entity.VaccineCenter;
import In.Abdul.model.Citizen;
import In.Abdul.model.RequireResponse;
import In.Abdul.repository.VaccineCenterRepository;

@RestController
public class VaccineController {

	@Autowired
	private VaccineCenterRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/addCenter")
	public VaccineCenter addVaccineCenter(@RequestBody VaccineCenter vaccineCenter) {
		return repository.save(vaccineCenter);
	}

	@GetMapping("/getRespo/{id}")
	public RequireResponse getAllDataBasedOnCenterId(@PathVariable Integer id) {

		// 1st get vaccination center details
		RequireResponse requireResponse = new RequireResponse();
		VaccineCenter vaccineCenter = repository.findById(id).get();

		requireResponse.setVaccineCenter(vaccineCenter);

		// then get all citizen registration center
		List<Citizen> citizens = restTemplate.getForObject("http://CITIZEN-SERVICE/get/id/" + id, List.class);
		requireResponse.setCitizens(citizens);
		return requireResponse;

	}

}
