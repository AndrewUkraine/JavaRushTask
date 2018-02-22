package com.javarush.task.task38.task3812;



import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface PrepareMyTest {
	Class<?>[] value() default Solution.class;

	String[] fullyQualifiedNames() default "";
}