package mow;

public class Yard {
    public char yard[][];

    public Yard(int height, int width) {
        yard = new char[height + 2][width + 2];

        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                if (i == 0 || i == yard.length - 1 || j == 0 || j == yard[0].length - 1) {
                    yard[i][j] = '0';
                } else {
                    yard[i][j] = '+';
                }
            }
        }
    }

    public char getStatus(int row, int col) {
        return yard[row][col];
    }

    public void setCellValue(int row, int col, char value) {
        yard[row][col] = value;
    }

    public int returnHeight() {
        return yard.length - 2;
    }

    public int returnWidth() {
        return yard[0].length - 2;
    }

    public void printYard() {
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                System.out.print(yard[i][j]);
            }
            System.out.println();
        }
    }

    public void printYard(Mower mower) {
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                if (mower.getRow() == i && mower.getColumn() == j) {
                    switch (mower.getDirection()) {
                        case 0:
                            System.out.print("^");
                            break;
                        case 1:
                            System.out.print(">");
                            break;
                        case 2:
                            System.out.print("v");
                            break;
                        case 3:
                            System.out.print("<");
                            break;
                    }
                } else {
                    System.out.print(yard[i][j]);
                }
            }
            System.out.println();
        }
    }
}
