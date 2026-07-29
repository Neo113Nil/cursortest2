package o;

/* loaded from: classes.dex */
public final class YI {
    public final String a;

    public YI(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YI)) {
            return false;
        }
        return AbstractC0048Bt.h(this.a, ((YI) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
