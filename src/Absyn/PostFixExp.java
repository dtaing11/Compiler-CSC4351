package Absyn;

import Symbol.Symbol;

public class PostFixExp extends Exp {
    public Exp exp1, exp2;
    public String sym;
    public  Symbol id;
    public PostFixExp(int p, Exp exp1) {
        pos = p;
        this.exp1 = exp1;
    }
    public PostFixExp(int p, Exp exp1, Exp exp2) {
        pos = p;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    public PostFixExp(int p, Exp exp1, String sym ,Symbol id) {
        pos = p;
        this.exp1 = exp1;
        this.sym = sym;
        this.id = id;
    }
}
