package yads;

import java.util.Arrays;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public final class o83 implements qp3 {
    public final rp3 a;
    public final v63 b;

    public o83() {
        rp3 rp3Var = new rp3();
        t63[] values = t63.values();
        v63 v63Var = new v63(new HashSet(CollectionsKt.listOf(Arrays.copyOf(values, values.length))));
        this.a = rp3Var;
        this.b = v63Var;
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, dm dmVar) {
        return a(xmlPullParser);
    }

    public final n83 a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        this.a.getClass();
        String a = rp3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || a.length() <= 0) {
            return null;
        }
        return new n83(attributeValue, a, attributeValue2 != null ? this.b.a(attributeValue2) : null);
    }
}
