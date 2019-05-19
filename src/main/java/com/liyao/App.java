package com.liyao;

import org.apache.commons.lang3.StringUtils;
import org.omg.CORBA.INTERNAL;

import java.util.function.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(StringUtils.isBlank("aaa"));


        int i = 0;
        Function<Integer, Integer> function = (a)->a+i+1+1+1;

        BiFunction t = (a,b)->a.equals(b);
        Consumer t1 = (a) -> System.out.println(a);
        Supplier t2;
        Predicate t3;


        new App().tryParse((s)->Integer.parseInt(s), "999999");

    }

    public Integer tryParse(Function<String, Integer> function, String i) {
        return function.apply(i);
    }
}
