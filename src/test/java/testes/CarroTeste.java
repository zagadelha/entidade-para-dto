package testes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import carro.Carro;
import carro.CarroConverter;
import carro.CarroDto;

public class CarroTeste {

	@Test
	public void testeEntidadeParaDto() {

		Carro carro = new Carro("Porche Cayenne", 2);
		CarroDto dto = CarroConverter.CONVERTER.getDto(carro);
		// ---------------------------
		assertThat(dto.getNomeModelo()).isEqualTo("Porche Cayenne");
		assertThat(dto.getNumAssentos()).isEqualTo("2");
	}

	@Test
	public void testeDtoParaEntidade() {

		CarroDto dto = new CarroDto("BMW Z1", "4");
		Carro entidade = CarroConverter.CONVERTER.getEntity(dto);
		// ---------------------------
		assertThat(entidade.getModelo()).isEqualTo("BMW Z1");
		assertThat(entidade.getAssentos()).isEqualTo(4);
	}

}
