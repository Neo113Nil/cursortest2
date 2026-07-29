package o;

/* loaded from: classes.dex */
public final class W8 extends AbstractC1027fH implements InterfaceC0961eH {
    public final R8 n;

    /* renamed from: o, reason: collision with root package name */
    public final C0208Hx f123o;
    public final C1334k p;
    public AK q;
    public C1120gi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(C2245xo c2245xo, VA va, InterfaceC0761bD interfaceC0761bD, AK ak, R8 r8) {
        super(interfaceC0761bD, c2245xo);
        AbstractC0048Bt.n(c2245xo, "fqName");
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        this.n = r8;
        HK hk = ak.k;
        AbstractC0048Bt.m(hk, "proto.strings");
        GK gk = ak.l;
        AbstractC0048Bt.m(gk, "proto.qualifiedNames");
        C0208Hx c0208Hx = new C0208Hx(hk, gk);
        this.f123o = c0208Hx;
        this.p = new C1334k(ak, c0208Hx, r8, new UY(13, this));
        this.q = ak;
    }

    public final void I0(C0296Lh c0296Lh) {
        AbstractC0048Bt.n(c0296Lh, "components");
        AK ak = this.q;
        if (ak == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.q = null;
        C2281yK c2281yK = ak.m;
        AbstractC0048Bt.m(c2281yK, "proto.`package`");
        this.r = new C1120gi(this, c2281yK, this.f123o, this.n, null, c0296Lh, "scope of " + this, new C1139h0(8, this));
    }

    @Override // o.InterfaceC0961eH
    public final WB r0() {
        C1120gi c1120gi = this.r;
        if (c1120gi != null) {
            return c1120gi;
        }
        AbstractC0048Bt.i0("_memberScope");
        throw null;
    }

    @Override // o.AbstractC1027fH, o.AbstractC1184hg
    public final String toString() {
        return "builtins package fragment for " + this.l + " from " + AbstractC0192Hh.j(this);
    }
}
