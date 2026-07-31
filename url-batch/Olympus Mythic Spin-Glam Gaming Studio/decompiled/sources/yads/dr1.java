package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dr1 {
    public static final String d = com.safedk.android.utils.h.y + ".mediation";
    public final String a;
    public final wr1 b;
    public final List c;

    public dr1(String str, wr1 wr1Var, List list) {
        this.a = str;
        this.b = wr1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr1)) {
            return false;
        }
        dr1 dr1Var = (dr1) obj;
        return Intrinsics.areEqual(this.a, dr1Var.a) && this.b == dr1Var.b && Intrinsics.areEqual(this.c, dr1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediationNetwork(name=" + this.a + ", id=" + this.b + ", adapters=" + this.c + ")";
    }
}
