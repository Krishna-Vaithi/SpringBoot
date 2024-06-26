package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(aop..*)")
    public void AuthenticatingPointCut(){}

    @Pointcut("within(aop..*)")
    public void AuthorizationPointCut(){}

    @Before("AuthenticatingPointCut() && AuthorizationPointCut()")
    public void Authenticate(){
        System.out.println("Authenticating the request");
    }
}
