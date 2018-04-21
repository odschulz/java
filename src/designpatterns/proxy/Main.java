package designpatterns.proxy;

public class Main {
    public static void main(String[] args) {
        WordParser wordParser = new WordParserProxy("asdasd asdsad-asd asd asda dasgewfs");
        System.out.println(wordParser.getWordCount());
    }
}
