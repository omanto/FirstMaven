package com.mvform;

import org.joda.time.LocalTime;
import org.jsoup.Jsoup;

import com.entities.Greeter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String html1 = "<h1>Hello World!</h1>";
        String html2 = "<h2>Hello World 2!</h2>";
    	System.out.println(html1);
    	System.out.println(Jsoup.parse(html1).text());
    	
    	LocalTime time = new LocalTime();
    	
    	System.out.println(Jsoup.parse(html2).text() + ": il est : " + time);
    	
    	Greeter greeter = new Greeter();
    	System.out.println(greeter.sayHello());
    }
}
