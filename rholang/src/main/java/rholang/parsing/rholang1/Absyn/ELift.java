package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class ELift extends Expr {
  public final Expr expr_;
  public final ListExpr listexpr_;
  public ELift(Expr p1, ListExpr p2) { expr_ = p1; listexpr_ = p2; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.ELift) {
      rholang.parsing.rholang1.Absyn.ELift x = (rholang.parsing.rholang1.Absyn.ELift)o;
      return this.expr_.equals(x.expr_) && this.listexpr_.equals(x.listexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.expr_.hashCode())+this.listexpr_.hashCode();
  }


}
