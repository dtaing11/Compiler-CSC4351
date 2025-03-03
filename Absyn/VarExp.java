package Absyn;

import Symbol.Symbol;

public VarExp extends Exp{ public Symbol name;
public VarExp (int p, Symbol n){
    pos = p;
    name = n;}}
