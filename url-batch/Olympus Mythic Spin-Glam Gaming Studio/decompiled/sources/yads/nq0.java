package yads;

import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class nq0 implements qp3 {
    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, dm dmVar) {
        xmlPullParser.require(2, null, "FalseClick");
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        Long longOrNull = attributeValue != null ? StringsKt.toLongOrNull(attributeValue) : null;
        String a = rp3.a(xmlPullParser);
        if (a.length() <= 0 || longOrNull == null) {
            return null;
        }
        return new hq0(a, longOrNull.longValue());
    }
}
