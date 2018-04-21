package algorithms.labyrinth_shortest_route;

public enum CellContent {
    WALL("-"),
    EMPTY("+"),
    PATH("\u001B[31m+\u001B[0m"),
    START("s");

    private final String content;

    CellContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
