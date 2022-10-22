public class Animal {

	private String color;
	private String especie;
	private Integer tamano;
	private Integer peso;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Integer getTamano() {
		return tamano;
	}

	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Color: "+color+"\n";
		s += "Especie: "+especie+"\n";
		s += "Tamano: "+tamano+"\n";
		s += "Peso: "+peso+"\n";
		return s;
	}
}