package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class ml3 implements qp3 {
    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, dm dmVar) {
        return a(xmlPullParser);
    }

    public final ll3 a(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual("Viewable", xmlPullParser.getName())) {
                    arrayList.add(rp3.a(xmlPullParser));
                } else {
                    rp3.b(xmlPullParser);
                }
            }
        }
        return new ll3(arrayList);
    }
}
