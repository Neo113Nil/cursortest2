package o;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861s extends AbstractC1596ny implements InterfaceC2312yp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1861s(int i, int i2, Object obj) {
        super(2);
        this.h = i2;
        this.i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        char c;
        long j;
        char c2;
        long j2;
        Collection A0;
        char c3 = 7;
        long j3 = -9187201950435737472L;
        InterfaceC0718aa interfaceC0718aa = null;
        int i = 0;
        switch (this.h) {
            case 0:
                InterfaceC1377kd interfaceC1377kd = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd = (C1575nd) interfaceC1377kd;
                    if (c1575nd.t()) {
                        c1575nd.F();
                        return C0782bY.a;
                    }
                }
                ((AbstractC1927t) this.i).a(interfaceC1377kd, 0);
                return C0782bY.a;
            case 1:
                ((Number) obj2).intValue();
                ((C1247id) this.i).a((InterfaceC1377kd) obj, AbstractC1052fg.a0(1));
                return C0782bY.a;
            case 2:
                ((Number) obj2).intValue();
                ((C0177Gs) this.i).a((InterfaceC1377kd) obj, AbstractC1052fg.a0(1));
                return C0782bY.a;
            case 3:
                InterfaceC0980ea interfaceC0980ea = (InterfaceC0980ea) obj;
                C0512Tq c0512Tq = (C0512Tq) obj2;
                ME me = (ME) this.i;
                C0027Ay c0027Ay = me.l;
                if (c0027Ay.w()) {
                    C0765bH snapshotObserver = ((S2) PX.J0(c0027Ay)).getSnapshotObserver();
                    C1823rO c1823rO = ME.D;
                    snapshotObserver.a(me, C2316yt.x, new V7(me, interfaceC0980ea, c0512Tq, 6));
                    me.B = false;
                } else {
                    me.B = true;
                }
                return C0782bY.a;
            case 4:
                Set set = (Set) obj;
                C0901dM c0901dM = (C0901dM) this.i;
                synchronized (c0901dM.b) {
                    try {
                        if (((XL) c0901dM.r.getValue()).compareTo(XL.l) >= 0) {
                            QD qd = c0901dM.g;
                            if (set instanceof YP) {
                                QD qd2 = ((YP) set).h;
                                Object[] objArr = qd2.b;
                                long[] jArr = qd2.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j4 = jArr[i2];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = i; i4 < i3; i4++) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj3 = objArr[(i2 << 3) + i4];
                                                    if (!(obj3 instanceof GT) || ((GT) obj3).c(1)) {
                                                        qd.a(obj3);
                                                    }
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i3 != 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                            i = 0;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof GT) || ((GT) obj4).c(1)) {
                                        qd.a(obj4);
                                    }
                                }
                            }
                            interfaceC0718aa = c0901dM.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC0718aa != null) {
                    ((C0849ca) interfaceC0718aa).resumeWith(C0782bY.a);
                }
                return C0782bY.a;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                Set set2 = (Set) obj;
                if (!(set2 instanceof YP)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj5 : set3) {
                            if ((obj5 instanceof GT) && !((GT) obj5).c(4)) {
                            }
                            ((J8) this.i).f(set2);
                        }
                    }
                    return C0782bY.a;
                }
                QD qd3 = ((YP) set2).h;
                Object[] objArr2 = qd3.b;
                long[] jArr2 = qd3.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr2[i5];
                        if ((((~j5) << c3) & j5 & j3) != j3) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j5 & 255) < 128) {
                                    c2 = c3;
                                    Object obj6 = objArr2[(i5 << 3) + i7];
                                    j2 = j3;
                                    if ((obj6 instanceof GT) && !((GT) obj6).c(4)) {
                                    }
                                } else {
                                    c2 = c3;
                                    j2 = j3;
                                }
                                j5 >>= 8;
                                i7++;
                                c3 = c2;
                                j3 = j2;
                            }
                            c = c3;
                            j = j3;
                            if (i6 != 8) {
                            }
                        } else {
                            c = c3;
                            j = j3;
                        }
                        if (i5 != length2) {
                            i5++;
                            c3 = c;
                            j3 = j;
                        }
                    }
                    ((J8) this.i).f(set2);
                }
                return C0782bY.a;
            default:
                Collection collection = (Set) obj;
                DS ds = (DS) this.i;
                AtomicReference atomicReference = ds.b;
                while (true) {
                    Object obj7 = atomicReference.get();
                    if (obj7 == null) {
                        A0 = collection;
                    } else if (obj7 instanceof Set) {
                        A0 = AbstractC0868ct.K(obj7, collection);
                    } else {
                        if (!(obj7 instanceof List)) {
                            EB.i("Unexpected notification");
                            throw null;
                        }
                        A0 = AbstractC0720ac.A0((Collection) obj7, AbstractC0868ct.J(collection));
                    }
                    while (!atomicReference.compareAndSet(obj7, A0)) {
                        if (atomicReference.get() != obj7) {
                            break;
                        }
                    }
                    if (DS.a(ds)) {
                        ds.a.invoke(new LE(9, ds));
                    }
                    return C0782bY.a;
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1861s(int i, Object obj) {
        super(2);
        this.h = i;
        this.i = obj;
    }
}
