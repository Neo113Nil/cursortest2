package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wo {
    public final e00 a;
    public final l03 b;
    public final Map c;
    public final f00 d;

    public wo(e00 e00Var, l03 l03Var, Map map, f00 f00Var) {
        this.a = e00Var;
        this.b = l03Var;
        this.c = map;
        this.d = f00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        return this.a == woVar.a && Intrinsics.areEqual(this.b, woVar.b) && Intrinsics.areEqual(this.c, woVar.c) && Intrinsics.areEqual(this.d, woVar.d);
    }

    public final int hashCode() {
        e00 e00Var = this.a;
        int hashCode = (e00Var == null ? 0 : e00Var.hashCode()) * 31;
        l03 l03Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (l03Var == null ? 0 : l03Var.hashCode())) * 31)) * 31;
        f00 f00Var = this.d;
        return hashCode2 + (f00Var != null ? f00Var.hashCode() : 0);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.a + ", sizeInfo=" + this.b + ", parameters=" + this.c + ", adapterIdentity=" + this.d + ")";
    }
}
