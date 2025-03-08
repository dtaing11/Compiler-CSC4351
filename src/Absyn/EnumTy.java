package Absyn;

import Symbol.Symbol;

public class EnumTy  extends  Ty {
    public Symbol id;
     public EnumTy(int pos, Symbol id ) { this.pos = pos; this.id = id; }
}
