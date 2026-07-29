package o;

import java.io.Serializable;

/* renamed from: o.Qi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426Qi implements InterfaceC2309ym {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Serializable j;

    public C0426Qi(C0452Ri c0452Ri, C1360kM c1360kM, InterfaceC2309ym interfaceC2309ym) {
        this.j = c1360kM;
        this.i = interfaceC2309ym;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    @Override // o.InterfaceC2309ym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0400Pi c0400Pi;
        int i;
        C0301Lm c0301Lm;
        int i2;
        boolean z;
        Object obj2;
        Object obj3;
        C0426Qi c0426Qi;
        C0378Om c0378Om;
        Object obj4;
        int i3;
        C0426Qi c0426Qi2;
        switch (this.h) {
            case 0:
                C1360kM c1360kM = (C1360kM) this.j;
                if (interfaceC2235xe instanceof C0400Pi) {
                    c0400Pi = (C0400Pi) interfaceC2235xe;
                    int i4 = c0400Pi.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0400Pi.j = i4 - Integer.MIN_VALUE;
                        Object obj5 = c0400Pi.h;
                        i = c0400Pi.j;
                        C0782bY c0782bY = C0782bY.a;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1494mO.l(obj5);
                            return c0782bY;
                        }
                        AbstractC1494mO.l(obj5);
                        Object obj6 = c1360kM.h;
                        if (obj6 != AbstractC1052fg.e && AbstractC0048Bt.h(obj6, obj)) {
                            return c0782bY;
                        }
                        c1360kM.h = obj;
                        InterfaceC2309ym interfaceC2309ym = (InterfaceC2309ym) this.i;
                        c0400Pi.j = 1;
                        Object emit = interfaceC2309ym.emit(obj, c0400Pi);
                        EnumC0448Re enumC0448Re = EnumC0448Re.h;
                        return emit == enumC0448Re ? enumC0448Re : c0782bY;
                    }
                }
                c0400Pi = new C0400Pi(this, interfaceC2235xe);
                Object obj52 = c0400Pi.h;
                i = c0400Pi.j;
                C0782bY c0782bY2 = C0782bY.a;
                if (i == 0) {
                }
                break;
            case 1:
                if (interfaceC2235xe instanceof C0301Lm) {
                    c0301Lm = (C0301Lm) interfaceC2235xe;
                    int i5 = c0301Lm.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0301Lm.j = i5 - Integer.MIN_VALUE;
                        Object obj7 = c0301Lm.i;
                        i2 = c0301Lm.j;
                        z = true;
                        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
                        if (i2 != 0) {
                            AbstractC1494mO.l(obj7);
                            C0164Gf c0164Gf = (C0164Gf) this.j;
                            c0301Lm.h = this;
                            c0301Lm.l = obj;
                            c0301Lm.j = 1;
                            Object invoke = c0164Gf.invoke(obj, c0301Lm);
                            if (invoke == enumC0448Re2) {
                                return enumC0448Re2;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            c0426Qi = this;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0426Qi = c0301Lm.h;
                                AbstractC1494mO.l(obj7);
                                if (z) {
                                    return C0782bY.a;
                                }
                                throw new C0940e(c0426Qi);
                            }
                            Object obj8 = c0301Lm.l;
                            C0426Qi c0426Qi3 = c0301Lm.h;
                            AbstractC1494mO.l(obj7);
                            obj3 = obj8;
                            c0426Qi = c0426Qi3;
                            obj2 = obj7;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z = false;
                        } else {
                            InterfaceC2309ym interfaceC2309ym2 = (InterfaceC2309ym) c0426Qi.i;
                            c0301Lm.h = c0426Qi;
                            c0301Lm.l = null;
                            c0301Lm.j = 2;
                            if (interfaceC2309ym2.emit(obj3, c0301Lm) == enumC0448Re2) {
                                return enumC0448Re2;
                            }
                        }
                        if (z) {
                        }
                    }
                }
                c0301Lm = new C0301Lm(this, interfaceC2235xe);
                Object obj72 = c0301Lm.i;
                i2 = c0301Lm.j;
                z = true;
                EnumC0448Re enumC0448Re22 = EnumC0448Re.h;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
            default:
                if (interfaceC2235xe instanceof C0378Om) {
                    c0378Om = (C0378Om) interfaceC2235xe;
                    int i6 = c0378Om.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0378Om.j = i6 - Integer.MIN_VALUE;
                        obj4 = c0378Om.i;
                        i3 = c0378Om.j;
                        if (i3 != 0) {
                            AbstractC1494mO.l(obj4);
                            InterfaceC2312yp interfaceC2312yp = (InterfaceC2312yp) this.i;
                            c0378Om.h = this;
                            c0378Om.l = obj;
                            c0378Om.j = 1;
                            obj4 = interfaceC2312yp.invoke(obj, c0378Om);
                            EnumC0448Re enumC0448Re3 = EnumC0448Re.h;
                            if (obj4 == enumC0448Re3) {
                                return enumC0448Re3;
                            }
                            c0426Qi2 = this;
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0378Om.l;
                            c0426Qi2 = c0378Om.h;
                            AbstractC1494mO.l(obj4);
                        }
                        if (((Boolean) obj4).booleanValue()) {
                            return C0782bY.a;
                        }
                        ((C1360kM) c0426Qi2.j).h = obj;
                        throw new C0940e(c0426Qi2);
                    }
                }
                c0378Om = new C0378Om(this, interfaceC2235xe);
                obj4 = c0378Om.i;
                i3 = c0378Om.j;
                if (i3 != 0) {
                }
                if (((Boolean) obj4).booleanValue()) {
                }
        }
    }

    public C0426Qi(C0164Gf c0164Gf, InterfaceC2309ym interfaceC2309ym) {
        this.j = c0164Gf;
        this.i = interfaceC2309ym;
    }

    public C0426Qi(InterfaceC2312yp interfaceC2312yp, C1360kM c1360kM) {
        this.i = interfaceC2312yp;
        this.j = c1360kM;
    }
}
