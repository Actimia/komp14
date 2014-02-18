
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Feb 18 17:30:41 CET 2014
//----------------------------------------------------

package se.edstrompartners.komp14;


/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Feb 18 17:30:41 CET 2014
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\062\000\002\002\004\000\002\002\004\000\002\003" +
    "\024\000\002\004\004\000\002\004\003\000\002\005\010" +
    "\000\002\006\004\000\002\006\003\000\002\007\005\000" +
    "\002\010\004\000\002\010\003\000\002\011\017\000\002" +
    "\012\005\000\002\012\003\000\002\013\006\000\002\013" +
    "\003\000\002\014\005\000\002\014\003\000\002\014\003" +
    "\000\002\014\003\000\002\015\004\000\002\015\003\000" +
    "\002\016\005\000\002\016\011\000\002\016\007\000\002" +
    "\016\007\000\002\016\006\000\002\016\011\000\002\017" +
    "\005\000\002\017\006\000\002\017\005\000\002\017\010" +
    "\000\002\017\003\000\002\017\003\000\002\017\003\000" +
    "\002\017\003\000\002\017\003\000\002\017\007\000\002" +
    "\017\006\000\002\017\004\000\002\017\005\000\002\020" +
    "\003\000\002\020\003\000\002\020\003\000\002\020\003" +
    "\000\002\020\003\000\002\021\004\000\002\021\003\000" +
    "\002\022\005\000\002\022\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\216\000\004\026\006\001\002\000\004\002\220\001" +
    "\002\000\006\004\156\026\157\001\002\000\004\050\007" +
    "\001\002\000\004\020\010\001\002\000\004\027\011\001" +
    "\002\000\004\030\012\001\002\000\004\031\013\001\002" +
    "\000\004\032\014\001\002\000\004\016\015\001\002\000" +
    "\004\033\016\001\002\000\004\022\017\001\002\000\004" +
    "\023\020\001\002\000\004\050\021\001\002\000\004\017" +
    "\022\001\002\000\004\020\023\001\002\000\012\004\031" +
    "\043\026\044\024\050\032\001\002\000\004\050\ufff0\001" +
    "\002\000\004\050\153\001\002\000\006\022\151\050\uffef" +
    "\001\002\000\012\004\031\043\026\044\024\050\032\001" +
    "\002\000\016\004\035\020\033\034\042\035\040\037\037" +
    "\050\036\001\002\000\020\004\ufffa\020\ufffa\027\ufffa\034" +
    "\ufffa\035\ufffa\037\ufffa\050\ufffa\001\002\000\004\050\uffee" +
    "\001\002\000\016\004\035\020\033\034\042\035\040\037" +
    "\037\050\036\001\002\000\016\004\035\020\033\034\042" +
    "\035\040\037\037\050\036\001\002\000\006\021\uffec\042" +
    "\uffec\001\002\000\006\022\135\040\134\001\002\000\004" +
    "\016\130\001\002\000\004\016\122\001\002\000\004\021" +
    "\120\001\002\000\004\016\043\001\002\000\022\011\052" +
    "\014\045\016\054\041\051\045\053\046\046\047\050\050" +
    "\044\001\002\000\032\004\uffde\005\uffde\006\uffde\007\uffde" +
    "\010\uffde\012\uffde\013\uffde\017\uffde\022\uffde\023\uffde\024" +
    "\uffde\025\uffde\001\002\000\006\043\111\050\112\001\002" +
    "\000\032\004\uffe0\005\uffe0\006\uffe0\007\uffe0\010\uffe0\012" +
    "\uffe0\013\uffe0\017\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0" +
    "\001\002\000\022\006\061\007\056\010\065\012\057\013" +
    "\060\017\107\022\066\025\063\001\002\000\032\004\uffdf" +
    "\005\uffdf\006\uffdf\007\uffdf\010\uffdf\012\uffdf\013\uffdf\017" +
    "\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\001\002\000\032" +
    "\004\uffdd\005\uffdd\006\uffdd\007\uffdd\010\uffdd\012\uffdd\013" +
    "\uffdd\017\uffdd\022\uffdd\023\uffdd\024\uffdd\025\uffdd\001\002" +
    "\000\022\011\052\014\045\016\054\041\051\045\053\046" +
    "\046\047\050\050\044\001\002\000\032\004\uffe1\005\uffe1" +
    "\006\uffe1\007\uffe1\010\uffe1\012\uffe1\013\uffe1\017\uffe1\022" +
    "\uffe1\023\uffe1\024\uffe1\025\uffe1\001\002\000\022\011\052" +
    "\014\045\016\054\041\051\045\053\046\046\047\050\050" +
    "\044\001\002\000\022\006\061\007\056\010\065\012\057" +
    "\013\060\017\064\022\066\025\063\001\002\000\022\011" +
    "\uffd5\014\uffd5\016\uffd5\041\uffd5\045\uffd5\046\uffd5\047\uffd5" +
    "\050\uffd5\001\002\000\022\011\uffd8\014\uffd8\016\uffd8\041" +
    "\uffd8\045\uffd8\046\uffd8\047\uffd8\050\uffd8\001\002\000\022" +
    "\011\uffd7\014\uffd7\016\uffd7\041\uffd7\045\uffd7\046\uffd7\047" +
    "\uffd7\050\uffd7\001\002\000\022\011\uffd6\014\uffd6\016\uffd6" +
    "\041\uffd6\045\uffd6\046\uffd6\047\uffd6\050\uffd6\001\002\000" +
    "\022\011\052\014\045\016\054\041\051\045\053\046\046" +
    "\047\050\050\044\001\002\000\006\015\071\050\072\001" +
    "\002\000\032\004\uffd9\005\uffd9\006\uffd9\007\uffd9\010\uffd9" +
    "\012\uffd9\013\uffd9\017\uffd9\022\uffd9\023\uffd9\024\uffd9\025" +
    "\uffd9\001\002\000\022\011\uffd4\014\uffd4\016\uffd4\041\uffd4" +
    "\045\uffd4\046\uffd4\047\uffd4\050\uffd4\001\002\000\022\011" +
    "\052\014\045\016\054\041\051\045\053\046\046\047\050" +
    "\050\044\001\002\000\022\006\061\007\056\010\065\012" +
    "\057\013\060\022\066\023\070\025\063\001\002\000\032" +
    "\004\uffe4\005\uffe4\006\uffe4\007\uffe4\010\uffe4\012\uffe4\013" +
    "\uffe4\017\uffe4\022\uffe4\023\uffe4\024\uffe4\025\uffe4\001\002" +
    "\000\032\004\uffe3\005\uffe3\006\uffe3\007\uffe3\010\uffe3\012" +
    "\uffe3\013\uffe3\017\uffe3\022\uffe3\023\uffe3\024\uffe3\025\uffe3" +
    "\001\002\000\004\016\073\001\002\000\024\004\074\011" +
    "\052\014\045\016\054\041\051\045\053\046\046\047\050" +
    "\050\044\001\002\000\004\017\uffd2\001\002\000\024\004" +
    "\101\006\061\007\056\010\065\012\057\013\060\022\066" +
    "\024\102\025\063\001\002\000\004\017\077\001\002\000" +
    "\032\004\uffe2\005\uffe2\006\uffe2\007\uffe2\010\uffe2\012\uffe2" +
    "\013\uffe2\017\uffe2\022\uffe2\023\uffe2\024\uffe2\025\uffe2\001" +
    "\002\000\004\017\uffd3\001\002\000\004\017\uffd0\001\002" +
    "\000\022\011\052\014\045\016\054\041\051\045\053\046" +
    "\046\047\050\050\044\001\002\000\024\004\101\006\061" +
    "\007\056\010\065\012\057\013\060\022\066\024\102\025" +
    "\063\001\002\000\004\017\uffd1\001\002\000\032\004\uffe5" +
    "\005\uffe5\006\061\007\056\010\065\012\057\013\060\017" +
    "\uffe5\022\066\023\uffe5\024\uffe5\025\063\001\002\000\032" +
    "\004\uffda\005\uffda\006\061\007\056\010\065\012\057\013" +
    "\060\017\uffda\022\066\023\uffda\024\uffda\025\063\001\002" +
    "\000\004\005\110\001\002\000\020\004\uffe8\020\uffe8\034" +
    "\uffe8\035\uffe8\036\uffe8\037\uffe8\050\uffe8\001\002\000\004" +
    "\022\115\001\002\000\004\016\113\001\002\000\004\017" +
    "\114\001\002\000\032\004\uffdb\005\uffdb\006\uffdb\007\uffdb" +
    "\010\uffdb\012\uffdb\013\uffdb\017\uffdb\022\uffdb\023\uffdb\024" +
    "\uffdb\025\uffdb\001\002\000\022\011\052\014\045\016\054" +
    "\041\051\045\053\046\046\047\050\050\044\001\002\000" +
    "\022\006\061\007\056\010\065\012\057\013\060\022\066" +
    "\023\117\025\063\001\002\000\032\004\uffdc\005\uffdc\006" +
    "\uffdc\007\uffdc\010\uffdc\012\uffdc\013\uffdc\017\uffdc\022\uffdc" +
    "\023\uffdc\024\uffdc\025\uffdc\001\002\000\004\021\121\001" +
    "\002\000\006\004\uffff\026\uffff\001\002\000\022\011\052" +
    "\014\045\016\054\041\051\045\053\046\046\047\050\050" +
    "\044\001\002\000\022\006\061\007\056\010\065\012\057" +
    "\013\060\017\124\022\066\025\063\001\002\000\014\020" +
    "\033\034\042\035\040\037\037\050\036\001\002\000\004" +
    "\036\126\001\002\000\014\020\033\034\042\035\040\037" +
    "\037\050\036\001\002\000\020\004\uffea\020\uffea\034\uffea" +
    "\035\uffea\036\uffea\037\uffea\050\uffea\001\002\000\022\011" +
    "\052\014\045\016\054\041\051\045\053\046\046\047\050" +
    "\050\044\001\002\000\022\006\061\007\056\010\065\012" +
    "\057\013\060\017\132\022\066\025\063\001\002\000\014" +
    "\020\033\034\042\035\040\037\037\050\036\001\002\000" +
    "\020\004\uffe9\020\uffe9\034\uffe9\035\uffe9\036\uffe9\037\uffe9" +
    "\050\uffe9\001\002\000\022\011\052\014\045\016\054\041" +
    "\051\045\053\046\046\047\050\050\044\001\002\000\022" +
    "\011\052\014\045\016\054\041\051\045\053\046\046\047" +
    "\050\050\044\001\002\000\022\006\061\007\056\010\065" +
    "\012\057\013\060\022\066\023\137\025\063\001\002\000" +
    "\004\040\140\001\002\000\022\011\052\014\045\016\054" +
    "\041\051\045\053\046\046\047\050\050\044\001\002\000" +
    "\022\005\142\006\061\007\056\010\065\012\057\013\060" +
    "\022\066\025\063\001\002\000\020\004\uffe6\020\uffe6\034" +
    "\uffe6\035\uffe6\036\uffe6\037\uffe6\050\uffe6\001\002\000\022" +
    "\005\144\006\061\007\056\010\065\012\057\013\060\022" +
    "\066\025\063\001\002\000\020\004\uffe7\020\uffe7\034\uffe7" +
    "\035\uffe7\036\uffe7\037\uffe7\050\uffe7\001\002\000\006\021" +
    "\uffed\042\uffed\001\002\000\004\021\147\001\002\000\020" +
    "\004\uffeb\020\uffeb\034\uffeb\035\uffeb\036\uffeb\037\uffeb\050" +
    "\uffeb\001\002\000\020\004\ufffb\020\ufffb\027\ufffb\034\ufffb" +
    "\035\ufffb\037\ufffb\050\ufffb\001\002\000\004\023\152\001" +
    "\002\000\004\050\ufff1\001\002\000\004\005\154\001\002" +
    "\000\012\004\ufff9\043\ufff9\044\ufff9\050\ufff9\001\002\000" +
    "\006\004\156\026\157\001\002\000\004\002\ufffd\001\002" +
    "\000\004\050\161\001\002\000\004\002\000\001\002\000" +
    "\004\020\162\001\002\000\012\004\031\043\026\044\024" +
    "\050\032\001\002\000\006\004\166\027\167\001\002\000" +
    "\004\021\216\001\002\000\006\004\166\027\167\001\002" +
    "\000\004\021\ufff7\001\002\000\010\043\026\044\024\050" +
    "\032\001\002\000\004\050\171\001\002\000\004\016\172" +
    "\001\002\000\012\004\175\043\026\044\024\050\032\001" +
    "\002\000\004\017\205\001\002\000\004\050\176\001\002" +
    "\000\004\017\ufff4\001\002\000\006\004\200\024\177\001" +
    "\002\000\010\043\026\044\024\050\032\001\002\000\004" +
    "\017\ufff2\001\002\000\004\017\ufff5\001\002\000\004\050" +
    "\203\001\002\000\006\004\200\024\177\001\002\000\004" +
    "\017\ufff3\001\002\000\004\020\206\001\002\000\012\004" +
    "\031\043\026\044\024\050\032\001\002\000\016\004\035" +
    "\020\033\034\042\035\040\037\037\050\036\001\002\000" +
    "\004\042\211\001\002\000\022\011\052\014\045\016\054" +
    "\041\051\045\053\046\046\047\050\050\044\001\002\000" +
    "\022\005\213\006\061\007\056\010\065\012\057\013\060" +
    "\022\066\025\063\001\002\000\004\021\214\001\002\000" +
    "\006\004\ufff6\027\ufff6\001\002\000\004\021\ufff8\001\002" +
    "\000\006\004\ufffc\026\ufffc\001\002\000\004\002\ufffe\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\216\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\006\004\157\005\154\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\006\027" +
    "\007\026\014\024\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\006\147\007\026\014\024" +
    "\001\001\000\006\015\040\016\033\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\015\145\016\033\001\001" +
    "\000\006\015\144\016\033\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\017\046\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\020\061\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\017\105\001\001\000\002\001\001\000\004\017\054" +
    "\001\001\000\004\020\061\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\017\104\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\017\066\001\001\000\004\020\061" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\017\074\021\075\001\001\000\002\001\001" +
    "\000\006\020\061\022\077\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\017\102\001\001\000\006\020\061\022\103\001\001\000" +
    "\002\001\001\000\004\020\061\001\001\000\004\020\061" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\017\115\001\001\000\004\020\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\017\122\001\001\000\004\020\061\001\001\000\004\016" +
    "\124\001\001\000\002\001\001\000\004\016\126\001\001" +
    "\000\002\001\001\000\004\017\130\001\001\000\004\020" +
    "\061\001\001\000\004\016\132\001\001\000\002\001\001" +
    "\000\004\017\142\001\001\000\004\017\135\001\001\000" +
    "\004\020\061\001\001\000\002\001\001\000\004\017\140" +
    "\001\001\000\004\020\061\001\001\000\002\001\001\000" +
    "\004\020\061\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\004\216\005\154\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\006\162\007\026\014\024\001\001\000\006\010" +
    "\163\011\164\001\001\000\002\001\001\000\006\010\214" +
    "\011\164\001\001\000\002\001\001\000\004\014\167\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\012\172" +
    "\014\173\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\200\001\001\000\004\014\201" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\203\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\006\206\007\026\014\024\001\001\000" +
    "\006\015\207\016\033\001\001\000\002\001\001\000\004" +
    "\017\211\001\001\000\004\020\061\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // ExpRest ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ExpRest",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // ExpRest ::= COMMA Expression ExpRest 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ExpRest",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // ExpList ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ExpList",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // ExpList ::= Expression ExpRest 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ExpList",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // Operation ::= TIMES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operation",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // Operation ::= MINUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operation",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // Operation ::= PLUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operation",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // Operation ::= LESS_THAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operation",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // Operation ::= LOGICAL_AND 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operation",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // Expression ::= LPAREN Expression RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Expression ::= NOT Expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Expression ::= NEW IDENT LPAREN RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Expression ::= NEW TYPEINT LBRACKET Expression RBRACKET 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Expression ::= THIS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Expression ::= IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Expression ::= FALSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Expression ::= TRUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Expression ::= INTLITERAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // Expression ::= Expression DOT IDENT LPAREN ExpList RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // Expression ::= Expression DOT LENGTH 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // Expression ::= Expression LBRACKET Expression RBRACKET 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // Expression ::= Expression Operation Expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Statement ::= IDENT LBRACKET Expression RBRACKET EQUALS Expression SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Statement ::= IDENT EQUALS Expression SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Statement ::= SYSO LPAREN Expression RPAREN SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Statement ::= WHILE LPAREN Expression RPAREN Statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Statement ::= IF LPAREN Expression RPAREN Statement ELSE Statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Statement ::= LBRACE Statements RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Statements ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statements",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Statements ::= Statement Statements 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statements",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Type ::= IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Type ::= TYPEINT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Type ::= TYPEBOOL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Type ::= TYPEINT LBRACKET RBRACKET 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // FormalRest ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FormalRest",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // FormalRest ::= COMMA Type IDENT FormalRest 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FormalRest",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FormalList ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FormalList",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // FormalList ::= Type IDENT FormalRest 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FormalList",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // MethodDecl ::= PUBLIC Type IDENT LPAREN FormalList RPAREN LBRACE VarDecls Statements RETURN Expression SEMI RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MethodDecl",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // MethodDecls ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MethodDecls",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // MethodDecls ::= MethodDecl MethodDecls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MethodDecls",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // VarDecl ::= Type IDENT SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecl",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // VarDecls ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecls",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // VarDecls ::= VarDecl VarDecls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecls",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ClassDecl ::= CLASS IDENT LBRACE VarDecls MethodDecls RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecl",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ClassDecls ::= empty 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ClassDecls ::= ClassDecl ClassDecls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // MainClass ::= CLASS IDENT LBRACE PUBLIC STATIC VOID MAIN LPAREN STRING LBRACKET RBRACKET IDENT RPAREN LBRACE VarDecls Statements RBRACE RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MainClass",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-17)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= MainClass ClassDecls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

