package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes12.dex */
public final class vu1 {

    @NotNull
    public static final uu1 Companion = new uu1();
    public final bv1 a;
    public final fv1 b;

    public vu1(int i, bv1 bv1Var, fv1 fv1Var) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, tu1.b);
        }
        this.a = bv1Var;
        this.b = fv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu1)) {
            return false;
        }
        vu1 vu1Var = (vu1) obj;
        return Intrinsics.areEqual(this.a, vu1Var.a) && Intrinsics.areEqual(this.b, vu1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fv1 fv1Var = this.b;
        return hashCode + (fv1Var == null ? 0 : fv1Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.a + ", response=" + this.b + ")";
    }

    public vu1(bv1 bv1Var, fv1 fv1Var) {
        this.a = bv1Var;
        this.b = fv1Var;
    }
}
