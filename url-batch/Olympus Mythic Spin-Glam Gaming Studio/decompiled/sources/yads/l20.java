package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes15.dex */
public final class l20 implements qp3 {
    public final rp3 a;
    public final hf1 b;
    public final h20 c;

    public l20(Context context, mt1 mt1Var) {
        rp3 rp3Var = new rp3();
        hf1 hf1Var = new hf1();
        h20 h20Var = new h20(context, mt1Var);
        this.a = rp3Var;
        this.b = hf1Var;
        this.c = h20Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r2v10, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r2v11, types: [yads.ff1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v21, types: [yads.f20] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String, yads.id3] */
    /* JADX WARN: Type inference failed for: r5v16, types: [yads.pp3] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v15, types: [yads.oh3] */
    /* JADX WARN: Type inference failed for: r7v29, types: [yads.jl1] */
    /* JADX WARN: Type inference failed for: r7v32, types: [yads.pp3] */
    /* JADX WARN: Type inference failed for: r7v35, types: [yads.pp3] */
    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, dm dmVar) {
        int i;
        Object obj;
        w03 w03Var;
        String str;
        int i2;
        w03 w03Var2;
        String str2;
        int i3;
        ij3 ij3Var;
        ?? r2 = xmlPullParser;
        this.a.getClass();
        int i4 = 2;
        ?? r5 = 0;
        r2.require(2, null, "Creative");
        this.a.getClass();
        String attributeValue = r2.getAttributeValue(null, "id");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        g20 g20Var = null;
        String str3 = null;
        w03 w03Var3 = null;
        String str4 = null;
        boolean z = false;
        int i5 = 0;
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                Object obj2 = r5;
                w03 w03Var4 = w03Var3;
                String str5 = attributeValue;
                int i6 = i5;
                if (!z) {
                    return obj2;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof gl1) {
                        arrayList4.add(next);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof fb1) {
                        arrayList5.add(next2);
                    }
                }
                return new d20(arrayList4, arrayList5, arrayList2, arrayList3, g20Var, str3, w03Var4, str5, i6, str4);
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == i4) {
                String name = xmlPullParser.getName();
                if (Intrinsics.areEqual("Linear", name)) {
                    hf1 hf1Var = this.b;
                    hf1Var.a.getClass();
                    r2.require(i4, r5, "Linear");
                    hf1Var.d.getClass();
                    String attributeValue2 = r2.getAttributeValue(r5, VastAttributes.SKIP_OFFSET);
                    if (attributeValue2 == null) {
                        attributeValue2 = "";
                    }
                    w03Var3 = attributeValue2.length() > 0 ? new w03(attributeValue2) : r5;
                    while (true) {
                        hf1Var.a.getClass();
                        if (xmlPullParser.next() != 3) {
                            hf1Var.a.getClass();
                            if (xmlPullParser.getEventType() == i4) {
                                String name2 = xmlPullParser.getName();
                                if (name2 != null) {
                                    switch (name2.hashCode()) {
                                        case -2049897434:
                                            if (!name2.equals("VideoClicks")) {
                                                break;
                                            } else {
                                                nh3 a = hf1Var.b.a(r2);
                                                str3 = a.b;
                                                Iterator it3 = a.a.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList3.add(new n83("clickTracking", (String) it3.next(), r5));
                                                    it3 = it3;
                                                    i4 = 2;
                                                }
                                                break;
                                            }
                                        case -1927368268:
                                            if (!name2.equals("Duration")) {
                                                break;
                                            } else {
                                                rp3 rp3Var = hf1Var.c.a;
                                                r2.require(i4, r5, "Duration");
                                                Long a2 = ih3.a(rp3.a(xmlPullParser));
                                                if (a2 == null) {
                                                    i5 = 0;
                                                    break;
                                                } else {
                                                    i5 = (int) a2.longValue();
                                                    break;
                                                }
                                            }
                                        case -1348833651:
                                            if (!name2.equals("AdParameters")) {
                                                break;
                                            } else {
                                                hf1Var.a.getClass();
                                                str4 = rp3.a(xmlPullParser);
                                                break;
                                            }
                                        case -385055469:
                                            if (name2.equals("MediaFiles")) {
                                                arrayList.addAll(hf1Var.e.a(r2, dmVar));
                                                break;
                                            }
                                            break;
                                        case 70476538:
                                            if (name2.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B)) {
                                                arrayList2.addAll(hf1Var.f.a(r2, dmVar));
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals("TrackingEvents")) {
                                                Iterator it4 = hf1Var.g.a(r2, dmVar).iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add((n83) it4.next());
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                                hf1Var.a.getClass();
                                rp3.b(xmlPullParser);
                            }
                            i4 = 2;
                        } else {
                            z = true;
                            i4 = 2;
                        }
                    }
                } else if (Intrinsics.areEqual("CreativeExtensions", name)) {
                    h20 h20Var = this.c;
                    h20Var.a.getClass();
                    r2.require(2, r5, "CreativeExtensions");
                    List emptyList = CollectionsKt.emptyList();
                    hq0 hq0Var = r5;
                    Object obj3 = hq0Var;
                    Object obj4 = obj3;
                    while (true) {
                        h20Var.a.getClass();
                        if (xmlPullParser.next() != 3) {
                            h20Var.a.getClass();
                            if (xmlPullParser.getEventType() != 2) {
                                w03Var2 = w03Var3;
                                str2 = attributeValue;
                                i3 = i5;
                            } else if (Intrinsics.areEqual("CreativeExtension", xmlPullParser.getName())) {
                                String attributeValue3 = r2.getAttributeValue(null, "type");
                                if (Intrinsics.areEqual("false_click", attributeValue3)) {
                                    hq0Var = (hq0) h20Var.d.a(r2, dmVar);
                                    r2 = r2;
                                    obj3 = obj3;
                                } else if (Intrinsics.areEqual(h20.f, attributeValue3)) {
                                    Object a3 = h20Var.e.a(r2, dmVar);
                                    r2 = r2;
                                    obj3 = a3;
                                } else if (Intrinsics.areEqual(h20.g, attributeValue3)) {
                                    gf1 gf1Var = h20Var.b;
                                    gf1Var.getClass();
                                    try {
                                        gf1Var.c.getClass();
                                        JSONObject jSONObject = new JSONObject(rp3.a(xmlPullParser));
                                        Iterator<String> keys = jSONObject.keys();
                                        String str6 = attributeValue;
                                        int i7 = i5;
                                        List emptyList2 = CollectionsKt.emptyList();
                                        j9 j9Var = null;
                                        while (keys.hasNext()) {
                                            Iterator<String> it5 = keys;
                                            String next3 = keys.next();
                                            w03 w03Var5 = w03Var3;
                                            if (Intrinsics.areEqual("assets", next3)) {
                                                emptyList2 = gf1Var.a.a(jSONObject, dmVar);
                                            } else if (Intrinsics.areEqual("link", next3)) {
                                                gf1Var.d.a(jSONObject.getJSONObject(next3), dmVar);
                                            } else if (Intrinsics.areEqual("settings", next3)) {
                                                JSONObject jSONObject2 = jSONObject.getJSONObject(next3);
                                                gf1Var.b.getClass();
                                                JSONObject optJSONObject = jSONObject2.optJSONObject("videoSelection");
                                                if (optJSONObject != null) {
                                                    String optString = optJSONObject.optString("preferableMimeType");
                                                    if (optString.length() <= 0) {
                                                        optString = null;
                                                    }
                                                    ij3Var = new ij3(optString, optJSONObject.optBoolean("inOrderOfList"));
                                                } else {
                                                    ij3Var = null;
                                                }
                                                j9Var = new j9(ij3Var);
                                            }
                                            keys = it5;
                                            w03Var3 = w03Var5;
                                        }
                                        w03 w03Var6 = w03Var3;
                                        obj4 = new ff1(emptyList2, j9Var);
                                        i5 = i7;
                                        attributeValue = str6;
                                        w03Var3 = w03Var6;
                                        r2 = xmlPullParser;
                                    } catch (Exception e) {
                                        throw new JSONException(e.getMessage());
                                    }
                                } else {
                                    w03Var2 = w03Var3;
                                    str2 = attributeValue;
                                    i3 = i5;
                                    if (Intrinsics.areEqual(h20.h, attributeValue3)) {
                                        sc3 sc3Var = h20Var.c;
                                        sc3Var.getClass();
                                        try {
                                            sc3Var.b.getClass();
                                            emptyList = sc3Var.a(rp3.a(xmlPullParser), dmVar.b);
                                        } catch (Exception e2) {
                                            sc3Var.a.reportError("Failed to parse DivKit designs from VAST CreativeExtension", e2);
                                            emptyList = CollectionsKt.emptyList();
                                        }
                                    } else {
                                        h20Var.a.getClass();
                                        rp3.b(xmlPullParser);
                                    }
                                }
                            } else {
                                w03Var2 = w03Var3;
                                str2 = attributeValue;
                                i3 = i5;
                                h20Var.a.getClass();
                                rp3.b(xmlPullParser);
                            }
                            r2 = xmlPullParser;
                            i5 = i3;
                            attributeValue = str2;
                            w03Var3 = w03Var2;
                            obj3 = obj3;
                        } else {
                            g20Var = new g20(hq0Var, obj3, obj4, emptyList);
                            r2 = xmlPullParser;
                            i4 = 2;
                            r5 = 0;
                        }
                    }
                } else {
                    obj = r5;
                    w03Var = w03Var3;
                    str = attributeValue;
                    i2 = i5;
                    i = 2;
                    this.a.getClass();
                    rp3.b(xmlPullParser);
                }
            } else {
                i = i4;
                obj = r5;
                w03Var = w03Var3;
                str = attributeValue;
                i2 = i5;
            }
            r5 = obj;
            i5 = i2;
            attributeValue = str;
            w03Var3 = w03Var;
            i4 = i;
            r2 = xmlPullParser;
        }
    }
}
