package Absyn;
import Symbol.Symbol;

public class FunDec extends Absyn {
    public Ty returnType;
    public Symbol name;
    public VarDec[] params;
    public BlockStmt body;

    public FunDec(int p, Ty rt, Symbol n, VarDec[] ps, BlockStmt b) {
        pos = p;
        returnType = rt;
        name = n;
        params = ps;
        body = b;
    }
}
