package yads;

/* loaded from: classes4.dex */
public final class ww extends bx {
    public final boolean a;

    public ww(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww) && this.a == ((ww) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "CmpPresent(value=" + this.a + ")";
    }
}
