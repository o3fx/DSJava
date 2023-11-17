
class Lock {
   boolean isLocked = false;

    public void lock(){
        isLocked = true;
    }
    public void unlock(){
        isLocked = false;
    }
    public boolean getLock(){
        return isLocked; 
    }


}

public class Classes {
    public static void main(String[] args) {
        Lock padlock = new Lock();
        //Lock the lock
        padlock.lock();
        if (padlock.getLock() == true) {
            System.out.println("Door is locked");
        } else {
           System.out.println("Door is unlocked"); 
        }

        padlock.unlock();
        if (padlock.getLock() == true) {
            System.out.println("Door is locked");
        } else {
           System.out.println("Door is unlocked"); 
        }
    }

}

