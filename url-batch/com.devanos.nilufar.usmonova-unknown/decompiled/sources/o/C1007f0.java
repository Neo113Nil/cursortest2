package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007f0 extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1007f0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [o.ny, o.vp] */
    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        long j;
        Object invoke;
        switch (this.h) {
            case 0:
                PW pw = (PW) obj;
                AbstractC0048Bt.n(pw, "$this$runForkingPoint");
                Iterator it = ((ArrayList) this.i).iterator();
                while (it.hasNext()) {
                    C0941e0 c0941e0 = new C0941e0((RW) this.j, (InterfaceC2298yb) this.k, (MR) it.next(), (MR) this.l, 0);
                    if (!pw.a) {
                        pw.a = ((Boolean) c0941e0.invoke()).booleanValue();
                    }
                }
                return C0782bY.a;
            default:
                long longValue = ((Number) obj).longValue();
                InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.l;
                C1164hM c1164hM = (C1164hM) this.k;
                C0177Gs c0177Gs = (C0177Gs) this.j;
                BT bt = (BT) ((TD) this.i).getValue();
                long longValue2 = bt != null ? ((Number) bt.getValue()).longValue() : longValue;
                long j2 = c0177Gs.c;
                YD yd = c0177Gs.a;
                boolean z3 = false;
                int i = 0;
                boolean z4 = true;
                if (j2 == Long.MIN_VALUE || c1164hM.h != AbstractC0773bP.b(interfaceC0422Qe.m())) {
                    c0177Gs.c = longValue;
                    int i2 = yd.j;
                    if (i2 > 0) {
                        Object[] objArr = yd.h;
                        int i3 = 0;
                        do {
                            ((C0099Ds) objArr[i3]).n = true;
                            i3++;
                        } while (i3 < i2);
                    }
                    c1164hM.h = AbstractC0773bP.b(interfaceC0422Qe.m());
                }
                float f = c1164hM.h;
                if (f == 0.0f) {
                    int i4 = yd.j;
                    if (i4 > 0) {
                        Object[] objArr2 = yd.h;
                        do {
                            C0099Ds c0099Ds = (C0099Ds) objArr2[i];
                            c0099Ds.k.setValue(c0099Ds.l.c);
                            c0099Ds.n = true;
                            i++;
                        } while (i < i4);
                    }
                } else {
                    long j3 = (long) ((longValue2 - c0177Gs.c) / f);
                    int i5 = yd.j;
                    if (i5 > 0) {
                        Object[] objArr3 = yd.h;
                        int i6 = 0;
                        z = true;
                        while (true) {
                            C0099Ds c0099Ds2 = (C0099Ds) objArr3[i6];
                            if (c0099Ds2.m) {
                                z2 = z4;
                            } else {
                                c0099Ds2.p.b.setValue(Boolean.FALSE);
                                if (c0099Ds2.n) {
                                    c0099Ds2.n = z3;
                                    c0099Ds2.f33o = j3;
                                }
                                long j4 = j3 - c0099Ds2.f33o;
                                JU ju = c0099Ds2.l;
                                ju.getClass();
                                if (ju.h < 0) {
                                    ju.h = ju.a.a(ju.e, ju.f, ju.g);
                                }
                                if (j4 >= ju.h) {
                                    invoke = ju.c;
                                    j = j4;
                                } else {
                                    V3 f2 = ju.a.f(j4, ju.e, ju.f, ju.g);
                                    j = j4;
                                    int b = f2.b();
                                    for (int i7 = 0; i7 < b; i7++) {
                                        if (Float.isNaN(f2.a(i7))) {
                                            throw new IllegalStateException("AnimationVector cannot contain a NaN. " + f2 + ". Animation: " + ju + ", playTimeNanos: " + j);
                                        }
                                    }
                                    invoke = ((AbstractC1596ny) ju.b.j).invoke(f2);
                                }
                                c0099Ds2.k.setValue(invoke);
                                JU ju2 = c0099Ds2.l;
                                ju2.getClass();
                                if (ju2.h < 0) {
                                    z2 = z4;
                                    ju2.h = ju2.a.a(ju2.e, ju2.f, ju2.g);
                                } else {
                                    z2 = z4;
                                }
                                c0099Ds2.m = j >= ju2.h ? z2 : false;
                            }
                            if (!c0099Ds2.m) {
                                z = false;
                            }
                            i6++;
                            if (i6 < i5) {
                                z4 = z2;
                                z3 = false;
                            }
                        }
                    } else {
                        z = true;
                    }
                    c0177Gs.d.setValue(Boolean.valueOf(!z));
                }
                return C0782bY.a;
        }
    }
}
