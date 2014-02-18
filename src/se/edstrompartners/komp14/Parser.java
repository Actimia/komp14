package se.edstrompartners.komp14;

import java.io.File;

public class Parser {

    private Lexer lex;

    public Parser(File file) {
        lex = new Lexer(file);

    }
}
