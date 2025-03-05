package Absyn;

public class WhileStmt extends Stmt {
    public Exp condition; 
    public Stmt body;

    public WhileStmt (int p , Exp cond , Stmt b ){
        pos = p; 
        condition = cond; 
        body = b; 
    }
}
