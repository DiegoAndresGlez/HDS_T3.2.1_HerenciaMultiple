public class Ecosystem {

	private String name;

	public static void main(String[] args){
		Ecosystem ecosystem = new Ecosystem();
		Animal animal = new Animal();
		GeographicArea area = new GeographicArea();
		Biome biome = new Biome();
		Plant plant = new Plant();
		Dog dog = new Dog();
		Arbol arbol = new Arbol();
		Tundra tundra = new Tundra();
		Forest forest = new Forest();

		ecosystem.setName("Acuatico");
		System.out.println(ecosystem.getName());

		animal.setEspecie("Ballena");
		System.out.println(animal.getEspecie());
		animal.setColor("Azul");
		System.out.println(animal.getColor());
		animal.setPeso(130000);
		System.out.println(""+animal.getPeso()+" kg");
		animal.setTamano(24);
		System.out.println(""+animal.getTamano()+" m");
		
		area.setArea("Hemisferio sur");
		System.out.println(area.getArea());

		biome.setBiome("Oceano");
		System.out.println(biome.getBiome());

		plant.setColor("Blanco");
		System.out.println(plant.getColor());

		plant.setEspecie("Daisy");
		System.out.println(plant.getEspecie());

		System.out.println();

		dog.setEspecie("Beagle");
		dog.setColor("Cafe y blanco");
		dog.setPeso(30);
		dog.setTamano(110);
		dog.setWoof("Woof!");
		dog.setMamifero(true);
		dog.setOviparo(false);
		System.out.println(dog.toString());

		arbol.setEspecie("Secuoya");
		arbol.setColor("Cafe rojizo");
		arbol.setPeso(2000);
		arbol.setTamano(85);
		arbol.setLongevidad(1800);
		System.out.println(arbol.toString());
		
		tundra.setTipo("ARTICO");
		tundra.setTemp(-32.4);
		System.out.println(tundra.toString());

		forest.setTipo("tropical");
		forest.setTemp(36.2);
		System.out.println(forest.toString());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		String s = "";
		s += "Name: "+name+"\n";
		return s;
	}
}