/* Generated By:JJTree: Do not edit this line. LessThan.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class LessThan extends SimpleNode {
  public LessThan(int id) {
    super(id);
  }

  public LessThan(CCalParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CCalParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=58d65e575e7594f41272a6c670c8fd6c (do not edit this line) */
