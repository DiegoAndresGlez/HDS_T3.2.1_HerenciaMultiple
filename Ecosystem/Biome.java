public class Biome {

	private String biome;

	public String getBiome() {
		return biome;
	}

	public void setBiome(String biome) {
		this.biome = biome;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Bioma: "+ biome +"\n";
		return s;
	}
}