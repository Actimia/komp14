import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
 */
%%

%class Lexer
%unicode
%cup
%line
%column

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Identifier = [a-zA-Z][a-zA-Z0-9]*
IntegerLiteral = 0|[1-9][0-9]*


%%

<YYINITIAL> {
    /* punctuation */
    "{"                             { return symbol(sym.LBRACE); }
    "}"                             { return symbol(sym.RBRACE); }
    "["                             { return symbol(sym.LBRACKET); }
    "]"                             { return symbol(sym.RBRACKET); }
    "("                             { return symbol(sym.LPAREN); }
    ")"                             { return symbol(sym.RPAREN); }
    ","                             { return symbol(sym.COMMA); }
    "."                             { return symbol(sym.DOT); }
    ";"                             { return symbol(sym.SEMI); }

    /* types */
    "int"                           { return symbol(sym.TYPEINT); }
    "boolean"                       { return symbol(sym.TYPEBOOL); }

    /* keywords */
    "if"                            { return symbol(sym.IF); }
    "else"                          { return symbol(sym.ELSE); }
    "while"                         { return symbol(sym.WHILE); }
    "this"                          { return symbol(sym.THIS); }
    "return"                        { return symbol(sym.RETURN); }

    "new"                           { return symbol(sym.NEW); }
    "this"                          { return symbol(sym.THIS); }
    "length"                        { return symbol(sym.LENGTH); }

    "class"                         { return symbol(sym.CLASS); }
    "public"                        { return symbol(sym.PUBLIC); }
    "static"                        { return symbol(sym.STATIC); }
    "void"                          { return symbol(sym.VOID); }
    "main"                          { return symbol(sym.MAIN); }
    "String"                        { return symbol(sym.STRING); }
    "System.out.println"            { return symbol(sym.SYSO); }


    /* operators */
    "="                             { return symbol(sym.EQUALS); }
    "+"                             { return symbol(sym.PLUS); }
    "-"                             { return symbol(sym.MINUS); }
    "*"                             { return symbol(sym.TIMES); }
    "&&"                            { return symbol(sym.LOGICAL_AND); }
    "!"                             { return symbol(sym.NOT); }
    "<"                             { return symbol(sym.LESS_THAN); }
    "."                             { return symbol(sym.DOT); }

    /* literals */
    {IntegerLiteral}                { return symbol(sym.INTLITERAL, Integer.parseInt(yytext())); }
    "true"                          { return symbol(sym.TRUE, Boolean.TRUE); }
    "false"                         { return symbol(sym.FALSE, Boolean.FALSE); }

    /* identifiers */
    {Identifier}                    { return symbol(sym.IDENT, yytext()); }

    /* comments */
    {Comment}                       { /* ignore */ }

    /* whitespace */
    {WhiteSpace}                    { /* ignore */ }
}

 /* error fallback */
[^]                             { throw new Error("Illegal character <"+
                                                    yytext()+">"); }
