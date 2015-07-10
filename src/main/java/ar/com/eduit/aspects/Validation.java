package ar.com.eduit.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class Validation {
	
	
	public Object isNotNull(ProceedingJoinPoint joinpoint){
	   Object firstArg = joinpoint.getArgs()[0];
	   if(firstArg != null){
		   try {
			 System.out.println("parametro no nulo continuar");   
			return joinpoint.proceed(joinpoint.getArgs());
		} catch (Throwable e) {
		   e.printStackTrace();
		}
	   }else{
		   System.out.println( " parametro no puede ser nulo");
	   }
	   return null;
	}

}
