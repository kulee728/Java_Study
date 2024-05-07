package pre.properties2;

public class Drama implements Comparable<Drama>{
	private String name;
	private int startYear;
	private int episodes;
	@Override
	public int compareTo(Drama o) {
		return this.startYear-o.startYear;
	}
	
	@Override
	public String toString() {
		return "Drama [name=" + name + ", startYear=" + startYear + ", episodes=" + episodes + "]";
	}

	public Drama(String name, int startYear, int episodes) {
		this.name = name;
		this.startYear = startYear;
		this.episodes = episodes;
	}
	
}
