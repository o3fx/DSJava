package mow;

public class Mower {
    private int row;
    private int column;
    private int direction;

    public Mower(int row, int column, int direction) {
        this.row = row + 1;
        this.column = column + 1;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case 0:
                row--;
                break;
            case 1:
                column++;
                break;
            case 2:
                row++;
                break;
            case 3:
                column--;
                break;
        }
    }

    public void turnLeft() {
        direction = (direction + 3) % 4;
    }

    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    public boolean checkGrass(Yard yard) {
        switch (direction) {
            case 0:
                return yard.getStatus(row - 1, column) == '+';
            case 1:
                return yard.getStatus(row, column + 1) == '+';
            case 2:
                return yard.getStatus(row + 1, column) == '+';
            case 3:
                return yard.getStatus(row, column - 1) == '+';
            default:
                return false;
        }
    }

    public void cutGrass(Yard yard) {
        yard.setCellValue(row, column, ' ');
    }
}
