package o;

/* renamed from: o.Jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249Jm implements InterfaceC2309ym {
    public final /* synthetic */ int h = 0;
    public final Object i;
    public final Object j;
    public final AbstractC2225xU k;

    /* JADX WARN: Multi-variable type inference failed */
    public C0249Jm(C1098gM c1098gM, InterfaceC2309ym interfaceC2309ym, InterfaceC2312yp interfaceC2312yp) {
        this.i = c1098gM;
        this.j = interfaceC2309ym;
        this.k = (AbstractC2225xU) interfaceC2312yp;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Type inference failed for: r9v5, types: [o.xU, o.yp] */
    @Override // o.InterfaceC2309ym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0223Im c0223Im;
        Object obj2;
        int i;
        C0249Jm c0249Jm;
        switch (this.h) {
            case 0:
                if (interfaceC2235xe instanceof C0223Im) {
                    c0223Im = (C0223Im) interfaceC2235xe;
                    int i2 = c0223Im.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0223Im.l = i2 - Integer.MIN_VALUE;
                        obj2 = c0223Im.j;
                        i = c0223Im.l;
                        C0782bY c0782bY = C0782bY.a;
                        EnumC0448Re enumC0448Re = EnumC0448Re.h;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = c0223Im.i;
                                    c0249Jm = c0223Im.h;
                                    AbstractC1494mO.l(obj2);
                                } else if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            AbstractC1494mO.l(obj2);
                            return c0782bY;
                        }
                        AbstractC1494mO.l(obj2);
                        if (((C1098gM) this.i).h) {
                            InterfaceC2309ym interfaceC2309ym = (InterfaceC2309ym) this.j;
                            c0223Im.l = 1;
                            if (interfaceC2309ym.emit(obj, c0223Im) != enumC0448Re) {
                                return c0782bY;
                            }
                        } else {
                            c0223Im.h = this;
                            c0223Im.i = obj;
                            c0223Im.l = 2;
                            obj2 = this.k.invoke(obj, c0223Im);
                            if (obj2 != enumC0448Re) {
                                c0249Jm = this;
                            }
                        }
                        return enumC0448Re;
                        if (!((Boolean) obj2).booleanValue()) {
                            return c0782bY;
                        }
                        ((C1098gM) c0249Jm.i).h = true;
                        InterfaceC2309ym interfaceC2309ym2 = (InterfaceC2309ym) c0249Jm.j;
                        c0223Im.h = null;
                        c0223Im.i = null;
                        c0223Im.l = 3;
                        if (interfaceC2309ym2.emit(obj, c0223Im) != enumC0448Re) {
                            return c0782bY;
                        }
                        return enumC0448Re;
                    }
                }
                c0223Im = new C0223Im(this, interfaceC2235xe);
                obj2 = c0223Im.j;
                i = c0223Im.l;
                C0782bY c0782bY2 = C0782bY.a;
                EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
                if (i == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                Object d0 = AbstractC1473m3.d0((InterfaceC0189He) this.i, obj, this.j, (XX) this.k, interfaceC2235xe);
                return d0 == EnumC0448Re.h ? d0 : C0782bY.a;
        }
    }

    public C0249Jm(InterfaceC2309ym interfaceC2309ym, InterfaceC0189He interfaceC0189He) {
        this.i = interfaceC0189He;
        this.j = PX.O0(interfaceC0189He);
        this.k = new XX(interfaceC2309ym, null);
    }
}
