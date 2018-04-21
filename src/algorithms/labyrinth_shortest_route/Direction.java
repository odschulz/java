package algorithms.labyrinth_shortest_route;

public enum Direction {
    UP(0, -1),
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private int col;
    private int row;

    Direction(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }
}
