package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes15.dex */
public final class oh3 implements qp3 {
    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, dm dmVar) {
        return a(xmlPullParser);
    }

    public final nh3 a(XmlPullParser xmlPullParser) {
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (Intrinsics.areEqual("ClickThrough", name)) {
                    String a = rp3.a(xmlPullParser);
                    if (a.length() > 0) {
                        str = a;
                    }
                } else if (Intrinsics.areEqual("ClickTracking", name)) {
                    String a2 = rp3.a(xmlPullParser);
                    if (a2.length() > 0) {
                        arrayList.add(a2);
                    }
                } else {
                    rp3.b(xmlPullParser);
                }
            }
        }
        return new nh3(str, arrayList);
    }
}
