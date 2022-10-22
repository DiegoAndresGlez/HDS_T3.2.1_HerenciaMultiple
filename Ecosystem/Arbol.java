public class Arbol extends Plant{
    private int longevidad;
    private Integer tamano, peso;

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }

    public int getLongevidad() {
        return longevidad;
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

    public String toString() {
        String s = "";
        s += "Longevidad: "+longevidad+" anios\n";
        return super.toString() + s;
    }
}
