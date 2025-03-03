package Absyn;

public class ForStmt extends Stmt {
    public Exp init, condition, update;
    public Stmt body;
    
    public ForStmt (int p ,Exp i, Exp cond, Exp upD, Stmt b){
        pos = p; 
        init = i;
        condition = cond; 
        update = upD;
        body = b; 
    }
}
