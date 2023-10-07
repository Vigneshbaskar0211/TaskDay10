package Thirdprogram;
//Base Tea class
class Tea {
 public void prepareTea() {
     boilWater();
     steepTeaBag();
     pourInCup();
     addCondiments();
 }

 void boilWater() {
     System.out.println("Boiling water...");
 }

 void steepTeaBag() {
     System.out.println("Steeping the tea bag...");
 }

 void pourInCup() {
     System.out.println("Pouring tea into a cup...");
 }

 void addCondiments() {
     System.out.println("Adding condiments...");
 }
}

//Subclass for Black Tea
class BlackTea extends Tea {
 public BlackTea() {
     super(); // Call the no-argument constructor of the superclass Tea
 }

 @Override
 void steepTeaBag() {
     System.out.println("Steeping the black tea bag...");
 }

 @Override
 void addCondiments() {
     System.out.println("Adding lemon for black tea...");
 }
}

//Subclass for Green Tea
class GreenTea extends Tea {
 public GreenTea() {
     super(); // Call the no-argument constructor of the superclass Tea
 }

 @Override
 void steepTeaBag() {
     System.out.println("Steeping the green tea bag...");
 }

 @Override
 void addCondiments() {
     System.out.println("Adding honey for green tea...");
 }
}

//Subclass for Herbal Tea
class HerbalTea extends Tea {
 public HerbalTea() {
     super(); // Call the no-argument constructor of the superclass Tea
 }

 @Override
 void steepTeaBag() {
     System.out.println("Steeping the herbal tea bag...");
 }

 @Override
 void addCondiments() {
     System.out.println("Adding mint leaves for herbal tea...");
 }
}

public class MyTea {
 public static void main(String[] args) {
     // Create instances of each tea type and prepare them
     Tea blackTea = new BlackTea();
     System.out.println("Preparing Black Tea:");
     blackTea.prepareTea();
     System.out.println();

     Tea greenTea = new GreenTea();
     System.out.println("Preparing Green Tea:");
     greenTea.prepareTea();
     System.out.println();

     Tea herbalTea = new HerbalTea();
     System.out.println("Preparing Herbal Tea:");
     herbalTea.prepareTea();
 }
}
