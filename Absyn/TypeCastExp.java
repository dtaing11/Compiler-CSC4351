package Absyn;

public class TypeCastExp extends Exp{
        public Ty ty;
        public Exp expr;

        public TypeCastExp (int p, Ty t , Exp e){
            pos = p;
            ty = t;
            expr = e;
        }

}
