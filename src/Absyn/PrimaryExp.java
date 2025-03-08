package Absyn;

public class PrimaryExp extends Exp {
    public String id;
    public int conts;
    public Exp exp;
    public PrimaryExp (int p , String id ){
        pos = p;
        this.id = id;
    }
    public PrimaryExp (int p ,int conts ){
        pos = p;
        this.conts = conts;
    }
    public PrimaryExp (int p , Exp exp ){
        pos = p;
        this.exp = exp;
    }
}
