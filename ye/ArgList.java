/* Generated By:JJTree: Do not edit this line. ArgList.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ArgList extends SimpleNode {
  public ArgList(int id) {
    super(id);
  }

  public ArgList(CCalParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CCalParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f6aab1180bc02e31b793f4bb4d9150f8 (do not edit this line) */