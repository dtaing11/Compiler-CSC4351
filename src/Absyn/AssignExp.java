package Absyn;

public class AssignExp extends Exp {
public Exp exp1, exp2;
public String op;

public AssignExp(int p, Exp p1, String op,Exp p2) {
    pos = p;
    this.exp1 = p1;
    this.exp2 = p2;
    this.op = op;
}

}
