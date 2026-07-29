package o;

/* renamed from: o.vw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2121vw extends C0544Uw implements InterfaceC1989tw {
    public final Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2121vw(AbstractC1330jw abstractC1330jw, PJ pj) {
        super(abstractC1330jw, pj);
        AbstractC0048Bt.n(pj, "descriptor");
        this.u = EB.C(EnumC1992tz.h, new C1139h0(20, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0077Cw
    public final InterfaceC1857rw b() {
        return (C2055uw) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC1989tw, o.InterfaceC0077Cw
    public final InterfaceC1923sw b() {
        return (C2055uw) this.u.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2121vw(AbstractC1330jw abstractC1330jw, String str, String str2, Object obj) {
        super(abstractC1330jw, str, str2, obj);
        AbstractC0048Bt.n(abstractC1330jw, "container");
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "signature");
        this.u = EB.C(EnumC1992tz.h, new C1139h0(20, this));
    }
}
