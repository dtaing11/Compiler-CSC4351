package Absyn;

public class BinaryOpExp extends Exp {
    public Exp left, right; 
    public String op; 
    public BinaryOpExp (int p ,  Exp l ,String o , Exp r  ){
      pos = p; 
      left = l; 
      op = o; 
      right = r ; 
    }
}
