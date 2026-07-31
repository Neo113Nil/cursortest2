package yads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes9.dex */
public final class p11 implements qp3 {
    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, dm dmVar) {
        int i;
        k11 k11Var;
        n11 n11Var = null;
        xmlPullParser.require(2, null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C);
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "offset");
        String attributeValue7 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        while (true) {
            i = 0;
            if (xmlPullParser.next() == 3) {
                break;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                m11.c.getClass();
                m11[] values = m11.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        rp3.b(xmlPullParser);
                        break;
                    }
                    if (Intrinsics.areEqual(values[i2].b, name)) {
                        rp3.a(xmlPullParser);
                        m11[] values2 = m11.values();
                        int length2 = values2.length;
                        while (i < length2 && !Intrinsics.areEqual(values2[i].b, name)) {
                            i++;
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        ih3.b(attributeValue2);
        ih3.b(attributeValue3);
        k11[] values3 = k11.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                k11Var = null;
                break;
            }
            k11Var = values3[i3];
            if (Intrinsics.areEqual(k11Var.b, attributeValue4)) {
                break;
            }
            i3++;
        }
        if (k11Var == null) {
            k11Var = k11.c;
        }
        if (k11Var == k11.c) {
            ih3.b(attributeValue4);
        }
        n11[] values4 = n11.values();
        int length4 = values4.length;
        while (true) {
            if (i >= length4) {
                break;
            }
            n11 n11Var2 = values4[i];
            if (Intrinsics.areEqual(n11Var2.b, attributeValue5)) {
                n11Var = n11Var2;
                break;
            }
            i++;
        }
        if (n11Var == null) {
            n11Var = n11.c;
        }
        if (n11Var == n11.c) {
            ih3.b(attributeValue5);
        }
        ih3.a(attributeValue6);
        ih3.a(attributeValue7);
        return new o11(attributeValue);
    }
}
