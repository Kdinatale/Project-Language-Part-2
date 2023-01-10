public class LetFunExp extends Expr {
  public final String fun;
  public final String par;
  public final Expr e1;
  public final Expr e2;
  public LetFunExp(String _fun, String _par, Expr _e1, Expr _e2) {
    fun = _fun;
    par = _par;
    e1 = _e1;
    e2 = _e2;
  }
  public Value eval(Env e) throws EvalError {
    FunVal v = new FunVal(par, e1, e);
    e = e.addBinding(fun, v);
    e = e.updateBinding(fun, new FunVal(par, e1, e));
    return e2.eval(e); //evaluates the body and returns the result
  }
  public String toString() {
    return "let fun " + fun + "(" + par + ")" + " = " + e1.toString() + " in " + e2.toString() + " end";
  }
}
