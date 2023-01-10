/* ProjLangParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ProjLangParserTokenManager.java */

/** Token Manager. */
public class ProjLangParserTokenManager implements ProjLangParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1ffe0L) != 0L)
         {
            jjmatchedKind = 17;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x1ddc0L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
            return 1;
         }
         if ((active0 & 0x2220L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0x5c00L) != 0L)
            return 1;
         if ((active0 & 0x181c0L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x80c0L) != 0L)
            return 1;
         if ((active0 & 0x10100L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 28);
      case 38:
         return jjStopAtPos(0, 22);
      case 40:
         return jjStopAtPos(0, 32);
      case 41:
         return jjStopAtPos(0, 33);
      case 42:
         return jjStopAtPos(0, 20);
      case 43:
         return jjStopAtPos(0, 23);
      case 45:
         return jjStopAtPos(0, 24);
      case 47:
         return jjStopAtPos(0, 21);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 59:
         return jjStopAtPos(0, 29);
      case 60:
         return jjStopAtPos(0, 27);
      case 61:
         return jjStopAtPos(0, 26);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4080L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x10800L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2020L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x8040L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 123:
         return jjStopAtPos(0, 30);
      case 124:
         return jjStopAtPos(0, 25);
      case 125:
         return jjStopAtPos(0, 31);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x11000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 102:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x140L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 111:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 1);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 108:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 1);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 1);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 1);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 110:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 1);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 1);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(2); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAdd(1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\151\146", "\164\150\145\156", 
"\145\154\163\145", "\167\150\151\154\145", "\144\157", "\154\145\164", "\146\165\156", 
"\166\141\154", "\151\156", "\145\156\144", "\164\162\165\145", "\146\141\154\163\145", null, 
null, "\72\75", "\52", "\57", "\46", "\53", "\55", "\174", "\75", "\74", "\41", 
"\73", "\173", "\175", "\50", "\51", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {0
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public ProjLangParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public ProjLangParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 3; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3ffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[3];
    private final int[] jjstateSet = new int[2 * 3];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
