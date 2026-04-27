package Ch02;

import java.util.Arrays;

class Profile
{
	// 속성
	private String name;
	private String addr;
	private String job;
	private String major;
	// 생성자
	// 1)디폴트생성자 삽입
	Profile() {
		
	}
	// 2)모든 인자 받는 생성자 삽입
	Profile(String str) {
		String [] result = str.split(","); 
		this.name = result[0];
		this.addr = result[1];
		this.job = result[2];
		this.major = result[3];
	}
	// 3)"홍길동,대구,프로그래머,컴퓨터공학" 을 받아 ,를 기준으로 잘라서 각 멤버에 저장
//	String str = "홍길동,대구,프로그래머,컴퓨터공학";
//	String [] result = str.split(",");
	
	
	
	// 기능
	// 1) 멤버변수를 은닉화 하고 getter and setter 를 만들어줍니다
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	// 2) toString 코드를 삽입
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}
	
	
	// 3) boolean isContain(String findstr) 함수 완성하기
	// findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
	// 아니면 false 리턴
	boolean isContain(String findstr) {
		if(this.name.contains(findstr)) {
			return true;
		} else if(this.addr.contains(findstr)) {
			return true;
		} else if(this.job.contains(findstr)) {
			return true;
		} else if(this.major.contains(findstr)) {
			return true;
		} else {
			return false;
		}
	}
	
	// 4) boolean isEquals(String str) {} 완성하기
	//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
	//"name,addr,job,major" 와 일치 하면 true
	//아니면 false 를 리턴
	boolean isEquals(String str) {
		String [] all = str.split(",");
		if(this.name.equals(all[0])) {
			return true;
		} else if(this.addr.equals(all[1])) {
			return true;
		} else if(this.job.equals(all[2])) {
			return true;
		} else if(this.major.equals(all[3])) {
			return true;
		}else {
			return false;
		} 
		
	}
	
}

public class C06Ex {

	public static void main(String[] args) {
		Profile hong = new Profile("홍길동,대구,프로그래머,컴퓨터공학");
		System.out.println(hong.toString());
		System.out.println("길동 포함여부 : " + hong.isContain("길동")); // true
		System.out.println("컴퓨터 포함여부 : " + hong.isContain("컴퓨터")); // true
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,대구,프로그래머,컴퓨터공학"));// false
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,울산,프로그래머,컴퓨터공학"));// false
	}
}