package Thirdprogram;

public class Classtea {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Classtea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    public void addMilk() {
        if (isPrepared && !hasMilk) {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        } else if (!isPrepared) {
            System.out.println("Please prepare tea first.");
        } else {
            System.out.println("Milk is already added.");
        }
    }

    public void addSugar() {
        if (isPrepared && !hasSugar) {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        } else if (!isPrepared) {
            System.out.println("Please prepare tea first.");
        } else {
            System.out.println("Sugar is already added.");
        }
    }

    public static void main(String[] args) {
        Classtea myTea = new Classtea();

        myTea.prepareTea();
        myTea.addMilk();
        myTea.addSugar();
        myTea.addSugar();  // Adding sugar again to test duplicate

        System.out.println("Tea is ready: " + myTea.isPrepared);
        System.out.println("Has milk: " + myTea.hasMilk);
        System.out.println("Has sugar: " + myTea.hasSugar);
    }
}


