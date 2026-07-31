package yads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class gb1 implements qp3 {
    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, dm dmVar) {
        return a(xmlPullParser);
    }

    public final fb1 a(XmlPullParser xmlPullParser) {
        String attributeValue;
        Integer intOrNull;
        Integer intOrNull2;
        xmlPullParser.require(2, null, "InteractiveCreativeFile");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        if (attributeValue2 != null && (attributeValue = xmlPullParser.getAttributeValue(null, "height")) != null && (intOrNull = StringsKt.toIntOrNull(attributeValue)) != null) {
            int intValue = intOrNull.intValue();
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
            if (attributeValue3 != null && (intOrNull2 = StringsKt.toIntOrNull(attributeValue3)) != null) {
                int intValue2 = intOrNull2.intValue();
                String a = rp3.a(xmlPullParser);
                if (StringsKt.contains$default((CharSequence) attributeValue2, (CharSequence) "html", false, 2, (Object) null) != (a.length() > 0)) {
                    a = null;
                }
                String str = a != null ? new String(Base64.decode(a, 0), StandardCharsets.UTF_8) : null;
                if (str == null) {
                    return null;
                }
                return new fb1(intValue, intValue2, str, attributeValue2);
            }
        }
        return null;
    }
}
