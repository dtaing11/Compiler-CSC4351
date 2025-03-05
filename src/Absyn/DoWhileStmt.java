package Absyn;

public class DoWhileStmt extends Stmt{
    public Stmt body;
    public Exp condition;

    public DoWhileStmt (int p, Stmt s, Exp cond){
        pos = p;
        body = s;
        condition = cond;
    }
}
