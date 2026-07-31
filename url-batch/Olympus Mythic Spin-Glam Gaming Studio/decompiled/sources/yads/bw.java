package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bw {
    public final aw a;
    public final String b;

    public bw(aw awVar, String str) {
        this.a = awVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return this.a == bwVar.a && Intrinsics.areEqual(this.b, bwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.a + ", text=" + this.b + ")";
    }
}
