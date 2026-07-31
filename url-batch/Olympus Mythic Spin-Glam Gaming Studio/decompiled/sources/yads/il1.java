package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes12.dex */
public final class il1 implements qp3 {
    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, dm dmVar) {
        return a(xmlPullParser);
    }

    public final gl1 a(XmlPullParser xmlPullParser) {
        fl1 fl1Var;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        xmlPullParser.require(2, null, "MediaFile");
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        String attributeValue5 = xmlPullParser.getAttributeValue(null, VastAttributes.BITRATE);
        String attributeValue6 = xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "id");
        String attributeValue8 = xmlPullParser.getAttributeValue(null, VastAttributes.CODEC);
        String attributeValue9 = xmlPullParser.getAttributeValue(null, "vmaf");
        String a = rp3.a(xmlPullParser);
        fl1[] values = fl1.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fl1Var = null;
                break;
            }
            fl1Var = values[i];
            if (Intrinsics.areEqual(fl1Var.b, attributeValue)) {
                break;
            }
            i++;
        }
        return new gl1(a, attributeValue7, fl1Var, attributeValue2, attributeValue8, attributeValue9 != null ? StringsKt.toFloatOrNull(attributeValue9) : null, (attributeValue3 == null || (intOrNull3 = StringsKt.toIntOrNull(attributeValue3)) == null) ? 0 : intOrNull3.intValue(), (attributeValue4 == null || (intOrNull2 = StringsKt.toIntOrNull(attributeValue4)) == null) ? 0 : intOrNull2.intValue(), (attributeValue5 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue5)) == null) ? 0 : intOrNull.intValue(), attributeValue6);
    }
}
