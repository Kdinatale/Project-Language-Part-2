public class SeqExp extends Expr {
  public final Expr arg1;
  public final Expr arg2;
  public SeqExp(Expr _arg1, Expr _arg2) {
    arg1 = _arg1;
    arg2 = _arg2;
  }
  public Value eval(Env e) throws EvalError {
    Value v1 = arg1.eval(e);
    Value v2 = arg2.eval(e);
    return v2;
    
    

  }
  public String toString() {
    return "{ " + arg1.toString() + " ; " + arg2.toString() + " }";
  }
}