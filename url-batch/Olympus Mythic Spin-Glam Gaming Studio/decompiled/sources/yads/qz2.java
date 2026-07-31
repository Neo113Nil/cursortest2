package yads;

import io.bidmachine.iab.vast.tags.VastTagName;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes12.dex */
public final class qz2 implements qp3 {
    public qz2(rp3 rp3Var) {
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, dm dmVar) {
        return a(xmlPullParser);
    }

    public final op0 a(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, VastTagName.EXTENSION);
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        String a = rp3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || a.length() <= 0) {
            return null;
        }
        return new op0(attributeValue, a);
    }
}
