package algorithms.labyrinth_shortest_route;

import javafx.scene.control.Cell;

public class Point {
    private CellContent cellContent;
    private final int row;
    private final int col;
    private Point previousPoint;

    public Point(CellContent cellContent, int row, int col) {
        this.setCellContent(cellContent);
        this.row = row;
        this.col = col;
        this.previousPoint = null;
    }

    public void setCellContent(CellContent cellContent) {
        this.cellContent = cellContent;
    }

    public CellContent getCellContent() {
        return this.cellContent;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public Point getPreviousPoint() {
        return this.previousPoint;
    }

    public void setPreviousPoint(Point previousPoint) {
        this.previousPoint = previousPoint;
    }
}
