package Ch19;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 어노테이션의 유지기간 (프로그램 동작중인 상태에서만 실행)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface C01CustomAnnotation {
	String value() default "HELLO WORLD";	// 필드로 간주
	int number() default 1;					// 필드로 간주
	boolean isOpen() default false;			// 필드로 간주
}
//ElementType.Type : 클래스, 인터페이스, eum... 적용
//ElementType.FIELD : 멤버 변수에 적용
//ElementType.METHOD : 메서드에 적용