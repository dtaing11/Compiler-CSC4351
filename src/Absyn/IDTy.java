package Absyn;

import Symbol.Symbol;

public class IDTy extends Ty {
    public Symbol id;

    public IDTy(int pos, Symbol id ) { this.pos = pos;  this.id = id; }

}
