public class IfExp extends Expr {
  public final Expr arg1;
  public final Expr arg2;
  public final Expr arg3;
  
  public IfExp(Expr _arg1, Expr _arg2, Expr _arg3) {
    arg1 = _arg1;
    arg2 = _arg2;
    arg3 = _arg3;
  }
  
  public Value eval(Env e) throws EvalError {
    Value v1 = arg1.eval(e); 
    
    //checks if v1 and v2 are of the same type and if v1 is of boolean type --> possibly group apart
    //so that two different evaluation errors can bet thrown 
    
    if(v1 instanceof BoolVal){
        if(((BoolVal)v1).value) {
    	      return arg2.eval(e); 
        }
        else {
    	      return arg3.eval(e); //if the second expression true, returns argument 3 "else statement"
        }
    }
    else
        throw new EvalError("Evaluation error: test not a boolean");
  }
  public String toString() {
    return "if " + arg1.toString() + " then " + arg2.toString() + "else" + arg3.toString();
  }
}
