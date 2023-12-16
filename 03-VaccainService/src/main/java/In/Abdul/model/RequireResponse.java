package In.Abdul.model;

import java.util.List;

import In.Abdul.entity.VaccineCenter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequireResponse {

	@Id
	@GeneratedValue
	private VaccineCenter vaccineCenter;

	private List<Citizen> citizens;

}
