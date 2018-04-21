package algorithms.labyrinth_shortest_route;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Labyrinth {
    private final int colCount;
    private final int rowCount;
    private Point startCell;
    private Map<String, CellContent> cellContentMap;
    private Point[][] cells;
    private Direction[] directions;


    public Labyrinth(int colCount, int rowCount, CellContent[] cellContents, String[][] cells, Direction[] directions) {
        this.colCount = colCount;
        this.rowCount = rowCount;
        this.setCellContentMap(cellContents);
        this.setCells(cells);
        this.directions = directions;
        this.calculatePath();
    }

    private void calculatePath() {
        boolean[][] visited = new boolean[this.getRowCount()][this.getColCount()];
        for (boolean[] booleans : visited) {
            Arrays.fill(booleans, false);
        }
        ArrayDeque<Point> pointsQueue = new ArrayDeque<>();
        pointsQueue.add(this.startCell);
        // @todo
        Point exitCell = null;

        while (!pointsQueue.isEmpty()) {
            Point currentCell = pointsQueue.remove();
            if (isExit(currentCell)) {
                this.drawPath(currentCell);
                break;
            }

            visited[currentCell.getRow()][currentCell.getCol()] = true;
            for (Direction direction : this.getDirections()) {
                int nextRow = currentCell.getRow() + direction.getRow();
                int nextCol = currentCell.getCol() + direction.getCol();
                if (visited[nextRow][nextCol] ||  this.cells[nextRow][nextCol].getCellContent() == CellContent.WALL) {
                    continue;
                }

                this.cells[nextRow][nextCol].setPreviousPoint(currentCell);
                pointsQueue.add(this.cells[nextRow][nextCol]);
            }
        }
    }

    private boolean isExit(Point cell) {
        int cellRow = cell.getRow();
        int cellCol = cell.getCol();
        for (Direction direction : this.getDirections()) {
            int newRow = cellRow + direction.getRow();
            int newCol = cellCol + direction.getCol();
            if (newRow == this.getRowCount() ||
                    newRow < 0 ||
                    newCol == this.getColCount() ||
                    newCol < 0) {
                return true;
            }
        }

        return false;
    }

    private void drawPath(Point currentCell) {
        if (currentCell != null) {
            if (currentCell.getCellContent() != CellContent.START) {
                currentCell.setCellContent(CellContent.PATH);
            }

            this.drawPath(currentCell.getPreviousPoint());
        }
    }

    public int getColCount() {
        return this.colCount;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    private void setCellContentMap(CellContent[] cellContentArray) {
        this.cellContentMap = new HashMap<>();
        for (CellContent cellContent : cellContentArray) {
            this.cellContentMap.put(cellContent.getContent(), cellContent);
        }
    }

    public void setCells(String[][] cells) {
        if (cells.length != this.rowCount) {
            throw new IllegalArgumentException("Invalid row count.");
        }

        this.cells = new Point[rowCount][colCount];
        this.startCell = null;

        for (int row = 0; row < cells.length; row++) {
            if (cells[row].length != this.colCount ) {
                throw new IllegalArgumentException("Invalid col count.");
            }

            for (int col = 0; col < cells[row].length; col++) {
                CellContent content = this.cellContentMap.get(cells[row][col]);
                this.cells[row][col] = new Point(content, row, col);
                if (content == CellContent.START) {
                    this.startCell = this.cells[row][col];
                }
            }

        }

        if (this.startCell == null) {
            throw new IllegalArgumentException("No start point provided.");
        }
    }

    public Point[][] getCells() {
        return this.cells.clone();
    }

    public Direction[] getDirections() {
        return this.directions;
    }


}
