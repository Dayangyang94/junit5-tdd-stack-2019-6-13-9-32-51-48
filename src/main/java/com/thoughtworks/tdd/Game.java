package com.thoughtworks.tdd;

public class Game {
	private static String FIZZ="fizz";
	 private static String BUZZ="buzz";
	 private static String WHIZZ="whizz";

	 
	  public String fizzBuzz(int i) {

	    if(i<1||i>120) {
	        return "UnValid";
	   }
	   String result="";
	   if(i%3==0) {
	    result+=FIZZ;
	   }
	   if(i%5==0) {
	    result+=BUZZ;
	   }
	   if(i%7==0) {
	    result+=WHIZZ;
	   }
	   if(result.equals("")) {
	    return String.valueOf(i);
	   }
	   return result;
	  }

}
