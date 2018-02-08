package com.example;



/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

   /**
    * @param someone 
    */    
  public String final greet(String final someone) {
    return String.format("Hello, %s!", someone);
  }
}
