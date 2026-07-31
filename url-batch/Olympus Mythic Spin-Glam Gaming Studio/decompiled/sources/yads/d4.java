package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class d4 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public d4(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return this.a == d4Var.a && Intrinsics.areEqual(this.b, d4Var.b) && Intrinsics.areEqual(this.c, d4Var.c) && Intrinsics.areEqual(this.d, d4Var.d);
    }

    public final int hashCode() {
        int a = c4.a(c4.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), this.b, this.d, this.c}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
