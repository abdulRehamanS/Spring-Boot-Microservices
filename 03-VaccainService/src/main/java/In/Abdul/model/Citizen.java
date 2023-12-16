package In.Abdul.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MicroService_Citzen")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer vaccineCeneterId;

}
