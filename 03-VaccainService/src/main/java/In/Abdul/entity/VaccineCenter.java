package In.Abdul.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MicroService_Vaccine")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccineCenter {

	@Id
	@GeneratedValue
	private Integer id;
	private String centername;
	private String centerAddress;

}
