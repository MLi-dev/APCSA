package city;

public class City {
	private int index;
	private String cName;

	public City(String cName) {
		this.cName = cName;

	}

	public String getName() {
		return this.cName;
	}

	public void setCityIndex(int index) {
		this.index = index;
	}

	public int getCityIndex() {
		return this.index;
	}
}
