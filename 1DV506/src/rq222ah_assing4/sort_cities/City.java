package rq222ah_assing4.sort_cities;

public class City implements Comparable<City> {
	private int zipcode;
	private String Name;

	public City(String n) {
		int i = 0;
		String name = "";
		if (n.charAt(i) < 0 && n.charAt(i) > 9) {
			while (n.charAt(i) != ';') {
				name = name + n.charAt(i);
				i++;
			}
			zipcode = Integer.valueOf(n.substring(i + 1));
			Name = name;
		} else {
			while (n.charAt(i) != ';') {
				name = name + n.charAt(i);
				i++;
			}
			zipcode = Integer.valueOf(name);
			Name = n.substring(i + 1);
		}
	}

	public String cityname() {
		return this.Name;
	}

	public int zipcode() {
		return this.zipcode;
	}

	public int compareTo(City a) {
		return this.zipcode - a.zipcode;
	}

	public String toString() {
		return zipcode + " " + Name;
	}

}