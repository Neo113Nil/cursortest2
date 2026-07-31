package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class rd3 implements sj3 {
    public final String a;
    public final uc1 b;
    public final String c;
    public final HashMap d;

    public rd3(String str, uc1 uc1Var, String str2, HashMap hashMap) {
        this.a = str;
        this.b = uc1Var;
        this.c = str2;
        this.d = hashMap;
    }

    @Override // yads.sj3
    public final Map a() {
        return Collections.unmodifiableMap(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd3)) {
            return false;
        }
        rd3 rd3Var = (rd3) obj;
        return Intrinsics.areEqual(this.a, rd3Var.a) && Intrinsics.areEqual(this.b, rd3Var.b) && Intrinsics.areEqual(this.c, rd3Var.c) && Intrinsics.areEqual(this.d, rd3Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uc1 uc1Var = this.b;
        int hashCode2 = (hashCode + (uc1Var == null ? 0 : uc1Var.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.a + ", javaScriptResource=" + this.b + ", parameters=" + this.c + ", events=" + this.d + ")";
    }
}
