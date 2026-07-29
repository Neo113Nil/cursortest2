package o;

/* loaded from: classes.dex */
public final class ZU {
    public final int a;

    public static String a(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ZU) {
            return this.a == ((ZU) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
