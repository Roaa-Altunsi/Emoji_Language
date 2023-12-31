/* Generated By:JavaCC: Do not edit this line. Emoji_Language.java */
package CPCS302_Project_jj;

public class Emoji_Language implements Emoji_LanguageConstants {
  public static void main(String args []) throws ParseException
  {

    System.out.println("----- Weclome To Our Emoji Language :] ----- ");
    System.out.println("");
    System.out.print("Enter an expression: ");
    Emoji_Language parser = new Emoji_Language(System.in);
          try
          {
            Emoji_Language.Start();
            System.out.println("\u005cncorrect statement.");
            System.out.println("Thank you.");
          }
          catch (Exception e)
          {
            System.out.println("\u005cnOops, Incorrect statement.");
            System.out.println(e.getMessage());
          }
          catch(Error e)
          {
            System.out.println("\u005cnOops, Incorrect statement.");
            System.out.println(e.getMessage());
          }

  }

// ---------------------- GRAMMARS ------------------------- //
  static final public void Start() throws ParseException {
    Stmts();
  }

  static final public void Stmts() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
    case CONSTANT:
      Decleration_Stmt();
      jj_consume_token(END_STATEMENT);
      break;
    case ARR:
      Array();
      break;
    case LIST:
      List();
      break;
    case REPEAT:
      Iterative_Stmt();
      break;
    case INCASE:
      Conditional_Stmt();
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Decleration_Stmt() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CONSTANT:
      Constant_Stmt();
      break;
    case ID:
      Assignment_Stmt();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Constant_Stmt() throws ParseException {
    jj_consume_token(CONSTANT);
    jj_consume_token(ID);
    jj_consume_token(ASSIGNMENT);
    Stmt();
                                             System.out.println("Found a Constant");
  }

