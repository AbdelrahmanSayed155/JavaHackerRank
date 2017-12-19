package JavaPriorityQueue;

public class Student implements Comparable<Student> {
	String name;
	double CGPA;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int compareTo(Student other) {
		if (getCGPA() > other.getCGPA())
			return -1;
		if (getCGPA() < other.getCGPA())
			return 1;
		int n = getName().compareTo(other.getName());
		if (n != 0)
			return n;
		if (getId() < other.getId())
			return -1;
		if (getId() > other.getId())
			return 1;
		return 0;
	}

}
