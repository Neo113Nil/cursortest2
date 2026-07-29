package o;

/* renamed from: o.oh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645oh extends GT implements BT {
    public final Q2 i;
    public C1513mh j = new C1513mh();

    public C1645oh(Q2 q2) {
        this.i = q2;
    }

    @Override // o.GT
    public final HT b() {
        return this.j;
    }

    @Override // o.GT
    public final void e(HT ht) {
        AbstractC0048Bt.l(ht, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.j = (C1513mh) ht;
    }

    public final C1513mh g(C1513mh c1513mh, AbstractC1696pS abstractC1696pS, boolean z, InterfaceC1455lp interfaceC1455lp) {
        YD k;
        AbstractC1696pS k2;
        HT m;
        C1513mh c1513mh2;
        C1327jt c1327jt;
        int i;
        if (c1513mh.c(this, abstractC1696pS)) {
            if (z) {
                k = AbstractC2219xO.k();
                int i2 = k.j;
                if (i2 > 0) {
                    Object[] objArr = k.h;
                    int i3 = 0;
                    do {
                        ((C1509md) objArr[i3]).b();
                        i3++;
                    } while (i3 < i2);
                }
                try {
                    GD gd = c1513mh.e;
                    C0950e6 c0950e6 = AbstractC2355zS.a;
                    C1327jt c1327jt2 = (C1327jt) c0950e6.get();
                    if (c1327jt2 == null) {
                        c1327jt2 = new C1327jt();
                        c0950e6.O(c1327jt2);
                    }
                    int i4 = c1327jt2.a;
                    Object[] objArr2 = gd.b;
                    int[] iArr = gd.c;
                    long[] jArr = gd.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        GT gt = (GT) objArr2[i9];
                                        c1327jt2.a = i4 + iArr[i9];
                                        InterfaceC2114vp f = abstractC1696pS.f();
                                        if (f != null) {
                                            f.invoke(gt);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    c1327jt2.a = i4;
                    int i10 = k.j;
                    if (i10 > 0) {
                        Object[] objArr3 = k.h;
                        int i11 = 0;
                        do {
                            ((C1509md) objArr3[i11]).a();
                            i11++;
                        } while (i11 < i10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c1513mh;
        }
        GD gd2 = new GD();
        C0950e6 c0950e62 = AbstractC2355zS.a;
        C1327jt c1327jt3 = (C1327jt) c0950e62.get();
        if (c1327jt3 == null) {
            c1327jt3 = new C1327jt();
            c0950e62.O(c1327jt3);
        }
        int i12 = c1327jt3.a;
        k = AbstractC2219xO.k();
        int i13 = k.j;
        if (i13 > 0) {
            Object[] objArr4 = k.h;
            int i14 = 0;
            do {
                ((C1509md) objArr4[i14]).b();
                i14++;
            } while (i14 < i13);
        }
        try {
            c1327jt3.a = i12 + 1;
            Object m2 = ON.m(interfaceC1455lp, new C1579nh(this, c1327jt3, gd2, i12));
            c1327jt3.a = i12;
            int i15 = k.j;
            if (i15 > 0) {
                Object[] objArr5 = k.h;
                int i16 = 0;
                do {
                    ((C1509md) objArr5[i16]).a();
                    i16++;
                } while (i16 < i15);
            }
            Object obj = AbstractC2025uS.b;
            synchronized (obj) {
                k2 = AbstractC2025uS.k();
                C1513mh c1513mh3 = this.j;
                synchronized (obj) {
                    m = AbstractC2025uS.m(c1513mh3, this);
                    m.a(c1513mh3);
                    m.a = k2.d();
                }
                c1327jt = (C1327jt) AbstractC2355zS.a.get();
                if (c1327jt != null || c1327jt.a != 0) {
                    return c1513mh2;
                }
                AbstractC2025uS.k().m();
                synchronized (obj) {
                    AbstractC1696pS k3 = AbstractC2025uS.k();
                    c1513mh2.c = k3.d();
                    c1513mh2.d = k3.h();
                }
                return c1513mh2;
            }
            c1513mh2 = (C1513mh) m;
            c1513mh2.e = gd2;
            c1513mh2.g = c1513mh2.d(this, k2);
            c1513mh2.f = m2;
            c1327jt = (C1327jt) AbstractC2355zS.a.get();
            if (c1327jt != null) {
            }
            return c1513mh2;
        } finally {
            int i17 = k.j;
            if (i17 > 0) {
                Object[] objArr6 = k.h;
                int i18 = 0;
                do {
                    ((C1509md) objArr6[i18]).a();
                    i18++;
                } while (i18 < i17);
            }
        }
    }

    @Override // o.BT
    public final Object getValue() {
        InterfaceC2114vp f = AbstractC2025uS.k().f();
        if (f != null) {
            f.invoke(this);
        }
        AbstractC1696pS k = AbstractC2025uS.k();
        return g((C1513mh) AbstractC2025uS.j(this.j, k), k, true, this.i).f;
    }

    public final C1513mh h() {
        AbstractC1696pS k = AbstractC2025uS.k();
        return g((C1513mh) AbstractC2025uS.j(this.j, k), k, false, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C1513mh c1513mh = (C1513mh) AbstractC2025uS.i(this.j);
        sb.append(c1513mh.c(this, AbstractC2025uS.k()) ? String.valueOf(c1513mh.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
