package Absyn;


public class IfStmt extends Stmt {
    public Exp condition; 
    public Stmt thenStmt, elseStmt; 

    public IfStmt (int p, Exp cond , Stmt thenS, Stmt elseS) {
        pos = p; 
        condition = cond; 
        thenStmt = thenS; 
        elseStmt = elseS; 
    }
}
