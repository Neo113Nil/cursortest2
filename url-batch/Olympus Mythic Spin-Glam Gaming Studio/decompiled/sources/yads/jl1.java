package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class jl1 implements qp3 {
    public final rp3 a;
    public final gb1 b;
    public final il1 c;

    public jl1() {
        rp3 rp3Var = new rp3();
        gb1 gb1Var = new gb1();
        il1 il1Var = new il1();
        this.a = rp3Var;
        this.b = gb1Var;
        this.c = il1Var;
    }

    @Override // yads.qp3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, dm dmVar) {
        ArrayList arrayList = new ArrayList();
        this.a.getClass();
        xmlPullParser.require(2, null, "MediaFiles");
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, "MediaFile")) {
                    arrayList.add(this.c.a(xmlPullParser));
                } else if (Intrinsics.areEqual(name, "InteractiveCreativeFile")) {
                    fb1 a = this.b.a(xmlPullParser);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    this.a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
