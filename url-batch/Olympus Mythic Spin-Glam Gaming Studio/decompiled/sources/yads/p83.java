package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class p83 {
    public final rp3 a;
    public final o83 b;

    public p83() {
        rp3 rp3Var = new rp3();
        o83 o83Var = new o83();
        this.a = rp3Var;
        this.b = o83Var;
    }

    public final HashMap a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap hashMap = new HashMap();
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                return hashMap;
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual("Tracking", xmlPullParser.getName())) {
                    n83 a = this.b.a(xmlPullParser);
                    if (a != null) {
                        String str = a.a;
                        String str2 = a.b;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        List list = (List) hashMap.get(str);
                        if (list != null) {
                            list.add(str2);
                        }
                    }
                } else {
                    this.a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
