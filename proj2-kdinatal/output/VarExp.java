public class VarExp extends Expr {
  public final String arg;
  public VarExp(String _arg) {
    arg = _arg;
  }
  public Value eval(Env e) throws EvalError {
	  try {
		  Value v1 = e.lookup(arg);
		  return v1;
	  }
	  catch(UnboundVar uv) {
		  throw new EvalError("Evaluation Error: Unbound variable " + arg);
	  }
  }
  public String toString() {
    return arg;
  }
}
