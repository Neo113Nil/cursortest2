package o;

/* renamed from: o.Ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452Ri implements InterfaceC2243xm {
    public final InterfaceC2243xm h;

    public C0452Ri(InterfaceC2243xm interfaceC2243xm) {
        this.h = interfaceC2243xm;
    }

    @Override // o.InterfaceC2243xm
    public final Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        C1360kM c1360kM = new C1360kM();
        c1360kM.h = AbstractC1052fg.e;
        Object collect = this.h.collect(new C0426Qi(this, c1360kM, interfaceC2309ym), interfaceC2235xe);
        return collect == EnumC0448Re.h ? collect : C0782bY.a;
    }
}
