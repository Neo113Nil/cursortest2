package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a80 {
    public final List a;
    public final r50 b;
    public final h90 c;
    public final b40 d;
    public final i50 e;
    public final y50 f;
    public final z70 g;

    public a80(List list, r50 r50Var, h90 h90Var, b40 b40Var, i50 i50Var, y50 y50Var, z70 z70Var) {
        this.a = list;
        this.b = r50Var;
        this.c = h90Var;
        this.d = b40Var;
        this.e = i50Var;
        this.f = y50Var;
        this.g = z70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a80)) {
            return false;
        }
        a80 a80Var = (a80) obj;
        return Intrinsics.areEqual(this.a, a80Var.a) && Intrinsics.areEqual(this.b, a80Var.b) && Intrinsics.areEqual(this.c, a80Var.c) && Intrinsics.areEqual(this.d, a80Var.d) && Intrinsics.areEqual(this.e, a80Var.e) && Intrinsics.areEqual(this.f, a80Var.f) && Intrinsics.areEqual(this.g, a80Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.a.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.a + ", appData=" + this.b + ", sdkIntegrationData=" + this.c + ", adNetworkSettingsData=" + this.d + ", adaptersData=" + this.e + ", consentsData=" + this.f + ", debugErrorIndicatorData=" + this.g + ")";
    }
}
