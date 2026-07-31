package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes8.dex */
public final class ab0 {

    @NotNull
    public static final za0 Companion = new za0();
    public final String a;
    public final String b;

    public ab0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ya0.b);
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0Var = (ab0) obj;
        return Intrinsics.areEqual(this.a, ab0Var.a) && Intrinsics.areEqual(this.b, ab0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallParameter(name=" + this.a + ", value=" + this.b + ")";
    }
}
