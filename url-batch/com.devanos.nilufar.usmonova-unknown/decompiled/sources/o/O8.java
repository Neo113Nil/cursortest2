package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class O8 implements InterfaceC0948e4 {
    public final AbstractC0545Ux a;
    public final C2245xo b;
    public final Map c;
    public final Object d;

    public O8(AbstractC0545Ux abstractC0545Ux, C2245xo c2245xo, Map map) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        this.a = abstractC0545Ux;
        this.b = c2245xo;
        this.c = map;
        this.d = EB.C(EnumC1992tz.h, new C1139h0(3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0948e4
    public final AbstractC1004ey c() {
        Object value = this.d.getValue();
        AbstractC0048Bt.m(value, "<get-type>(...)");
        return (AbstractC1004ey) value;
    }

    @Override // o.InterfaceC0948e4
    public final IS d() {
        return IS.e;
    }

    @Override // o.InterfaceC0948e4
    public final C2245xo e() {
        return this.b;
    }

    @Override // o.InterfaceC0948e4
    public final Map f() {
        return this.c;
    }
}
