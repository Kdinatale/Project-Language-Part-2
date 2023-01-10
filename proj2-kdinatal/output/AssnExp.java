public class AssnExp extends Expr {
  public final Expr arg;
  public final String var;
  public AssnExp(String _var, Expr _arg) {
	var = _var;
    arg = _arg;
  }
  public Value eval(Env e) throws EvalError {
	  try {
     	  Value v1 = e.lookup(var);
	     Value v2 = arg.eval(e);
		  if(v1 instanceof IntVal && v2 instanceof IntVal || v1 instanceof BoolVal && v2 instanceof BoolVal) {
			  e = e.updateBinding(var, v2);
			  return v2;
		  }
	 	 else 
		     throw new EvalError("Incompatible types in Assignment");
	  }
	  catch(UnboundVar uv) {
		  throw new EvalError("Evaluation Error: Unbound variable " + var);
	  }

  }
  public String toString() {
    return  var + " := " + arg.toString();
  }
}
