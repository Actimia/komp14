/* The following code was generated by JFlex 1.5.0-SNAPSHOT */

package gen;
import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
 */

class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\54\4\0"+
    "\1\53\1\0\1\15\1\16\1\5\1\51\1\17\1\52\1\20\1\4"+
    "\1\10\11\7\1\0\1\21\1\55\1\50\3\0\22\6\1\46\7\6"+
    "\1\13\1\0\1\14\3\0\1\31\1\25\1\41\1\44\1\30\1\32"+
    "\1\40\1\35\1\22\2\6\1\27\1\45\1\23\1\26\1\42\1\6"+
    "\1\36\1\33\1\24\1\37\1\43\1\34\1\6\1\47\1\6\1\11"+
    "\1\0\1\12\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\1\4\2\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\17\4\1\17\1\20\1\21\1\1\1\22\1\23\2\0"+
    "\1\4\1\24\20\4\1\25\2\0\1\26\1\27\17\4"+
    "\1\0\1\2\1\30\1\31\2\4\1\32\6\4\1\33"+
    "\1\34\4\4\1\35\1\4\1\36\1\4\1\37\4\4"+
    "\1\40\1\41\1\42\1\43\1\44\1\4\1\45\13\0"+
    "\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\56\0\212\0\56\0\270\0\346"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\56\0\56"+
    "\0\56\0\56\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa"+
    "\0\u0228\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a"+
    "\0\u0398\0\56\0\56\0\56\0\u03c6\0\56\0\56\0\u03f4"+
    "\0\u0422\0\u0450\0\270\0\u047e\0\u04ac\0\u04da\0\u0508\0\u0536"+
    "\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6"+
    "\0\u06d4\0\u0702\0\u0730\0\56\0\u075e\0\u078c\0\270\0\270"+
    "\0\u07ba\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc"+
    "\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c"+
    "\0\u075e\0\270\0\270\0\u0a9a\0\u0ac8\0\270\0\u0af6\0\u0b24"+
    "\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\270\0\270\0\u0c0a\0\u0c38"+
    "\0\u0c66\0\u0c94\0\270\0\u0cc2\0\270\0\u0cf0\0\270\0\u0d1e"+
    "\0\u0d4c\0\u0d7a\0\u0da8\0\270\0\270\0\270\0\270\0\270"+
    "\0\u0dd6\0\270\0\u0e04\0\u0e32\0\u0e60\0\u0e8e\0\u0ebc\0\u0eea"+
    "\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\u0fd0\0\56";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\7\1\27\1\30"+
    "\1\7\1\31\1\32\1\33\1\7\1\34\2\7\1\35"+
    "\1\36\1\37\1\7\1\40\1\41\1\7\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\60\0\1\4\57\0\1\50"+
    "\1\51\56\0\3\7\11\0\26\7\15\0\2\10\53\0"+
    "\3\7\11\0\1\7\1\52\6\7\1\53\15\7\14\0"+
    "\3\7\11\0\6\7\1\54\17\7\14\0\3\7\11\0"+
    "\13\7\1\55\1\56\11\7\14\0\3\7\11\0\4\7"+
    "\1\57\21\7\14\0\3\7\11\0\6\7\1\60\17\7"+
    "\14\0\3\7\11\0\5\7\1\61\20\7\14\0\3\7"+
    "\11\0\7\7\1\62\16\7\14\0\3\7\11\0\2\7"+
    "\1\63\23\7\14\0\3\7\11\0\13\7\1\64\12\7"+
    "\14\0\3\7\11\0\6\7\1\65\17\7\14\0\3\7"+
    "\11\0\5\7\1\66\20\7\14\0\3\7\11\0\15\7"+
    "\1\67\10\7\14\0\3\7\11\0\4\7\1\70\21\7"+
    "\14\0\3\7\11\0\7\7\1\71\16\7\14\0\3\7"+
    "\11\0\2\7\1\72\22\7\1\73\61\0\1\74\2\0"+
    "\1\50\1\3\1\4\53\50\5\75\1\76\50\75\6\0"+
    "\3\7\11\0\2\7\1\77\23\7\14\0\3\7\11\0"+
    "\12\7\1\100\13\7\14\0\3\7\11\0\1\101\25\7"+
    "\14\0\3\7\11\0\15\7\1\102\10\7\14\0\3\7"+
    "\11\0\4\7\1\103\21\7\14\0\3\7\11\0\1\7"+
    "\1\104\24\7\14\0\3\7\11\0\11\7\1\105\14\7"+
    "\14\0\3\7\11\0\5\7\1\106\20\7\14\0\3\7"+
    "\11\0\7\7\1\107\16\7\14\0\3\7\11\0\1\110"+
    "\25\7\14\0\3\7\11\0\2\7\1\111\23\7\14\0"+
    "\3\7\11\0\7\7\1\112\16\7\14\0\3\7\11\0"+
    "\3\7\1\113\22\7\14\0\3\7\11\0\1\114\25\7"+
    "\14\0\3\7\11\0\1\115\25\7\14\0\3\7\11\0"+
    "\14\7\1\116\11\7\14\0\3\7\11\0\11\7\1\117"+
    "\14\7\6\0\5\75\1\120\54\75\1\121\1\120\50\75"+
    "\6\0\3\7\11\0\11\7\1\122\14\7\14\0\3\7"+
    "\11\0\6\7\1\123\17\7\14\0\3\7\11\0\5\7"+
    "\1\124\20\7\14\0\3\7\11\0\16\7\1\125\7\7"+
    "\14\0\3\7\11\0\6\7\1\126\17\7\14\0\3\7"+
    "\11\0\11\7\1\127\14\7\14\0\3\7\11\0\2\7"+
    "\1\130\23\7\14\0\3\7\11\0\5\7\1\131\20\7"+
    "\14\0\3\7\11\0\15\7\1\132\10\7\14\0\3\7"+
    "\11\0\11\7\1\133\14\7\14\0\3\7\11\0\5\7"+
    "\1\134\20\7\14\0\3\7\11\0\22\7\1\135\3\7"+
    "\14\0\3\7\11\0\1\7\1\136\24\7\14\0\3\7"+
    "\11\0\1\137\25\7\14\0\3\7\11\0\2\7\1\140"+
    "\23\7\6\0\4\75\1\4\1\120\50\75\6\0\3\7"+
    "\11\0\6\7\1\141\17\7\14\0\3\7\11\0\2\7"+
    "\1\142\23\7\14\0\3\7\11\0\6\7\1\143\17\7"+
    "\14\0\3\7\11\0\1\144\25\7\14\0\3\7\11\0"+
    "\6\7\1\145\17\7\14\0\3\7\11\0\14\7\1\146"+
    "\11\7\14\0\3\7\11\0\11\7\1\147\14\7\14\0"+
    "\3\7\11\0\1\150\25\7\14\0\3\7\11\0\1\7"+
    "\1\151\24\7\14\0\3\7\11\0\6\7\1\152\17\7"+
    "\14\0\3\7\11\0\7\7\1\153\16\7\14\0\3\7"+
    "\11\0\13\7\1\154\12\7\14\0\3\7\11\0\17\7"+
    "\1\155\6\7\14\0\3\7\11\0\1\7\1\156\24\7"+
    "\14\0\3\7\11\0\17\7\1\157\6\7\14\0\3\7"+
    "\11\0\16\7\1\160\7\7\14\0\3\7\11\0\23\7"+
    "\1\161\2\7\14\0\3\7\11\0\1\7\1\162\24\7"+
    "\14\0\3\7\7\0\1\163\1\0\26\7\34\0\1\164"+
    "\66\0\1\165\42\0\1\166\51\0\1\167\77\0\1\170"+
    "\51\0\1\171\41\0\1\172\56\0\1\173\56\0\1\174"+
    "\60\0\1\175\51\0\1\176\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4094];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\1\11\2\1\12\11"+
    "\17\1\3\11\1\1\2\11\2\0\22\1\1\11\2\0"+
    "\21\1\1\0\42\1\13\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new Error("Illegal character <"+
                                                    yytext()+">");
          }
        case 39: break;
        case 2: 
          { /* ignore */
          }
        case 40: break;
        case 3: 
          { return symbol(sym.TIMES);
          }
        case 41: break;
        case 4: 
          { return symbol(sym.IDENT, yytext());
          }
        case 42: break;
        case 5: 
          { return symbol(sym.INTLITERAL, Integer.parseInt(yytext()));
          }
        case 43: break;
        case 6: 
          { return symbol(sym.LBRACE);
          }
        case 44: break;
        case 7: 
          { return symbol(sym.RBRACE);
          }
        case 45: break;
        case 8: 
          { return symbol(sym.LBRACKET);
          }
        case 46: break;
        case 9: 
          { return symbol(sym.RBRACKET);
          }
        case 47: break;
        case 10: 
          { return symbol(sym.LPAREN);
          }
        case 48: break;
        case 11: 
          { return symbol(sym.RPAREN);
          }
        case 49: break;
        case 12: 
          { return symbol(sym.COMMA);
          }
        case 50: break;
        case 13: 
          { return symbol(sym.DOT);
          }
        case 51: break;
        case 14: 
          { return symbol(sym.SEMI);
          }
        case 52: break;
        case 15: 
          { return symbol(sym.EQUALS);
          }
        case 53: break;
        case 16: 
          { return symbol(sym.PLUS);
          }
        case 54: break;
        case 17: 
          { return symbol(sym.MINUS);
          }
        case 55: break;
        case 18: 
          { return symbol(sym.NOT);
          }
        case 56: break;
        case 19: 
          { return symbol(sym.LESS_THAN);
          }
        case 57: break;
        case 20: 
          { return symbol(sym.IF);
          }
        case 58: break;
        case 21: 
          { return symbol(sym.LOGICAL_AND);
          }
        case 59: break;
        case 22: 
          { return symbol(sym.TYPEINT);
          }
        case 60: break;
        case 23: 
          { return symbol(sym.NEW);
          }
        case 61: break;
        case 24: 
          { return symbol(sym.THIS);
          }
        case 62: break;
        case 25: 
          { return symbol(sym.TRUE, Boolean.TRUE);
          }
        case 63: break;
        case 26: 
          { return symbol(sym.ELSE);
          }
        case 64: break;
        case 27: 
          { return symbol(sym.VOID);
          }
        case 65: break;
        case 28: 
          { return symbol(sym.MAIN);
          }
        case 66: break;
        case 29: 
          { return symbol(sym.FALSE, Boolean.FALSE);
          }
        case 67: break;
        case 30: 
          { return symbol(sym.WHILE);
          }
        case 68: break;
        case 31: 
          { return symbol(sym.CLASS);
          }
        case 69: break;
        case 32: 
          { return symbol(sym.LENGTH);
          }
        case 70: break;
        case 33: 
          { return symbol(sym.STATIC);
          }
        case 71: break;
        case 34: 
          { return symbol(sym.RETURN);
          }
        case 72: break;
        case 35: 
          { return symbol(sym.PUBLIC);
          }
        case 73: break;
        case 36: 
          { return symbol(sym.STRING);
          }
        case 74: break;
        case 37: 
          { return symbol(sym.TYPEBOOL);
          }
        case 75: break;
        case 38: 
          { return symbol(sym.SYSO);
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
