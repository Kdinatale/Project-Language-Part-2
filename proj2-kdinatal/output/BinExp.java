public class BinExp extends Expr {
  public final Expr arg1;
  public final Expr arg2;
  public final BinOp op;
  
  public BinExp( BinOp _op, Expr _arg1, Expr _arg2) {
	op = _op; 
    arg1 = _arg1;
    arg2 = _arg2;
  }
  
  public Value eval(Env e) throws EvalError {
    Value v1 = arg1.eval(e); //evaluates expression 1 in environment E and sets it to v1 Value object
    Value v2 = arg2.eval(e);
    
    if (v1 instanceof IntVal && v2 instanceof IntVal) //checks that both values are of type integer
    	switch(op) {
		case PLUS: return new  IntVal((((IntVal)v1).value + ((IntVal)v2).value));
		case MINUS: return new IntVal((((IntVal)v1).value - ((IntVal)v2).value));
		case TIMES: return new IntVal((((IntVal)v1).value * ((IntVal)v2).value));
		case DIV: 
			if(((IntVal)v2).value == 0){
				throw new EvalError("Evaluation Error: division by zero");
			}
			else{
				return new IntVal((((IntVal)v1).value / ((IntVal)v2).value));
			}
		case LT: return new BoolVal((((IntVal)v1).value < ((IntVal)v2).value));
		case EQ: return new BoolVal((((IntVal)v1).value == ((IntVal)v2).value));
		//have to figure out and and or operators 
		default: return null;
	}
    else if(v1 instanceof BoolVal) {
    	switch(op) {
    	case OR: 
	    	if(((BoolVal)v1).value ) {
	    		return new BoolVal(true);
	    	}
	    	else {
	    		if(v2 instanceof BoolVal) {
	    			if(((BoolVal)v2).value) {
	    				return new BoolVal(true);
	    			}
	    			else {
	    				return new BoolVal(false);
	    			}
	    		}
	    		else {
	    			throw new EvalError("Evaluation Error: Incompatible arg types");
	    		}
	    	}
    	case AND: 
    		if(((BoolVal)v1).value == false) {
    			return new BoolVal(false);
    		}
    		else {
    			if(v2 instanceof BoolVal) {
    				if(((BoolVal)v2).value) {
	    				return new BoolVal(true);
	    			}
	    			else {
	    				return new BoolVal(false);
	    			}
    			}
    			else {
	    			throw new EvalError("Evaluation Error: Incompatible arg types");
	    		}
    		}
		case EQ:
			if(v2 instanceof BoolVal){
				return new BoolVal((((BoolVal)v1).value == ((BoolVal)v2).value));
			}
			else{
				throw new EvalError("Evaluation error: Incompatible arg types");
			}
    	default: throw new EvalError("Evaluation error: Incompatible arg types");
    	}
    }
    else {
      throw new EvalError("Evaluation error: Incompatible arg types");
    }
  }
  public String toString() {
    switch(op) {
    case PLUS: return arg1.toString() + " + " + arg2.toString();
    case MINUS: return arg1.toString() + " - " + arg2.toString();
    case TIMES: return arg1.toString() + " * " + arg2.toString();
    case DIV : return arg1.toString() + " / " + arg2.toString();
    case EQ: return arg1.toString() + " = " + arg2.toString();
    case LT: return arg1.toString() + " < " + arg2.toString();
    case AND: return arg1.toString() + " & " + arg2.toString();
    default: return "";
    }
  }
}
