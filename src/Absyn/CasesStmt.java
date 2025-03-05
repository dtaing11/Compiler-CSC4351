package Absyn;

public class CasesStmt extends Stmt {
    public Exp caseValue; // Null for default case
    public Stmt[] body;

    public CasesStmt(int p, Exp value, Stmt[] b) {
        pos = p;
        caseValue = value;
        body = b;
    }
}
