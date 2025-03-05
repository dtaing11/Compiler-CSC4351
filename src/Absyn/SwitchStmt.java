package Absyn;

public class SwitchStmt extends Stmt {
    public Exp condition;
    public CasesStmt[] cases;

    public SwitchStmt(int p, Exp c, CasesStmt[] cs) {
        pos = p;
        condition = c;
        cases = cs;
    }
}
