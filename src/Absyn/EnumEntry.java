package Absyn;
import Symbol.Symbol;
public class EnumEntry {
    public Symbol name;
    public Exp value;

    public EnumEntry (int p, Symbol n, Exp v){
        name = n;
        value = v;
    }

}
