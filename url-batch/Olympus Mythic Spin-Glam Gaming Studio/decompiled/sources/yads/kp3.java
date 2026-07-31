package yads;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class kp3 {
    public static boolean a(XmlPullParser xmlPullParser, String str, boolean z) {
        Boolean booleanStrictOrNull;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return z;
        }
        String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return (lowerCase == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(lowerCase)) == null) ? z : booleanStrictOrNull.booleanValue();
    }
}
