package carro;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarroConverter {

	CarroConverter CONVERTER = Mappers.getMapper(CarroConverter.class);

	@Mapping(source = "nomeModelo", target = "modelo")
	@Mapping(source = "numAssentos", target = "assentos")
	Carro getEntity(CarroDto dto);

	@Mapping(source = "modelo", target = "nomeModelo")
	@Mapping(source = "assentos", target = "numAssentos")
	CarroDto getDto(Carro entidade);

}
