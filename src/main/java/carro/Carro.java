package carro;

public class Carro {

	private String modelo;
	private int assentos;

	public Carro(String modelo, int assentos) {
		super();
		this.modelo = modelo;
		this.assentos = assentos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

}
