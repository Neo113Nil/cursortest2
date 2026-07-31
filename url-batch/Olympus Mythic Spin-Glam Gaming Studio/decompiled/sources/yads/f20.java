package yads;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class f20 implements qp3 {
    public final nq0 a;

    public f20(nq0 nq0Var) {
        this.a = nq0Var;
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, dm dmVar) {
        Object obj = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                obj = this.a.a(xmlPullParser, dmVar);
            }
        }
        return obj;
    }
}
