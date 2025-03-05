package Absyn;
import Symbol.Symbol;

public class CallExp extends Exp {
    public Symbol funcName;
    public Exp[] args;

    public CallExp(int p, Symbol f, Exp[] a) {
        pos = p;
        funcName = f;
        args = a;
    }
}
