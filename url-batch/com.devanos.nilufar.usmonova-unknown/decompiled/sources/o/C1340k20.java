package o;

import java.util.Arrays;

/* renamed from: o.k20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340k20 {
    public final G4 a;
    public final C0300Ll b;

    public /* synthetic */ C1340k20(G4 g4, C0300Ll c0300Ll) {
        this.a = g4;
        this.b = c0300Ll;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1340k20)) {
            C1340k20 c1340k20 = (C1340k20) obj;
            if (EB.o(this.a, c1340k20.a) && EB.o(this.b, c1340k20.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        C0208Hx c0208Hx = new C0208Hx(12, this);
        c0208Hx.H0(this.a, "key");
        c0208Hx.H0(this.b, "feature");
        return c0208Hx.toString();
    }
}
