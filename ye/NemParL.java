/* Generated By:JJTree: Do not edit this line. NemParL.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class NemParL extends SimpleNode {
  public NemParL(int id) {
    super(id);
  }

  public NemParL(CCalParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CCalParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9dd070df8100fc5e5b6e5bd05d9238f5 (do not edit this line) */