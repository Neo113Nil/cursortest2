package o;

/* renamed from: o.Ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314Ma extends C0340Na {
    public final Throwable a;

    public C0314Ma(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0314Ma) {
            return AbstractC0048Bt.h(this.a, ((C0314Ma) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o.C0340Na
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
