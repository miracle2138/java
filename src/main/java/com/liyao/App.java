package com.liyao;

import org.apache.commons.lang3.StringUtils;
import org.omg.CORBA.INTERNAL;

import java.util.function.Function;

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
        Function<Integer, Integer> function = (a)->a+i;
    }
}
