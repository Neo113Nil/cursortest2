package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class h80 {
    public final List a;
    public final List b;

    public h80(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return Intrinsics.areEqual(this.a, h80Var.a) && Intrinsics.areEqual(this.b, h80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.a + ", networkLogs=" + this.b + ")";
    }
}
