package work72.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageUtil {
	@Before("execution (* work63.*.*.*(..))")
	public void beforeMessage(JoinPoint joinPoint) {
		System.out.println("------" + joinPoint.getSignature() +"の処理を開始しますよ。");
	}
	@After("execution(* work63.*.*.*(..))")
	public void afterMessage(JoinPoint joinPoint) {
		System.out.println("------" + joinPoint.getSignature() +"の処理が終了しましたよ");
	}
	//ユーザーの情報が正しく認識された時
	@AfterReturning("execution(* work63.UserService.*.*(..))")
	public void serviceReturnMessage(JoinPoint joinPoint) {
		System.out.println("------" + joinPoint.getSignature() +"の処理が終了しましたよ");
	}
}
