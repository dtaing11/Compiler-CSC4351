package Absyn;
import Symbol.Symbol;
public class GotoStmt extends Stmt {
    public Symbol n;
    public GotoStmt (int p, Symbol n ){
        pos = p;
        this.n= n;

    }

}
