package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes4.dex */
public final class tv0 {

    @NotNull
    public static final sv0 Companion = new sv0();
    public final bw0 a;

    public tv0(int i, bw0 bw0Var) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, rv0.b);
        }
        this.a = bw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv0) && Intrinsics.areEqual(this.a, ((tv0) obj).a);
    }

    public final int hashCode() {
        bw0 bw0Var = this.a;
        if (bw0Var == null) {
            return 0;
        }
        return bw0Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.a + ")";
    }
}
