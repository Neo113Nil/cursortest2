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
/* loaded from: classes15.dex */
public final class y80 {

    @NotNull
    public static final x80 Companion = new x80();
    public static final Lazy[] g;
    public final r50 a;
    public final g90 b;
    public final List c;
    public final y50 d;
    public final List e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, u80.b), null, LazyKt.lazy(lazyThreadSafetyMode, v80.b), LazyKt.lazy(lazyThreadSafetyMode, w80.b)};
    }

    public y80(int i, r50 r50Var, g90 g90Var, List list, y50 y50Var, List list2, List list3) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, t80.b);
        }
        this.a = r50Var;
        this.b = g90Var;
        this.c = list;
        this.d = y50Var;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y80)) {
            return false;
        }
        y80 y80Var = (y80) obj;
        return Intrinsics.areEqual(this.a, y80Var.a) && Intrinsics.areEqual(this.b, y80Var.b) && Intrinsics.areEqual(this.c, y80Var.c) && Intrinsics.areEqual(this.d, y80Var.d) && Intrinsics.areEqual(this.e, y80Var.e) && Intrinsics.areEqual(this.f, y80Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelReportData(appData=" + this.a + ", sdkData=" + this.b + ", networksData=" + this.c + ", consentsData=" + this.d + ", sdkLogs=" + this.e + ", networkLogs=" + this.f + ")";
    }

    public y80(r50 r50Var, g90 g90Var, List list, y50 y50Var, List list2, List list3) {
        this.a = r50Var;
        this.b = g90Var;
        this.c = list;
        this.d = y50Var;
        this.e = list2;
        this.f = list3;
    }
}
