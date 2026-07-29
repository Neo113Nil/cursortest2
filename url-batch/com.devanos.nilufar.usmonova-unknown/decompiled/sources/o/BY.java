package o;

/* loaded from: classes.dex */
public final class BY {
    public final String a;

    public BY(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BY) {
            return AbstractC0048Bt.h(this.a, ((BY) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
