package Absyn;

public class ExpStmt extends Stmt {
    public Exp expr; 
    public ExpStmt ( int p, Exp e ){
        pos = p ;
        expr = e;
    }
}