  static final public void Assignment_Stmt() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASSIGNMENT);
    Stmt();
                                System.out.println("Found an Assignment Statement");
  }

  static final public void Stmt() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
    case IN:
    case FL:
      Operand();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
      case MULTIPLY:
      case DIVIDE:
      case REMAINDER:
      case POWER:
      case IS_EQUAL:
      case NOT_EQUAL:
      case GREATER_THAN:
      case GREATER_THAN_OR_EQUAL:
      case LESS_THAN:
      case LESS_THAN_OR_EQUAL:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
        case MINUS:
        case MULTIPLY:
        case DIVIDE:
        case REMAINDER:
        case POWER:
          Arithmetic_Stmt();
          break;
        case IS_EQUAL:
        case NOT_EQUAL:
        case GREATER_THAN:
        case GREATER_THAN_OR_EQUAL:
        case LESS_THAN:
        case LESS_THAN_OR_EQUAL:
          Relational_Stmt();
          break;
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[3] = jj_gen;
        ;
      }
      break;
    case BO:
      Boolean_Stmt();
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Arithmetic_Stmt() throws ParseException {
    label_1:
    while (true) {
      Arithmetic_Operation();
      Operand();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
      case MULTIPLY:
      case DIVIDE:
      case REMAINDER:
      case POWER:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_1;
      }
    }
  }

  static final public void Relational_Stmt() throws ParseException {
    label_2:
    while (true) {
      Relational_Operation();
      Operand();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IS_EQUAL:
      case NOT_EQUAL:
      case GREATER_THAN:
      case GREATER_THAN_OR_EQUAL:
      case LESS_THAN:
      case LESS_THAN_OR_EQUAL:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_2;
      }
    }
  }

  static final public void Boolean_Stmt() throws ParseException {
    jj_consume_token(BO);
    label_3:
    while (true) {
      Logical_Operators();
      jj_consume_token(BO);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
      case OR:
      case NOT:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_3;
      }
    }
  }

  static final public void Arithmetic_Operation() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PLUS:
      jj_consume_token(PLUS);
      break;
    case MINUS:
      jj_consume_token(MINUS);
      break;
    case MULTIPLY:
      jj_consume_token(MULTIPLY);
      break;
    case DIVIDE:
      jj_consume_token(DIVIDE);
      break;
    case REMAINDER:
      jj_consume_token(REMAINDER);
      break;
    case POWER:
      jj_consume_token(POWER);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Relational_Operation() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IS_EQUAL:
      jj_consume_token(IS_EQUAL);
      break;
    case NOT_EQUAL:
      jj_consume_token(NOT_EQUAL);
      break;
    case GREATER_THAN:
      jj_consume_token(GREATER_THAN);
      break;
    case GREATER_THAN_OR_EQUAL:
      jj_consume_token(GREATER_THAN_OR_EQUAL);
      break;
    case LESS_THAN:
      jj_consume_token(LESS_THAN);
      break;
    case LESS_THAN_OR_EQUAL:
      jj_consume_token(LESS_THAN_OR_EQUAL);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Logical_Operators() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
      jj_consume_token(AND);
      break;
    case OR:
      jj_consume_token(OR);
      break;
    case NOT:
      jj_consume_token(NOT);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Array() throws ParseException {
    jj_consume_token(ARR);
    jj_consume_token(ID);
    jj_consume_token(OPEN_ANGLE_BRACKET);
    jj_consume_token(CLOSE_ANGLE_BRACKET);
    jj_consume_token(ASSIGNMENT);
    jj_consume_token(OPEN_SQUARE_BRACKET);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IN:
    case FL:
      Number();
      break;
    case LETTER:
    case SYMBOL:
      String();
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BAR:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_4;
      }
      jj_consume_token(BAR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IN:
      case FL:
        Number();
        break;
      case LETTER:
      case SYMBOL:
        String();
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(CLOSE_SQUARE_BRACKET);
    jj_consume_token(END_STATEMENT);
                                              System.out.println("Found an Array");
  }

  static final public void List() throws ParseException {
  int count = 0; Token listSize;
    jj_consume_token(LIST);
    jj_consume_token(ID);
    jj_consume_token(OPEN_ANGLE_BRACKET);
    listSize = jj_consume_token(IN);
    jj_consume_token(CLOSE_ANGLE_BRACKET);
    jj_consume_token(ASSIGNMENT);
    jj_consume_token(OPEN_SQUARE_BRACKET);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IN:
    case FL:
      Number();
      break;
    case LETTER:
    case SYMBOL:
      String();
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
                            count++;
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BAR:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_5;
      }
      jj_consume_token(BAR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IN:
      case FL:
        Number();
        break;
      case LETTER:
      case SYMBOL:
        String();
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
                                                                           count++;
    }
    jj_consume_token(CLOSE_SQUARE_BRACKET);
    jj_consume_token(END_STATEMENT);
    if (count != Integer.parseInt(listSize.image)) {if (true) throw new ParseException("The list must be of the specified size!");}
  }

  static final public void Iterative_Stmt() throws ParseException {
    jj_consume_token(REPEAT);
    Condition();
    jj_consume_token(OPEN_ROUND_BRACKET);
    label_6:
    while (true) {
      Stmts();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
      case CONSTANT:
      case INCASE:
      case REPEAT:
      case ARR:
      case LIST:
        ;
        break;
      default:
        jj_la1[17] = jj_gen;
        break label_6;
      }
    }
    jj_consume_token(CLOSE_ROUND_BRACKET);
  }

  static final public void Conditional_Stmt() throws ParseException {
    jj_consume_token(INCASE);
    Condition();
    jj_consume_token(SO);
    jj_consume_token(OPEN_ROUND_BRACKET);
    label_7:
    while (true) {
      Stmts();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
      case CONSTANT:
      case INCASE:
      case REPEAT:
      case ARR:
      case LIST:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_7;
      }
    }
    jj_consume_token(CLOSE_ROUND_BRACKET);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      Else_Stmt();
      break;
    default:
      jj_la1[19] = jj_gen;
      ;
    }
    jj_consume_token(END);
  }

  static final public void Condition() throws ParseException {
    jj_consume_token(OPEN_SQUARE_BRACKET);
    Operand();
    Relational_Stmt();
    jj_consume_token(CLOSE_SQUARE_BRACKET);
  }

  static final public void Else_Stmt() throws ParseException {
    jj_consume_token(ELSE);
    jj_consume_token(OPEN_ROUND_BRACKET);
    label_8:
    while (true) {
      Stmts();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
      case CONSTANT:
      case INCASE:
      case REPEAT:
      case ARR:
      case LIST:
        ;
        break;
      default:
        jj_la1[20] = jj_gen;
        break label_8;
      }
    }
    jj_consume_token(CLOSE_ROUND_BRACKET);
  }

  static final public void String() throws ParseException {
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETTER:
        jj_consume_token(LETTER);
        break;
      case SYMBOL:
        jj_consume_token(SYMBOL);
        break;
      default:
        jj_la1[21] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETTER:
      case SYMBOL:
        ;
        break;
      default:
        jj_la1[22] = jj_gen;
        break label_9;
      }
    }
  }

  static final public void Number() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IN:
      jj_consume_token(IN);
      break;
    case FL:
      jj_consume_token(FL);
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Operand() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IN:
    case FL:
      Number();
      break;
    case ID:
      jj_consume_token(ID);
      break;
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public Emoji_LanguageTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[25];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x80000000,0x80000000,0x3f7e0,0x3f7e0,0x80000000,0x7e0,0x3f000,0x1c0000,0x7e0,0x3f000,0x1c0000,0x60000000,0x10000000,0x60000000,0x60000000,0x10000000,0x60000000,0x80000000,0x80000000,0x0,0x80000000,0x60000000,0x60000000,0x0,0x80000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x718,0x8,0x0,0x0,0x7,0x0,0x0,0x0,0x0,0x0,0x0,0x3,0x0,0x3,0x3,0x0,0x3,0x718,0x718,0x40,0x718,0x0,0x0,0x3,0x3,};
   }

  /** Constructor with InputStream. */
  public Emoji_Language(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Emoji_Language(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Emoji_LanguageTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Emoji_Language(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new Emoji_LanguageTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Emoji_Language(Emoji_LanguageTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(Emoji_LanguageTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[45];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 25; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 45; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
