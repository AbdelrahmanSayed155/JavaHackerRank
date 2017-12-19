package JavaReflectionsCode;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Solution {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		System.out.println("-- Java Reflections --");
		
		Class aClass  = Customer.class;
		String className = aClass.getName();
		System.out.println("class name :" + className);
		
		String simpleClassName = aClass.getSimpleName();
		System.out.println("class Simple name :" + simpleClassName);
		
		int modifiers = aClass.getModifiers();
		System.out.println(" #class modifiers :" + modifiers);
		
		Package apackage = aClass.getPackage();
		System.out.println(" class apackage :" + apackage);
		
		Class superclass = aClass.getSuperclass();
		System.out.println(" class superclass :" + superclass);
	
		System.out.println("-- Java Interface Reflections --");
		Class[] interfaces = aClass.getInterfaces();
		for(Class inter:interfaces) {
			System.out.println(inter.getName());
		}
		
		
		System.out.println("-- Java Constructor Reflections --");
		Constructor[] constructors = aClass.getConstructors();
		for(Constructor con:constructors) {
			System.out.println(con.getName());
		}
		
		System.out.println("-- Java Methods Reflections --");
		Method [] meth = Customer.class.getMethods();
		for(Method m:meth) {
			System.out.println(m.getName());
		}
		
		System.out.println("-- Java Field Reflections --");
		Field[] feilds = aClass.getFields();
		for(Field m:feilds) {
			System.out.println(m.getName());
		}
		
		
		System.out.println("-- Annotation Field Reflections --");
		Annotation[] annotations = aClass.getAnnotations();
		for(Annotation ann:annotations) {
			System.out.println(ann.toString());
		}
	}

}
