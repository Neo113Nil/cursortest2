package o;

/* renamed from: o.zw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2385zw extends C0674Zw implements InterfaceC2253xw {
    public final Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2385zw(AbstractC1330jw abstractC1330jw, String str, String str2, Object obj) {
        super(abstractC1330jw, str, str2, obj);
        AbstractC0048Bt.n(abstractC1330jw, "container");
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "signature");
        this.v = EB.C(EnumC1992tz.h, new C1139h0(21, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0077Cw
    public final InterfaceC1857rw b() {
        return (C2319yw) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC2253xw
    public final void c(Object obj, Object obj2) {
        ((C2319yw) this.v.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC2253xw, o.InterfaceC0077Cw
    public final InterfaceC2187ww b() {
        return (C2319yw) this.v.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2385zw(AbstractC1330jw abstractC1330jw, PJ pj) {
        super(abstractC1330jw, pj);
        AbstractC0048Bt.n(pj, "descriptor");
        this.v = EB.C(EnumC1992tz.h, new C1139h0(21, this));
    }
}
