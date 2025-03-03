package Absyn;

public class SwitchStmt extends Stmt {
    public Exp condition;
    public CaseStmt[] cases;

    public SwitchStmt(int p, Exp c, CaseStmt[] cs) {
        pos = p;
        condition = c;
        cases = cs;
    }
}
