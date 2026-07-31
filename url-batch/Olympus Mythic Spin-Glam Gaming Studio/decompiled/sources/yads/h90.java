package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class h90 {
    public final String a;
    public final j90 b;

    public h90(String str, j90 j90Var) {
        this.a = str;
        this.b = j90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj;
        return Intrinsics.areEqual(this.a, h90Var.a) && Intrinsics.areEqual(this.b, h90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.a + ", sdkIntegrationStatusData=" + this.b + ")";
    }
}
