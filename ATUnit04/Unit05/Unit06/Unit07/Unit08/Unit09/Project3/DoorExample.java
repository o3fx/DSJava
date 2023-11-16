package Unit05.Unit06.Unit07.Unit08.Unit09.Project3;
class DoorSystem {

    boolean dashLeft = false;
    boolean dashRight = false;
    boolean outsideLeft = false;
    boolean outsideRight = false;
    boolean masterUnlock = true;
    boolean childLock = false;
    boolean insideLeft = false;
    boolean insideRight = false;

    enum GearState {
        PARK, DRIVE, GEAR1, GEAR2, GEAR3, NEUTRAL, REVERSE
    }

    GearState currentGear = GearState.PARK;

    public void updateState(String newState) {
        if (newState.length() >= 9)
            ;
        {
            if (newState.charAt(0) == 1) {
                dashLeft = true;
            } else {
                dashLeft = false;
            }

            if (newState.charAt(1) == '1') {
                dashRight = true;
            } else {
                dashRight = false;
            }

            if (newState.charAt(2) == '1') {
                childLock = true;
            } else {
                childLock = false;
            }

            if (newState.charAt(3) == '1') {
                masterUnlock = true;
            } else {
                masterUnlock = false;
            }
            if (newState.charAt(4) == '1') {
                outsideLeft = true;
            } else {
                outsideLeft = false;
            }
            if (newState.charAt(5) == '1') {
                outsideRight = true;
            } else {
                outsideRight = false;
            }
            if (newState.charAt(6) == '1') {
                insideLeft = true;
            } else {
                insideLeft = false;
            }
            if (newState.charAt(7) == '1') {
                insideRight = true;
            } else {
                insideRight = false;
            }

            if (newState.charAt(8) == 'P') {
                currentGear = GearState.PARK;
            } else if (newState.charAt(8) == 'D') {
                currentGear = GearState.DRIVE;
            } else if (newState.charAt(8) == '1') {
                currentGear = GearState.GEAR1;
            } else if (newState.charAt(8) == '2') {
                currentGear = GearState.GEAR2;
            } else if (newState.charAt(8) == '3') {
                currentGear = GearState.GEAR3;
            } else if (newState.charAt(8) == 'N') {
                currentGear = GearState.NEUTRAL;
            } else if (newState.charAt(8) == 'R') {
                currentGear = GearState.REVERSE;
            }

        }
    }

    public boolean isLeftOpen() {
        if (currentGear == GearState.PARK) {
            if (masterUnlock == true) {
                if (dashLeft == true) {
                    return true;

                } else if (outsideLeft == true) {
                    return true;
                } else if (insideLeft == true && childLock == false) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    public boolean isRightOpen() {
        if (currentGear == GearState.PARK) {
            if (masterUnlock == true) {
                if (dashRight == true) {
                    return true;

                } else if (outsideRight == true) {
                    return true;
                } else if (insideRight == true && childLock == false) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }

        } else {
            return false;
        }

    }
}

public class DoorExample {

    public static void main(String[] args) {
        boolean nobody = false;
        DoorSystem doorSys = new DoorSystem();
        doorSys.updateState("11110111D");
        if (doorSys.isLeftOpen() == true) {
            System.out.println("Left door is open");
            nobody = true;
        }
        if (doorSys.isRightOpen() == true) {
            System.out.println("Right door is open");
            nobody = true;
        }
        if (nobody == false) {
            System.out.println("Both doors are closed");
        }
    }
}
