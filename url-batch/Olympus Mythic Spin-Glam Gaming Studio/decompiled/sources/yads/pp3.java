package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class pp3 implements qp3 {
    public final qp3 a;
    public final String b;
    public final String c;

    public pp3(qp3 qp3Var, String str, String str2) {
        this.a = qp3Var;
        this.b = str;
        this.c = str2;
    }

    @Override // yads.qp3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, dm dmVar) {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, null, this.b);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual(this.c, xmlPullParser.getName())) {
                    Object a = this.a.a(xmlPullParser, dmVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    rp3.b(xmlPullParser);
                }
            }
        }
        return arrayList;
    }
}
