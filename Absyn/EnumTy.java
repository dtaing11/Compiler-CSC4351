package Absyn;

import Symbol.Symbol;
import java.util.List;

public class EnumTy extends Ty{
    public  Symbol name;
    public List<EnumEntry> values;

    public EnumTy ( int p, Symbol n, List<EnumEntry> v){
        pos = p;
        name = n;
        values = v;
    }

 }
