package Ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

class Person {
	protected String name;
	protected Integer age;
	// 디폴트
	Person (){}
	// 모든인자
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	// getter and setter
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
	// toSting
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

class Employee extends Person {
	String department;
	String role;
	// 디폴트
	Employee() {}

	// 모든인자
	public Employee(String name, Integer age, String department, String role) {
		super(name, age);
		this.department = department;
		this.role = role;
	}
	public Employee(Person person) {
		this.name = person.getName();
		this.age = person.getAge();
		this.department = "인턴";
		this.role = "-";
	}

	//getter and setter
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	//toString
	@Override
	public String toString() {
		return "Employee [department=" + department + ", role=" + role + ", name=" + name + ", age=" + age + "]";
	}
	
}


public class C01StreamMain {

	public static void main(String[] args) {
		// init
		List<Integer> li1 = Arrays.asList(1,2,3,4,5);
		System.out.println("li1 : " + li1 );
		
		// filter
		List<Integer> li2 = li1.stream()
								.filter((n)->{return n%2==0;})
								.collect(Collectors.toList());
		System.out.println("li2 : " + li2);
		
		//map
		List<Integer> li3 = li1 .stream()
								.filter((n)->{return n%2==1;}) // 1,3,5
								.map((n)->{return n*n;})	   // 1,9,25
								.collect(Collectors.toList());
		System.out.println("li3 : " + li3);
		
		//sorted
		List<Person> persons = Arrays.asList(
					new Person("홍길동",45),
					new Person("남길동",55),
					new Person("서길동",35),
					new Person("유재석",53),
					new Person("서장훈",32),
					new Person("강호동",27)
				);
				
		// 나이순 내림차순
		persons .stream()
				.sorted((a,b)->{return b.getAge() - a.getAge();})
				.forEach(System.out::println);
		
//		System.out.println(person);
		List<Integer> ages =
		persons.stream().map(Person::getAge).collect(Collectors.toList());
		System.out.println(ages);
		
		// persons 의 Person 객체를 Employee 로 변환해서 저장
		// Employee 의 상위 클래스는 Person
		// 부서속성(String department) , 직책속성(String role) 추가
		// 디폴트 생성자, 모든인자, getter and setter , toString 재정의 할것
		
//		List<Employee> employees = persons .stream()
//											.map((el) -> {
//												Employee ob = new Employee(
//															el.getName(),
//															el.getAge(),
//															null,
//															null
//														);
//												return ob;
//											})
//											.collect(Collectors.toList());
		// 코드줄이기
		List<Employee> employees = persons .stream()
				.map((person)->{return new Employee(person);})
				.collect(Collectors.toList());
		
		
//		List<Employee> employees = persons.stream().map( e -> new Employee(e.getName(), e.getAge(), "개발", "사원")).collect(Collectors.toList());
		// 조건 값마다 값 다르게 넣기
//		List<Employee> employees = persons
//				.stream()
//				.map( e -> {
//					String depart = null;
//					String role = null;
//					if(e.getName() == "홍길동") {
//						depart = "개발";
//						role = "사원";
//					}
//					if(e.getName() == "남길동") {
//						depart = "기획";
//						role = "사원";
//					}
//					if(e.getName() == "서길동") {
//						depart = "영업";
//						role = "사원";
//					}
//					if(e.getName() == "유재석") {
//						depart = "마케팅";
//						role = "사원";
//					}
//					if(e.getName() == "서장훈") {
//						depart = "경영";
//						role = "사원";
//					}
//					if(e.getName() == "강호동") {
//						depart = "환경";
//						role = "사원";
//					}
//					
//					return new Employee(e.getName(), e.getAge(), depart, role);
//					}
//				)
//				.collect(Collectors.toList());
		
		
//		System.out.println("Employee 변환 : " + employees);
		employees.forEach(System.out::println);
	}

}
