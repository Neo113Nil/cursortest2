package o;

/* renamed from: o.Iu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231Iu extends AbstractC0179Gu {
    public final C0283Ku l;
    public final C0257Ju m;
    public final C0719ab n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f50o;

    public C0231Iu(C0283Ku c0283Ku, C0257Ju c0257Ju, C0719ab c0719ab, Object obj) {
        this.l = c0283Ku;
        this.m = c0257Ju;
        this.n = c0719ab;
        this.f50o = obj;
    }

    @Override // o.AbstractC0179Gu
    public final boolean k() {
        return false;
    }

    @Override // o.AbstractC0179Gu
    public final void l(Throwable th) {
        C0719ab c0719ab = this.n;
        C0719ab Q = C0283Ku.Q(c0719ab);
        C0283Ku c0283Ku = this.l;
        C0257Ju c0257Ju = this.m;
        Object obj = this.f50o;
        if (Q == null || !c0283Ku.Z(c0257Ju, Q, obj)) {
            c0257Ju.h.e(new C0954eA(2), 2);
            C0719ab Q2 = C0283Ku.Q(c0719ab);
            if (Q2 == null || !c0283Ku.Z(c0257Ju, Q2, obj)) {
                c0283Ku.i(c0283Ku.x(c0257Ju, obj));
            }
        }
    }
}
