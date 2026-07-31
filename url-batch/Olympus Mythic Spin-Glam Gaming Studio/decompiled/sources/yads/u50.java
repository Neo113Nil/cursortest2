package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes14.dex */
public final class u50 {

    @NotNull
    public static final t50 Companion = new t50();
    public final String a;
    public final String b;

    public u50(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, s50.b);
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return Intrinsics.areEqual(this.a, u50Var.a) && Intrinsics.areEqual(this.b, u50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelBiddingParameter(name=" + this.a + ", value=" + this.b + ")";
    }
}
