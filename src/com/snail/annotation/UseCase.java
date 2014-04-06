package com.snail.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator
 * on 14-1-12.
 *
 * Target : define annotation where to use (a method )
 * Retention : define annotation which priority can use( SOURCE , CLASS , RUNTIME)
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    public int id();
    public String description () default "no description" ;
}
