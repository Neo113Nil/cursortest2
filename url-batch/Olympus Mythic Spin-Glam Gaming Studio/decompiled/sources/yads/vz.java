package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vz extends xz {
    public final String a;
    public final Throwable b;

    public vz(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz)) {
            return false;
        }
        vz vzVar = (vz) obj;
        return Intrinsics.areEqual(this.a, vzVar.a) && Intrinsics.areEqual(this.b, vzVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Failure(missingAssetName=" + this.a + ", exception=" + this.b + ")";
    }
}
