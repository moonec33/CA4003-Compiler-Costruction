/* Generated By:JavaCC: Do not edit this line. CCalParserVisitor.java Version 5.0 */
public interface CCalParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(program node, Object data);
  public Object visit(Var node, Object data);
  public Object visit(Const node, Object data);
  public Object visit(Function node, Object data);
  public Object visit(Type node, Object data);
  public Object visit(NemParL node, Object data);
  public Object visit(Main node, Object data);
  public Object visit(Statement node, Object data);
  public Object visit(Assign node, Object data);
  public Object visit(FuncAssign node, Object data);
  public Object visit(Plus_op node, Object data);
  public Object visit(Minus_op node, Object data);
  public Object visit(FuncReturn node, Object data);
  public Object visit(Minus node, Object data);
  public Object visit(BoolOp node, Object data);
  public Object visit(Condition node, Object data);
  public Object visit(AndOp node, Object data);
  public Object visit(OrOp node, Object data);
  public Object visit(Comp node, Object data);
  public Object visit(Equals node, Object data);
  public Object visit(NotEquals node, Object data);
  public Object visit(LessThan node, Object data);
  public Object visit(LessEqual node, Object data);
  public Object visit(GreaterThan node, Object data);
  public Object visit(GreaterEqual node, Object data);
  public Object visit(ArgList node, Object data);
  public Object visit(ID node, Object data);
}
/* JavaCC - OriginalChecksum=a81f3ad2f02f683ba59cd69213a76280 (do not edit this line) */