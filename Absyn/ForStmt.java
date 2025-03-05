package Absyn;



public class ForStmt extends Stmt {
    public VarDec varInit;
    public Exp expInit;
    public Exp condition;
    public Exp update;
    public Stmt body;

    public ForStmt(int p, VarDec v, Exp cond, Exp upd, Stmt b) {
        pos = p;
        varInit = v;
        expInit = null;
        condition = cond;
        update = upd;
        body = b;
    }


    public ForStmt(int p, Exp e, Exp cond, Exp upd, Stmt b) {
        pos = p;
        varInit = null;
        expInit = e;
        condition = cond;
        update = upd;
        body = b;
    }
}
