public class Tundra extends Biome{
    private String tipo;
    private double temp;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String t = tipo.toLowerCase();
        if(t.equals("artico") || t.equals("alpino")){
            this.tipo = t;
        }else{
            System.out.println("\nEl tipo de tundra no es correcto");
        }
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
	public String toString() {
		String s = "";
		s += "Tundra tipo: " + tipo +"\n";
        s += "Temperatura: " + temp +" Celsius\n";
		return s;
	}
}
