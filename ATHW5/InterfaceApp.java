interface Lock {
    public boolean getLock();
}

class Padlock implements Lock {
    private boolean isLocked = false;
    public boolean getLock() {
        return isLocked;
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        Padlock padlock = new Padlock();

        if (padlock.getLock() == true) {
            System.out.println("lock is locked.");
        } else {
            System.out.println("lock is unlocked.");
        }
        
    }
}
