package Absyn; 

public class IntExp extends  Exp { 
    public int value; 

    public IntExp (int p, int v ){
        pos = p;
        value = v;
    }
}

