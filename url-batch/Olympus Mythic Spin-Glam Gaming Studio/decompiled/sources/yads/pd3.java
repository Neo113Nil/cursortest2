package yads;

import android.content.Context;
import android.util.Xml;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.StringReader;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class pd3 {
    public final rp3 a;
    public final mc3 b;

    public pd3(Context context, mt1 mt1Var) {
        rp3 rp3Var = new rp3();
        mc3 mc3Var = new mc3(context, mt1Var);
        this.a = rp3Var;
        this.b = mc3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [yads.fe3] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public final ic3 a(String str, dm dmVar) {
        boolean z;
        ?? r11;
        int i;
        boolean z2;
        XmlPullParser newPullParser = Xml.newPullParser();
        boolean z3 = false;
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        this.a.getClass();
        String str2 = null;
        newPullParser.require(2, null, VastTagName.VAST);
        mc3 mc3Var = this.b;
        mc3Var.a.getClass();
        String attributeValue = newPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            mc3Var.a.getClass();
            int i2 = 3;
            if (newPullParser.next() == 3) {
                break;
            }
            mc3Var.a.getClass();
            if (newPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual("Ad", newPullParser.getName())) {
                    lf3 lf3Var = mc3Var.b;
                    rp3 rp3Var = lf3Var.e.a;
                    newPullParser.require(2, str2, "Ad");
                    String attributeValue2 = newPullParser.getAttributeValue(str2, "id");
                    if (attributeValue2 == null || attributeValue2.length() == 0) {
                        attributeValue2 = str2;
                    }
                    rp3 rp3Var2 = lf3Var.d.a;
                    newPullParser.require(2, str2, "Ad");
                    Integer b = ih3.b(newPullParser.getAttributeValue(str2, "sequence"));
                    ?? r13 = b;
                    if (b != null) {
                        int intValue = b.intValue();
                        r13 = b;
                        if (intValue < 0) {
                            r13 = str2;
                        }
                    }
                    lf3Var.a.getClass();
                    newPullParser.require(2, str2, "Ad");
                    while (true) {
                        r11 = str2;
                        while (true) {
                            lf3Var.a.getClass();
                            if (newPullParser.next() == i2) {
                                break;
                            }
                            lf3Var.a.getClass();
                            if (newPullParser.getEventType() == 2) {
                                String name = newPullParser.getName();
                                if (Intrinsics.areEqual("InLine", name)) {
                                    ee3 ee3Var = new ee3(lf3Var.f, z3);
                                    ee3Var.k = attributeValue2;
                                    ee3Var.j = r13;
                                    b51 b51Var = lf3Var.b;
                                    rp3 rp3Var3 = b51Var.b;
                                    newPullParser.require(2, str2, "InLine");
                                    while (newPullParser.next() != i2) {
                                        if (newPullParser.getEventType() == 2) {
                                            b51Var.a.a(newPullParser, ee3Var, dmVar);
                                        }
                                    }
                                    r11 = ee3Var.a();
                                    if (r11.b.isEmpty()) {
                                        break;
                                    }
                                    z3 = false;
                                } else if (Intrinsics.areEqual("Wrapper", name)) {
                                    ee3 ee3Var2 = new ee3(lf3Var.f, true);
                                    ee3Var2.k = attributeValue2;
                                    ee3Var2.j = r13;
                                    mp3 mp3Var = lf3Var.c;
                                    mp3Var.a.getClass();
                                    newPullParser.require(2, str2, "Wrapper");
                                    mp3Var.c.getClass();
                                    z2 = false;
                                    ee3Var2.c = new jp3(kp3.a(newPullParser, VastAttributes.ALLOW_MULTIPLE_ADS, false), kp3.a(newPullParser, VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, true));
                                    while (true) {
                                        mp3Var.a.getClass();
                                        i = 3;
                                        if (newPullParser.next() == 3) {
                                            break;
                                        }
                                        mp3Var.a.getClass();
                                        if (newPullParser.getEventType() == 2) {
                                            if (Intrinsics.areEqual("VASTAdTagURI", newPullParser.getName())) {
                                                mp3Var.a.getClass();
                                                ee3Var2.h = rp3.a(newPullParser);
                                            } else {
                                                mp3Var.b.a(newPullParser, ee3Var2, dmVar);
                                            }
                                        }
                                    }
                                    r11 = ee3Var2.a();
                                } else {
                                    i = i2;
                                    z2 = false;
                                    lf3Var.a.getClass();
                                    rp3.b(newPullParser);
                                    r11 = r11;
                                }
                            } else {
                                i = i2;
                                z2 = z3;
                                r11 = r11;
                            }
                            z3 = z2;
                            i2 = i;
                            str2 = null;
                        }
                        z3 = false;
                    }
                    z = z3;
                    if (r11 != 0) {
                        arrayList.add(r11);
                    }
                } else {
                    z = z3;
                    mc3Var.a.getClass();
                    rp3.b(newPullParser);
                }
                z3 = z;
                str2 = null;
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new ic3(attributeValue, arrayList);
    }
}
