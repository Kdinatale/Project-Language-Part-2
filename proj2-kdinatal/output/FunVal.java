public class FunVal extends Value {
    public final String val;
    public final Expr arg;
    public Env en;
    public FunVal(String _val, Expr _arg, Env _env) {
	val = _val;
	arg = _arg;
	en = _env;
    }
    public String toString() {
	return "a function"; //edit
    }
}
