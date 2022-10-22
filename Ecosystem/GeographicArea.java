public class GeographicArea {

	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Area: "+area+"\n";
		return s;
	}

}