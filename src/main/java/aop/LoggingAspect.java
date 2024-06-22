package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* aop.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Logging method executed with Argument "+arg);
    }

    @After("execution(* *.*.checkOut(..))")
    public void afterLogger(){
        System.out.println("After Logging method executed");
    }

    @Pointcut("execution(* aop.ShoppingCart.quantity())")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning Logging method executed : "+ retVal);
    }
}
