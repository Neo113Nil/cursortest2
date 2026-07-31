package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class ae3 {
    public static zd3 a(String str) {
        Integer intOrNull;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '-') {
                    str = str.substring(0, i);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        List split$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        String str2 = (String) CollectionsKt.getOrNull(split$default, 0);
        if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
            return null;
        }
        int intValue = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull((String) (1 <= CollectionsKt.getLastIndex(split$default) ? split$default.get(1) : "0"));
        if (intOrNull2 == null) {
            return null;
        }
        int intValue2 = intOrNull2.intValue();
        Integer intOrNull3 = StringsKt.toIntOrNull((String) (2 <= CollectionsKt.getLastIndex(split$default) ? split$default.get(2) : "0"));
        if (intOrNull3 != null) {
            return new zd3(intValue, intValue2, intOrNull3.intValue());
        }
        return null;
    }
}
