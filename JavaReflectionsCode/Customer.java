package JavaReflectionsCode;

public class Customer {
    
	Long id;
	Integer age;
	String name;
	int nationalId;
	

	public Customer() {
		System.out.println("defualt Constructor");
	}
	public Customer(int id) {
		System.out.println(id + " id Constructor");
	}
	public Customer(int id , String name) {
		System.out.println("id Constructor " + id +"name is"+name );
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNationalId() {
		return nationalId;
	}
	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}
	
	public void add() {
		System.out.println("add function");
	}
	
	public void sub() {
		System.out.println("sub function");
	}
	
	public void min() {
		System.out.println("min function");
	}
	
	public void max() {
		System.out.println("max function");
	}
	
	
}
