package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ca0 {
    public final ca0 a;
    public final x70 b;
    public final boolean c;
    public final List d;

    public ca0(ca0 ca0Var, x70 x70Var, boolean z, List list) {
        this.a = ca0Var;
        this.b = x70Var;
        this.c = z;
        this.d = list;
    }

    public static ca0 a(ca0 ca0Var, ca0 ca0Var2, x70 x70Var, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            ca0Var2 = ca0Var.a;
        }
        if ((i & 2) != 0) {
            x70Var = ca0Var.b;
        }
        if ((i & 4) != 0) {
            z = ca0Var.c;
        }
        if ((i & 8) != 0) {
            list = ca0Var.d;
        }
        ca0Var.getClass();
        return new ca0(ca0Var2, x70Var, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca0)) {
            return false;
        }
        ca0 ca0Var = (ca0) obj;
        return Intrinsics.areEqual(this.a, ca0Var.a) && Intrinsics.areEqual(this.b, ca0Var.b) && this.c == ca0Var.c && Intrinsics.areEqual(this.d, ca0Var.d);
    }

    public final int hashCode() {
        ca0 ca0Var = this.a;
        return this.d.hashCode() + ((Boolean.hashCode(this.c) + ((this.b.hashCode() + ((ca0Var == null ? 0 : ca0Var.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.a + ", destination=" + this.b + ", isLoading=" + this.c + ", uiData=" + this.d + ")";
    }
}
