package yads;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d7 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final long d;
    public final int e;
    public final boolean f;
    public final Set g;
    public final Map h;

    public d7(boolean z, boolean z2, String str, long j, int i, boolean z3, Set set, Map map) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = z3;
        this.g = set;
        this.h = map;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return this.a == d7Var.a && this.b == d7Var.b && Intrinsics.areEqual(this.c, d7Var.c) && this.d == d7Var.d && this.e == d7Var.e && this.f == d7Var.f && Intrinsics.areEqual(this.g, d7Var.g) && Intrinsics.areEqual(this.h, d7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((Boolean.hashCode(this.f) + yd3.a(this.e, (Long.hashCode(this.d) + c4.a((Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.a + ", debug=" + this.b + ", apiKey=" + this.c + ", validationTimeoutInSec=" + this.d + ", usagePercent=" + this.e + ", blockAdOnInternalError=" + this.f + ", enabledAdUnits=" + this.g + ", adNetworksCustomParameters=" + this.h + ")";
    }
}
