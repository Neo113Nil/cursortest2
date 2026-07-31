package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s70 extends x70 {
    public final String b;

    public s70(String str) {
        super("Ad Units");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s70) && Intrinsics.areEqual(this.b, ((s70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AdUnit(unitId=" + this.b + ")";
    }
}
