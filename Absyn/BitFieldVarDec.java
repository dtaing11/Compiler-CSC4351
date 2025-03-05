package Absyn;

import Symbol.Symbol;

public class BitFieldVarDec extends VarDec {
    public int bitWidth;

    public BitFieldVarDec(int p, Ty t, Symbol n, int bw, boolean isExtern, boolean isStatic) {
        super(p, t, n, null, isExtern, isStatic);
        bitWidth = bw;
    }
}
