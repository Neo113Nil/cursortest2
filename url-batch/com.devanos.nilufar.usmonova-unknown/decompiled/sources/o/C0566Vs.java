package o;

/* renamed from: o.Vs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566Vs {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0566Vs) {
            return this.a == ((C0566Vs) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
