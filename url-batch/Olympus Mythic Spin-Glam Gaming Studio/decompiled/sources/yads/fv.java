package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fv {
    public final String a;
    public final int b;

    public fv(int i, String str) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv)) {
            return false;
        }
        fv fvVar = (fv) obj;
        return Intrinsics.areEqual(this.a, fvVar.a) && this.b == fvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickQrcode(url=" + this.a + ", sizeInPx=" + this.b + ")";
    }
}
