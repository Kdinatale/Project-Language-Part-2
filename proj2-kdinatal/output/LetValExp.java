public class LetValExp extends Expr {
	public final String var;
	public final Expr arg1;
	public final Expr arg2;
  public LetValExp(String _var, Expr _arg1, Expr _arg2) {
	var = _var;
	arg1 = _arg1;
	arg2 = _arg2;
  }
  public Value eval(Env e) throws EvalError {
    Value v = arg1.eval(e); //evaluate argument
    e = e.addBinding(var, v); //add binding
    Value v2 = arg2.eval(e);
    return v2;
  }
  public String toString() {
    return "let val " + var + " = " + arg1.toString() + " in " + arg2.toString() + " end";
  }
}
