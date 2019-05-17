package com.nicefish.annotation;

import java.lang.annotation.Annotation;

@Deprecated
@SuppressWarnings("unchecked")
public class TestAnnotation {
    public static void main(String[] args) {
        boolean flag= TestAnnotation.class.isAnnotationPresent(Deprecated.class);
        System.out.println(flag);

        Annotation[] annotations= TestAnnotation.class.getAnnotations();
        for(Annotation annotation:annotations){
            System.out.println(annotation);
        }
    }
}
