package javastudy0424;

	//이름, 나이, 연봉을 저장하는 클래스
public class UserData {
	
	//이름,나이,연봉을 저장하는 클래스
	//저장 프로퍼티
	private String name;
	private String age;
	private String salary;
	
	public UserData() {
		super();
		
	}
	public UserData(String name, String age, String salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "UserData [이름=" + name + ", 나이=" + age + ", 월급=" + salary + "]";
	}
	
	
	
	
}
