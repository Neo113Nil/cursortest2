package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i80 {
    public final String a;
    public final String b;

    public i80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i80)) {
            return false;
        }
        i80 i80Var = (i80) obj;
        return Intrinsics.areEqual(this.a, i80Var.a) && Intrinsics.areEqual(this.b, i80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelMediationAdapterParameterData(name=" + this.a + ", value=" + this.b + ")";
    }
}
