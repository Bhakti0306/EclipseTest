package customAnnotations;

import static java.lang.annotation.ElementType.*;
import  java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;

@Retention(CLASS)
@Target(METHOD)
public @interface MyAnnotations 
{
	String name() default "xyz";

}
