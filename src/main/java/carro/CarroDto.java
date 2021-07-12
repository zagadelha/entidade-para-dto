package carro;

public class CarroDto {

	private String nomeModelo;
	private String numAssentos;

	public CarroDto(String nomeModelo, String numAssentos) {
		super();
		this.nomeModelo = nomeModelo;
		this.numAssentos = numAssentos;
	}

	public String getNomeModelo() {
		return nomeModelo;
	}

	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}

	public String getNumAssentos() {
		return numAssentos;
	}

	public void setNumAssentos(String numAssentos) {
		this.numAssentos = numAssentos;
	}

}
