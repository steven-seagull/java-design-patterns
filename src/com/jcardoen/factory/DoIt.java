package com.jcardoen.factory;

public class DoIt {
   public static void CreateStuff() {
       ICreator bookCreator = new BookCreator();
       ICreator cdCreator = new CdCreator();

       System.out.println("Created a book of type: " + bookCreator.createItem().getClass().toString());
       System.out.println("Created a cd of type: " + cdCreator.createItem().getClass().toString());
   }
}
