/* Generated By:JJTree: Do not edit this line. BoolOp.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class BoolOp extends SimpleNode {
  public BoolOp(int id) {
    super(id);
  }

  public BoolOp(CCalParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CCalParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ec333f48ea4ebe400719a8acf8b97c67 (do not edit this line) */
