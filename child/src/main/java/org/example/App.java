package org.example;

import com.google.common.collect.ImmutableList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ImmutableList<String> myList = ImmutableList.<String>builder().add("foo").add("bar").build();
    }
}
