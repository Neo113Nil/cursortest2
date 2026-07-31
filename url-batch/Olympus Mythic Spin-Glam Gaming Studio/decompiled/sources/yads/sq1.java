package yads;

import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public final class sq1 {
    public final ae3 a;

    public sq1(ae3 ae3Var) {
        this.a = ae3Var;
    }

    public final boolean a(String str, String str2) {
        if (str2 == null || StringsKt.isBlank(str2)) {
            return true;
        }
        this.a.getClass();
        zd3 a = ae3.a(str);
        if (a == null) {
            return true;
        }
        this.a.getClass();
        zd3 a2 = ae3.a(str2);
        return a2 == null || a.compareTo(a2) >= 0;
    }
}
