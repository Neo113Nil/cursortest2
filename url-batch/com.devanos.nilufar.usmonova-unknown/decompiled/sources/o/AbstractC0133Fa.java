package o;

/* renamed from: o.Fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0133Fa extends AbstractC0055Ca {
    public final InterfaceC2243xm k;

    public AbstractC0133Fa(int i, H8 h8, InterfaceC0189He interfaceC0189He, InterfaceC2243xm interfaceC2243xm) {
        super(interfaceC0189He, i, h8);
        this.k = interfaceC2243xm;
    }

    @Override // o.AbstractC0055Ca
    public final Object a(InterfaceC2214xJ interfaceC2214xJ, InterfaceC2235xe interfaceC2235xe) {
        Object d = d(new MQ(interfaceC2214xJ), interfaceC2235xe);
        return d == EnumC0448Re.h ? d : C0782bY.a;
    }

    @Override // o.AbstractC0055Ca, o.InterfaceC2243xm
    public final Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        int i = this.i;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == -3) {
            InterfaceC0189He context = interfaceC2235xe.getContext();
            Boolean bool = Boolean.FALSE;
            C1903sc c1903sc = new C1903sc(2);
            InterfaceC0189He interfaceC0189He = this.h;
            InterfaceC0189He D = !((Boolean) interfaceC0189He.I(bool, c1903sc)).booleanValue() ? context.D(interfaceC0189He) : AbstractC0946e20.t(context, interfaceC0189He, false);
            if (AbstractC0048Bt.h(D, context)) {
                Object d = d(interfaceC2309ym, interfaceC2235xe);
                if (d == enumC0448Re) {
                    return d;
                }
            } else {
                C0460Rq c0460Rq = C0460Rq.w;
                if (AbstractC0048Bt.h(D.k(c0460Rq), context.k(c0460Rq))) {
                    InterfaceC0189He context2 = interfaceC2235xe.getContext();
                    if (!(interfaceC2309ym instanceof MQ) && !(interfaceC2309ym instanceof RE)) {
                        interfaceC2309ym = new C0249Jm(interfaceC2309ym, context2);
                    }
                    Object d0 = AbstractC1473m3.d0(D, interfaceC2309ym, PX.O0(D), new C0107Ea(this, null), interfaceC2235xe);
                    if (d0 == enumC0448Re) {
                        return d0;
                    }
                }
            }
            return C0782bY.a;
        }
        Object collect = super.collect(interfaceC2309ym, interfaceC2235xe);
        if (collect == enumC0448Re) {
            return collect;
        }
        return C0782bY.a;
    }

    public abstract Object d(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe);

    @Override // o.AbstractC0055Ca
    public final String toString() {
        return this.k + " -> " + super.toString();
    }
}
