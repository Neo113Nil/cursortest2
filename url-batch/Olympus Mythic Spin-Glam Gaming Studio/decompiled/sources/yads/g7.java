package yads;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g7 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final LinkedHashMap d;
    public final Set e;

    public g7(int i, boolean z, boolean z2, LinkedHashMap linkedHashMap, Set set) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = linkedHashMap;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return this.a == g7Var.a && this.b == g7Var.b && this.c == g7Var.c && Intrinsics.areEqual(this.d, g7Var.d) && Intrinsics.areEqual(this.e, g7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((Boolean.hashCode(this.c) + ((Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationPolicy(usagePercent=" + this.a + ", enabled=" + this.b + ", blockAdOnInternalError=" + this.c + ", adNetworksCustomParameters=" + this.d + ", enabledAdUnits=" + this.e + ")";
    }
}
