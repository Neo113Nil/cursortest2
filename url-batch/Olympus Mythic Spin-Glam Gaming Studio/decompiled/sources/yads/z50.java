package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z50 {
    public final r50 a;
    public final g90 b;
    public final b40 c;
    public final i50 d;
    public final y50 e;
    public final z70 f;
    public final List g;
    public final List h;

    public z50(r50 r50Var, g90 g90Var, b40 b40Var, i50 i50Var, y50 y50Var, z70 z70Var, List list, List list2) {
        this.a = r50Var;
        this.b = g90Var;
        this.c = b40Var;
        this.d = i50Var;
        this.e = y50Var;
        this.f = z70Var;
        this.g = list;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z50)) {
            return false;
        }
        z50 z50Var = (z50) obj;
        return Intrinsics.areEqual(this.a, z50Var.a) && Intrinsics.areEqual(this.b, z50Var.b) && Intrinsics.areEqual(this.c, z50Var.c) && Intrinsics.areEqual(this.d, z50Var.d) && Intrinsics.areEqual(this.e, z50Var.e) && Intrinsics.areEqual(this.f, z50Var.f) && Intrinsics.areEqual(this.g, z50Var.g) && Intrinsics.areEqual(this.h, z50Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelData(appData=" + this.a + ", sdkData=" + this.b + ", networkSettingsData=" + this.c + ", adaptersData=" + this.d + ", consentsData=" + this.e + ", debugErrorIndicatorData=" + this.f + ", adUnits=" + this.g + ", alerts=" + this.h + ")";
    }
}
