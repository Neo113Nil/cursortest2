package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wv0 {
    public static final wv0 c = new wv0(2, false);
    public static final wv0 d = new wv0(1, true);
    public final int a;
    public final boolean b;

    public wv0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv0)) {
            return false;
        }
        wv0 wv0Var = (wv0) obj;
        return this.a == wv0Var.a && this.b == wv0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
