package Absyn;

public class AssignExp extends Exp  {
    public Exp var; 
    public String op; 
    public Exp value; 

    public AssignExp (int p, Exp v, String o, Exp val ){
        pos = p; 
        var = v; 
        op = o; 
        value = val; 
    }
}
