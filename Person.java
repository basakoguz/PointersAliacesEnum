package Person;

import Person.HairColour.*;

public class Person {

  HairColour hairColour = BLACK;

  public Person(){

  }

  public static void main(String[] args){
    Person peterParker = new Person();
    Person spiderMan = peterParker;

    peterParker.hairColour = PINK;

//    System.out.println("Hair colour of Peter Parker: " + peterParker.hairColour);
//    System.out.println("Hair colour of Spiderman: " + spiderMan.hairColour);

  }
}
