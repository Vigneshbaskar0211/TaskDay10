package polymorphism.java;

public class PolymorphismDemo {
	    public static void main(String[] args) {
	        // Create an array of Tea objects
	        Tea[] teas = new Tea[4];
	        teas[0] = new Tea();
	        teas[1] = new BlackTea();
	        teas[2] = new GreenTea();
	        teas[3] = new HerbalTea();

	        // Iterate through the array and prepare each tea
	        for (Tea tea : teas) {
	            System.out.println("Preparing Tea:");
	            tea.prepareTea();
	            System.out.println();
	        }
	    }
	}

	// Base Tea class
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

	// Subclass for Black Tea
	class BlackTea extends Tea {
	    @Override
	    void steepTeaBag() {
	        System.out.println("Steeping the black tea bag...");
	    }

	    @Override
	    void addCondiments() {
	        System.out.println("Adding lemon for black tea...");
	    }
	}

	// Subclass for Green Tea
	class GreenTea extends Tea {
	    @Override
	    void steepTeaBag() {
	        System.out.println("Steeping the green tea bag...");
	    }

	    @Override
	    void addCondiments() {
	        System.out.println("Adding honey for green tea...");
	    }
	}

	// Subclass for Herbal Tea
	class HerbalTea extends Tea {
	    @Override
	    void steepTeaBag() {
	        System.out.println("Steeping the herbal tea bag...");
	    }

	    @Override
	    void addCondiments() {
	        System.out.println("Adding mint leaves for herbal tea...");
	    }
	}


