package o;

/* renamed from: o.zO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2351zO {
    public final long a = C1114gc.f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2351zO)) {
            return false;
        }
        C2351zO c2351zO = (C2351zO) obj;
        if (!C1114gc.b(this.a, c2351zO.a)) {
            return false;
        }
        c2351zO.getClass();
        return true;
    }

    public final int hashCode() {
        int i = C1114gc.g;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C1114gc.g(this.a)) + ", rippleAlpha=null)";
    }
}
