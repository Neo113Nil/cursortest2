package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes15.dex */
public final class xa0 {

    @NotNull
    public static final wa0 Companion = new wa0();
    public final String a;
    public final String b;

    public xa0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, va0.b);
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0Var = (xa0) obj;
        return Intrinsics.areEqual(this.a, xa0Var.a) && Intrinsics.areEqual(this.b, xa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCurrency(name=" + this.a + ", symbol=" + this.b + ")";
    }
}
