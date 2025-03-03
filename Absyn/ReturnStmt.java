package Absyn; 

public class ReturnStmt extends Stmt {
    public Exp expr; 

    public ReturnStmt (int p, Exp exp){
        pos = p ;
        expr = exp; 
    }
}
