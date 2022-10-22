public class Plant {
	private String color;
	private String especie;

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

	@Override
	public String toString() {
		String s = "";
		s += "Color: "+color+"\n";
		s += "Especie: "+especie+"\n";
		return s;
	}
}