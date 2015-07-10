package ar.com.eduit.aspects;

import org.aspectj.lang.JoinPoint;

public class Logging {
	
	
	public void logParameters(JoinPoint joinPoint){
		System.out.print(joinPoint.getSignature().toShortString() +  "logging values ");
		Object[] args =  joinPoint.getArgs();
		for (Object arg : args) {
	      System.out.print(arg);			
		}
		System.out.println();
		
	}
	
	public void logReturnValue(final JoinPoint joinPoint,Object retVal){
		System.out.println( joinPoint.getSignature().getName() +  " returning " + retVal);
	}
	
	
	public void logException(Throwable ex){
		ex.printStackTrace();
	}

}
