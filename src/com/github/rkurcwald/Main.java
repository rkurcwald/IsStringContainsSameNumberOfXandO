package com.github.rkurcwald;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String methodName= "testSomething";
		String tmp=methodName;
        
        int testVal=7;
        for(int i=1;i<=testVal;i++)
        {
        	methodName+=i;
        	SolutionTest st=new SolutionTest();
        	Method setNameMethod = st.getClass().getMethod(methodName);
        	setNameMethod.invoke(st);
        	methodName=tmp;
        }

	}

}
