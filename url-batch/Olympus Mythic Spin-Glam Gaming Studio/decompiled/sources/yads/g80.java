package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class g80 {
    public final r50 a;
    public final g90 b;
    public final ArrayList c;
    public final y50 d;
    public final z70 e;
    public final h80 f;

    public g80(r50 r50Var, g90 g90Var, ArrayList arrayList, y50 y50Var, z70 z70Var, h80 h80Var) {
        this.a = r50Var;
        this.b = g90Var;
        this.c = arrayList;
        this.d = y50Var;
        this.e = z70Var;
        this.f = h80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return Intrinsics.areEqual(this.a, g80Var.a) && Intrinsics.areEqual(this.b, g80Var.b) && Intrinsics.areEqual(this.c, g80Var.c) && Intrinsics.areEqual(this.d, g80Var.d) && Intrinsics.areEqual(this.e, g80Var.e) && Intrinsics.areEqual(this.f, g80Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        h80 h80Var = this.f;
        return hashCode + (h80Var == null ? 0 : h80Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.a + ", sdkData=" + this.b + ", mediationNetworksData=" + this.c + ", consentsData=" + this.d + ", debugErrorIndicatorData=" + this.e + ", logsData=" + this.f + ")";
    }
}
