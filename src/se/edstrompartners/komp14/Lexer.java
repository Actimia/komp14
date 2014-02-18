package se.edstrompartners.komp14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Lexer {

    private static final Charset UTF8 = Charset.forName("UTF-8");

    private FileInputStream in;
    private Token lookahead;

    public Lexer(File file) {
        try {
            in = new FileInputStream(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
        advance();
    }

    public Token peek() {
        return lookahead;
    }

    private void advance() {

    }

    public void consume(Token t) {
        if (lookahead.equals(t)) {
            advance();
        } else {
            throw new LexerException("Expected token " + t.toString());
        }
    }
}

class LexerException extends RuntimeException {

    public LexerException(String msg) {
        super(msg);
    }

}
