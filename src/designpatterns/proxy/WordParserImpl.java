package designpatterns.proxy;

public class WordParserImpl implements WordParser {

    private String[] words;

    public WordParserImpl(String text) {
        this.words = text.split("\\s+");
    }

    @Override
    public int getWordCount() {
        return this.words.length;
    }
}
