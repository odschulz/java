package designpatterns.proxy;

public class WordParserProxy implements WordParser {
    private WordParser wordParser = null;
    private String text;

    public WordParserProxy(String text) {
        this.text = text;
    }

    @Override
    public int getWordCount() {
        // Lazy initiation.
        if (this.wordParser == null) {
            this.wordParser = new WordParserImpl(this.text);
        }

        return this.wordParser.getWordCount();
    }
}
