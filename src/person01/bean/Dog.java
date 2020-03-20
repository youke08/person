package person01.bean;

public class Dog {
	
	public String name;
	public Integer age;
	
	
	public Dog(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void hello() {
		
		System.err.println("我是小白");
		
	}
	
	public static void main(String[] agr) {
		
		Dog d = new Dog("小白", 2);
		d.hello();
		
		
	}
	

}
