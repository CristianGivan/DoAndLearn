package Curs.T220726;

public class CinemaHall {
    private int numberOfRows;
    private int numberOfColons;
    private char[][] grid;

    public CinemaHall(int numberOfRows, int numberOfColons) {
        this.numberOfRows = numberOfRows;
        this.numberOfColons = numberOfColons;
        this.grid = new char[numberOfRows][numberOfColons];
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfColons() {
        return numberOfColons;
    }

    public void setNumberOfColons(int numberOfColons) {
        this.numberOfColons = numberOfColons;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public void initialGridWithEmtySeets(){
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColons; j++) {
                grid[i][j]='e';
            }
        }
    }
}
