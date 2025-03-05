package Absyn;

import java.io.PrintWriter;

public class Print {
    private PrintWriter out;

    public Print(PrintWriter o) {
        out = o;
    }

    private void indent(int d) {
        for (int i = 0; i < d; i++)
            out.print(" ");
    }

    private void say(String s) {
        out.print(s);
    }

    private void sayln(String s) {
        out.println(s);
    }

    public void printStmt(Stmt s, int d) {
        indent(d);
        if (s instanceof IfStmt) printIfStmt((IfStmt) s, d);
        else if (s instanceof WhileStmt) printWhileStmt((WhileStmt) s, d);
        else if (s instanceof ForStmt) printForStmt((ForStmt) s, d);
        else if (s instanceof ReturnStmt) printReturnStmt((ReturnStmt) s, d);
        else if (s instanceof ExpStmt) printExpStmt((ExpStmt) s, d);
        else if (s instanceof BreakStmt) printBreakStmt((BreakStmt) s, d);
        else if (s instanceof ContinueStmt) printContinueStmt((ContinueStmt) s, d);
        else if (s instanceof SwitchStmt) printSwitchStmt((SwitchStmt) s, d);
        else throw new Error("ASTPrinter.printStmt: Unknown Stmt");
    }

    private void printIfStmt(IfStmt s, int d) {
        sayln("IfStmt(");
        printExp(s.condition, d + 1); sayln(",");
        printStmt(s.thenStmt, d + 1);
        if (s.elseStmt != null) {
            sayln(",");
            printStmt(s.elseStmt, d + 1);
        }
        say(")");
    }

    private void printWhileStmt(WhileStmt s, int d) {
        sayln("WhileStmt(");
        printExp(s.condition, d + 1); sayln(",");
        printStmt(s.body, d + 1);
        say(")");
    }

    private void printForStmt(ForStmt s, int d) {
        sayln("ForStmt(");
        printExp(s.expInit, d + 1); sayln(",");
        printExp(s.condition, d + 1); sayln(",");
        printExp(s.update, d + 1); sayln(",");
        printStmt(s.body, d + 1);
        say(")");
    }

    private void printReturnStmt(ReturnStmt s, int d) {
        say("ReturnStmt(");
        if (s.expr != null) printExp(s.expr, d + 1);
        say(")");
    }

    private void printExpStmt(ExpStmt s, int d) {
        say("ExpStmt(");
        printExp(s.expr, d + 1);
        say(")");
    }

    private void printBreakStmt(BreakStmt s, int d) {
        say("BreakStmt()");
    }

    private void printContinueStmt(ContinueStmt s, int d) {
        say("ContinueStmt()");
    }

    private void printSwitchStmt(SwitchStmt s, int d) {
        sayln("SwitchStmt(");
        printExp(s.condition, d + 1); sayln(",");
        printCaseList(s.cases, d + 1);
        say(")");
    }

    private void printCaseList(CasesStmt[] cases, int d) {
        say("CaseList(");
        for (CasesStmt c : cases) {
            sayln("");
            printCaseStmt(c, d + 1);
        }
        say(")");
    }

    private void printCaseStmt(CasesStmt c, int d) {
        say("CaseStmt(");
        if (c.caseValue != null) printExp(c.caseValue, d + 1);
        sayln(",");
        printStmtList(c.body, d + 1);
        say(")");
    }

    private void printStmtList(Stmt[] stmts, int d) {
        say("StmtList(");
        for (Stmt s : stmts) {
            sayln("");
            printStmt(s, d + 1);
        }
        say(")");
    }

    public void printExp(Exp e, int d) {
        indent(d);
        if (e instanceof IntExp) printIntExp((IntExp) e, d);
        else if (e instanceof VarExp) printVarExp((VarExp) e, d);
        else if (e instanceof AssignExp) printAssignExp((AssignExp) e, d);
        else if (e instanceof BinaryOpExp) printBinaryOpExp((BinaryOpExp) e, d);
        else throw new Error("ASTPrinter.printExp: Unknown Exp");
    }

    private void printIntExp(IntExp e, int d) {
        say("IntExp(" + e.value + ")");
    }

    private void printVarExp(VarExp e, int d) {
        say("VarExp(" + e.name.toString() + ")");
    }

    private void printAssignExp(AssignExp e, int d) {
        sayln("AssignExp(");
        printExp(e.var, d + 1); sayln(",");
        printExp(e.value, d + 1);
        say(")");
    }

    private void printBinaryOpExp(BinaryOpExp e, int d) {
        sayln("BinaryOpExp(" + e.op + ",");
        printExp(e.left, d + 1); sayln(",");
        printExp(e.right, d + 1);
        say(")");
    }
}
