package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private String sDT;
	private float dTB;
	public Student(String name, int age, String address, String sDT, float dTB) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.sDT = sDT;
		this.dTB = dTB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
		this.age = age;
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public float getdTB() {
		return dTB;
	}
	public void setdTB(float dTB) {
		if(dTB >= 0) {
			this.dTB = dTB;
		}
	}
}
