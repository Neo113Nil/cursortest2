package o;

/* renamed from: o.oK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622oK extends AbstractC1851rq {
    public int k;
    public int l;

    @Override // o.AbstractC1654oq
    public final E c() {
        C1688pK c1688pK = new C1688pK(this);
        int i = (this.k & 1) != 1 ? 0 : 1;
        c1688pK.k = this.l;
        c1688pK.j = i;
        if (c1688pK.b()) {
            return c1688pK;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C1622oK c1622oK = new C1622oK();
        C1688pK c1688pK = new C1688pK(this);
        int i = (this.k & 1) != 1 ? 0 : 1;
        c1688pK.k = this.l;
        c1688pK.j = i;
        c1622oK.g(c1688pK);
        return c1622oK;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C1688pK c1688pK = null;
        try {
            try {
                C1688pK.f210o.getClass();
                g(new C1688pK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C1688pK c1688pK2 = (C1688pK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c1688pK = c1688pK2;
                    if (c1688pK != null) {
                        g(c1688pK);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c1688pK != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        g((C1688pK) abstractC2115vq);
        return this;
    }

    public final void g(C1688pK c1688pK) {
        if (c1688pK == C1688pK.n) {
            return;
        }
        if ((c1688pK.j & 1) == 1) {
            int i = c1688pK.k;
            this.k = 1 | this.k;
            this.l = i;
        }
        f(c1688pK);
        this.h = this.h.k(c1688pK.i);
    }
}
