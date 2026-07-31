package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes3.dex */
public final class ua0 {

    @NotNull
    public static final ta0 Companion = new ta0();
    public final String a;
    public final double b;

    public ua0(int i, String str, double d) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, sa0.b);
        }
        this.a = str;
        this.b = d;
    }

    public final double a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return Intrinsics.areEqual(this.a, ua0Var.a) && Double.compare(this.b, ua0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.a + ", minCpm=" + this.b + ")";
    }
}
