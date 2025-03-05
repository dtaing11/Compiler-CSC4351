package Absyn;

public class SizeofExp extends Exp{
    public Ty ty;
    public Exp expr;

    public SizeofExp (int p, Ty t){
        pos = p;
        ty = t;
    }

    public SizeofExp (int p, Exp e ){
        pos = p ;
        expr = e;
    }


}
