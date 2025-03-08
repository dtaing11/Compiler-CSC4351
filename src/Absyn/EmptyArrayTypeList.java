package Absyn;

public class EmptyArrayTypeList extends Ty{
    public int count;

    public EmptyArrayTypeList(int pos) {
        this.pos = pos;
        this.count = 1; // First `[]`
    }

    public EmptyArrayTypeList(int pos, EmptyArrayTypeList prev) {
        this.pos = pos;
        this.count = prev.count + 1;
    }
}
