public class AppExp extends Expr {
  public final String fun;
  public final Expr par;
  public AppExp(String _fun, Expr _par) {
    fun = _fun;
    par = _par;
  }
  public Value eval(Env e) throws EvalError {
    try{
      //Value v1 = par.eval(e);
      Value v = e.lookup(fun);
      Env en = ((FunVal) v).en;
      if(v instanceof FunVal){
        en =  en.addBinding(((FunVal)v).val, par.eval(e));
        ((FunVal) v).en = en;
        return (((FunVal)v).arg).eval(en);
      }
      else{
        throw new EvalError("Not a function: " + fun);
      }
    }catch(UnboundVar uv){
      throw new EvalError("Evaluation Error: Unbound variable " + fun);
    }
	  
  }
  public String toString() {
    return fun + "(" + par.toString() + ")";
  }
}
