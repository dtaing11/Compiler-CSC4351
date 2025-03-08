package Absyn;

public class PointerList extends Ty {
    public int level;

    // Constructor for a new pointer list
    public PointerList(int p) {
        this.pos = p;
        this.level = 1;
    }

    public PointerList(int p, PointerList prev) {
        this.pos = p;
        this.level = prev.level + 1;
    }
}
