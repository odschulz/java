package algorithms.labyrinth_shortest_route;

public class Main {

    public static void main(String[] args) {

        String[][] cells = new String[][] {
                {"-","-","-","-","-","-","-","-","-"},
                {"-","+","+", "+","+", "-","-","+","+"},
                {"-","-","+","-","+", "+","+", "+","-"},
                {"-","+","+", "-","+","-","+", "-","-"},
                {"-","s","-","+","+", "-","+","-","-"},
                {"-","-","+","+", "+","+", "+","+", "-"},
                {"-","-","-","-","-","-","-","+","-"}
        };

        Labyrinth labyrinth = new Labyrinth(9, 7, CellContent.values(), cells, Direction.values());
        for (Point[] row : labyrinth.getCells()) {
            for (Point cell : row) {
                System.out.print(cell.getCellContent().getContent() + " ");
            }
            System.out.println("");
        }
    }
}
