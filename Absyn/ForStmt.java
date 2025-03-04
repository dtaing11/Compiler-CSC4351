package Absyn;

import Absyn.Exp;

public class ForStmt extends Stmt {
    public VarDec init;
    public Exp condition, update;
    public Stmt body;
    
    public ForStmt (int p , VarDec i, Exp cond, Exp upD, Stmt b){
        pos = p; 
        init = i;
        condition = cond; 
        update = upD;
        body = b; 
    }
}
