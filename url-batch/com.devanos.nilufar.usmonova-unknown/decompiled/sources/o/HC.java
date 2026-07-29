package o;

/* loaded from: classes.dex */
public final class HC implements InterfaceC0839cQ {
    public final F a;
    public final C0913dY b;
    public final C1781ql c;

    public HC(C0913dY c0913dY, C1781ql c1781ql, F f) {
        this.b = c0913dY;
        c1781ql.getClass();
        this.c = c1781ql;
        this.a = f;
    }

    @Override // o.InterfaceC0839cQ
    public final void a(Object obj, Object obj2) {
        AbstractC1036fQ.x(this.b, obj, obj2);
    }

    @Override // o.InterfaceC0839cQ
    public final boolean b(AbstractC2181wq abstractC2181wq, AbstractC2181wq abstractC2181wq2) {
        this.b.getClass();
        return abstractC2181wq.unknownFields.equals(abstractC2181wq2.unknownFields);
    }

    @Override // o.InterfaceC0839cQ
    public final void c(Object obj, Y1 y1) {
        this.c.getClass();
        AbstractC1888sN.q(obj);
        throw null;
    }

    @Override // o.InterfaceC0839cQ
    public final void d(Object obj) {
        this.b.getClass();
        ((AbstractC2181wq) obj).unknownFields.e = false;
        this.c.getClass();
        AbstractC1888sN.q(obj);
        throw null;
    }

    @Override // o.InterfaceC0839cQ
    public final boolean e(Object obj) {
        this.c.getClass();
        AbstractC1888sN.q(obj);
        throw null;
    }

    @Override // o.InterfaceC0839cQ
    public final void f(Object obj, C0575Wb c0575Wb, C1715pl c1715pl) {
        this.b.getClass();
        C0913dY.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // o.InterfaceC0839cQ
    public final int g(AbstractC2181wq abstractC2181wq) {
        this.b.getClass();
        C0847cY c0847cY = abstractC2181wq.unknownFields;
        int i = c0847cY.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c0847cY.a; i3++) {
            int i4 = c0847cY.b[i3] >>> 3;
            i2 += C0627Yb.S(3, (C1151h9) c0847cY.c[i3]) + C0627Yb.a0(i4) + C0627Yb.Z(2) + (C0627Yb.Z(1) * 2);
        }
        c0847cY.d = i2;
        return i2;
    }

    @Override // o.InterfaceC0839cQ
    public final AbstractC2181wq h() {
        F f = this.a;
        return f instanceof AbstractC2181wq ? ((AbstractC2181wq) f).i() : ((AbstractC1720pq) ((AbstractC2181wq) f).c(5)).b();
    }

    @Override // o.InterfaceC0839cQ
    public final int i(AbstractC2181wq abstractC2181wq) {
        this.b.getClass();
        return abstractC2181wq.unknownFields.hashCode();
    }
}
