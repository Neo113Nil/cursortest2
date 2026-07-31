package yads;

/* loaded from: classes13.dex */
public final class vn3 {
    public final xn3 a;

    public vn3(xn3 xn3Var) {
        this.a = xn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn3) && this.a == ((vn3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebViewAdSettings(cacheMode=" + this.a + ")";
    }

    public vn3() {
        this.a = xn3.e;
    }
}
