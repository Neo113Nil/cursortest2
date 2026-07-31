package yads;

import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public abstract class eh2 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r4 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap a(ch2 ch2Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(O6.G1, ch2Var.a);
        kh2 kh2Var = ch2Var.b;
        if (kh2Var != null) {
            linkedHashMap.put("winner_name", kh2Var.a);
            linkedHashMap.put("winner_ad_unit", kh2Var.b);
        }
        String lowerCase = ch2Var.d.a.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        linkedHashMap.put("status", lowerCase);
        Integer num = ch2Var.d.c;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num.intValue()));
        }
        vh2 vh2Var = ch2Var.d;
        if (vh2Var.a == yh2.d) {
            String str = vh2Var.b;
            if (str != null) {
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
            }
            str = "Unknown error";
            linkedHashMap.put("error_message", str);
        }
        return linkedHashMap;
    }
}
