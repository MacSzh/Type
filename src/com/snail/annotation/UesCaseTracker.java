package com.snail.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Uesr : MacSzh2013
 * Date : 14-1-12
 * Time : 下午2:28
 * Description :
 */
public class UesCaseTracker {
    public static void trackUseCases(List<Integer> useCases,Class<?> cl){
        for (Method m : cl.getDeclaredMethods()){
            UseCase useCase = m.getAnnotation(UseCase.class);
            if (useCase != null){
                System.out.println("Found Use Case : " + useCase.id()  + "  " + useCase.description());
                useCases.remove(new Integer(useCase.id()));
            }
        }

        for (int  i : useCases){
            System.out.println("Warning : Missing use case - " + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
//        add elements to the list
        Collections.addAll(useCases,47,48,49,50);
        trackUseCases(useCases,PasswordUtil.class);
    }
}
