package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
 
 
 @Test
 public void should_1_To_1() {
  Game game=new Game();
  String result=game.fizzBuzz(1);
    Assertions.assertEquals("1", result);
    
 }
 
 @Test
 public void should_3_To_fizz() {
  Game game=new Game();
  String result=game.fizzBuzz(3);
    Assertions.assertEquals("fizz", result);
    
 }
 
 @Test
 public void should_5_To_buzz() {
  Game game=new Game();
  String result=game.fizzBuzz(5);
    Assertions.assertEquals("buzz", result);
    
 }
 @Test
 public void should_7_To_whizz() {
  Game game=new Game();
  String result=game.fizzBuzz(7);
    Assertions.assertEquals("whizz", result);
    
 }
 @Test
 public void should_15_To_fizzbuzz() {
  Game game=new Game();
  String result=game.fizzBuzz(15);
    Assertions.assertEquals("fizzbuzz", result);
    
 }
 @Test
 public void should_21_To_fizzwhizz() {
  Game game=new Game();
  String result=game.fizzBuzz(21);
    Assertions.assertEquals("fizzwhizz", result);
    
 }
 @Test
 public void should_35_To_buzzwhizz() {
  Game game=new Game();
  String result=game.fizzBuzz(35);
    Assertions.assertEquals("buzzwhizz", result);
    
 }
 
 @Test
 public void should_105_To_fizzbuzzwhizz() {
  Game game=new Game();
  String result=game.fizzBuzz(105);
    Assertions.assertEquals("fizzbuzzwhizz", result);
    
 }

}
