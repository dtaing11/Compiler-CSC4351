package Absyn;

public class BlockStmt extends Stmt  {
    public Stmt[] statements; 

    public BlockStmt (int p, Stmt[] stmts ){
        pos = p; 
        statements = stmts;
    }
}
