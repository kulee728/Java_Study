package pre.properties;

import java.util.Comparator;

public class Movies implements Comparable<Movies>{
	private String name;
	private int rate;
	public String getName() {
		return name;
	}

	public int getRate() {
		return rate;
	}

	public int getAdmissions() {
		return admissions;
	}

	private int admissions;
	

	public Movies(String name, int rate, int admissions) {
		this.name = name;
		this.rate = rate;
		this.admissions = admissions;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", rate=" + rate + ", admissions=" + admissions + "]";
	}

	@Override
	public int compareTo(Movies o) {
		int result = this.rate-o.rate;
		if(result==0)
			return this.admissions-o.admissions;
		return result;
	}

}
