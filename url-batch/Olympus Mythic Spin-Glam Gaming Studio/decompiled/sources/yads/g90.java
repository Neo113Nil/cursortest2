package yads;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes3.dex */
public final class g90 {

    @NotNull
    public static final f90 Companion = new f90();
    public static final Lazy[] d = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, e90.b)};
    public final String a;
    public final boolean b;
    public final List c;

    public g90(int i, String str, boolean z, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, d90.b);
        }
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g90)) {
            return false;
        }
        g90 g90Var = (g90) obj;
        return Intrinsics.areEqual(this.a, g90Var.a) && this.b == g90Var.b && Intrinsics.areEqual(this.c, g90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Boolean.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelSdkData(version=" + this.a + ", isIntegratedSuccess=" + this.b + ", integrationMessages=" + this.c + ")";
    }

    public g90(boolean z, List list) {
        this.a = "8.1.0";
        this.b = z;
        this.c = list;
    }
}
