
package Absyn;
import Symbol.Symbol;

public class VarDec extends Absyn  {

    public Ty type; 
    public Symbol name ; 
    public Exp init; 
    public boolean isExtern; 
    public boolean isStatic; 

    public VarDec(int p, Ty t , Symbol n , Exp i, boolean isEx, boolean isStat ){
        pos = p ;
        type = t; 
        name = n; 
        init = i ;
        isExtern = isEx;
        isStatic = isStat;
    }
    


}
