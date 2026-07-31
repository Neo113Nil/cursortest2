package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class je3 {
    public final rp3 a;
    public final pp3 b;
    public final pp3 c;
    public final ml3 d;
    public final oe3 e;

    public je3(Context context, mt1 mt1Var) {
        rp3 rp3Var = new rp3();
        pp3 pp3Var = new pp3(new l20(context, mt1Var), "Creatives", "Creative");
        pp3 pp3Var2 = new pp3(new vd3(), "AdVerifications", VastTagName.VERIFICATION);
        ml3 ml3Var = new ml3();
        oe3 oe3Var = new oe3();
        this.a = rp3Var;
        this.b = pp3Var;
        this.c = pp3Var2;
        this.d = ml3Var;
        this.e = oe3Var;
    }

    public final void a(XmlPullParser xmlPullParser, ee3 ee3Var, dm dmVar) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual("Impression", name)) {
            this.a.getClass();
            String a = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap = ee3Var.n;
            Object obj = linkedHashMap.get("impression");
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put("impression", obj);
            }
            ((List) obj).add(a);
            return;
        }
        if (Intrinsics.areEqual("ViewableImpression", name)) {
            ee3Var.i = this.d.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual("Error", name)) {
            this.a.getClass();
            String a2 = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap2 = ee3Var.n;
            Object obj2 = linkedHashMap2.get("error");
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put("error", obj2);
            }
            ((List) obj2).add(a2);
            return;
        }
        if (Intrinsics.areEqual(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.m, name)) {
            this.a.getClass();
            ee3Var.g = rp3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j, name)) {
            this.a.getClass();
            ee3Var.f = rp3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i, name)) {
            this.a.getClass();
            ee3Var.e = rp3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual("AdSystem", name)) {
            this.a.getClass();
            ee3Var.d = rp3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual("Creatives", name)) {
            ee3Var.l.addAll(this.b.a(xmlPullParser, dmVar));
            return;
        }
        if (Intrinsics.areEqual("AdVerifications", name)) {
            ee3Var.m.addAll(this.c.a(xmlPullParser, dmVar));
            return;
        }
        if (!Intrinsics.areEqual(VastTagName.EXTENSIONS, name)) {
            this.a.getClass();
            rp3.b(xmlPullParser);
            return;
        }
        oe3 oe3Var = this.e;
        oe3Var.a.getClass();
        xmlPullParser.require(2, null, VastTagName.EXTENSIONS);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            oe3Var.a.getClass();
            if (xmlPullParser.next() == 3) {
                ee3Var.o = new ne3(CollectionsKt.toList(arrayList2), CollectionsKt.toList(arrayList));
                return;
            }
            oe3Var.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual(VastTagName.EXTENSION, xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (oe3.e.contains(attributeValue)) {
                        op0 a3 = oe3Var.b.a(xmlPullParser);
                        if (a3 != null) {
                            arrayList2.add(a3);
                        }
                    } else if (Intrinsics.areEqual(oe3.d, attributeValue)) {
                        arrayList.addAll(oe3Var.c.a(xmlPullParser, dmVar));
                    } else {
                        oe3Var.a.getClass();
                        rp3.b(xmlPullParser);
                    }
                } else {
                    oe3Var.a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
