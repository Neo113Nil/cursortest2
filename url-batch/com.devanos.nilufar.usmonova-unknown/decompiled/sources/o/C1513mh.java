package o;

/* renamed from: o.mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513mh extends HT {
    public static final Object h = new Object();
    public int c;
    public int d;
    public GD e;
    public Object f;
    public int g;

    public C1513mh() {
        GD gd = AbstractC2210xF.a;
        AbstractC0048Bt.l(gd, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.e = gd;
        this.f = h;
    }

    @Override // o.HT
    public final void a(HT ht) {
        AbstractC0048Bt.l(ht, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C1513mh c1513mh = (C1513mh) ht;
        this.e = c1513mh.e;
        this.f = c1513mh.f;
        this.g = c1513mh.g;
    }

    @Override // o.HT
    public final HT b() {
        return new C1513mh();
    }

    public final boolean c(C1645oh c1645oh, AbstractC1696pS abstractC1696pS) {
        boolean z;
        boolean z2;
        Object obj = AbstractC2025uS.b;
        synchronized (obj) {
            z = true;
            if (this.c == abstractC1696pS.d()) {
                if (this.d == abstractC1696pS.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(c1645oh, abstractC1696pS))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = abstractC1696pS.d();
            this.d = abstractC1696pS.h();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(C1645oh c1645oh, AbstractC1696pS abstractC1696pS) {
        GD gd;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        HT j;
        synchronized (AbstractC2025uS.b) {
            gd = this.e;
        }
        int i10 = 7;
        if (gd.e == 0) {
            return 7;
        }
        YD k = AbstractC2219xO.k();
        int i11 = k.j;
        int i12 = 1;
        if (i11 > 0) {
            Object[] objArr = k.h;
            int i13 = 0;
            do {
                ((C1509md) objArr[i13]).b();
                i13++;
            } while (i13 < i11);
        }
        try {
            Object[] objArr2 = gd.b;
            int[] iArr = gd.c;
            long[] jArr = gd.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i4 = 7;
                int i14 = 0;
                while (true) {
                    long j2 = jArr[i14];
                    if ((((~j2) << i10) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        i6 = i10;
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j2 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                i9 = i15;
                                GT gt = (GT) objArr2[i18];
                                if (iArr[i18] != i12) {
                                    i8 = i12;
                                } else {
                                    if (gt instanceof C1645oh) {
                                        C1645oh c1645oh2 = (C1645oh) gt;
                                        i8 = i12;
                                        try {
                                            i = 0;
                                            try {
                                                j = c1645oh2.g((C1513mh) AbstractC2025uS.j(c1645oh2.j, abstractC1696pS), abstractC1696pS, false, c1645oh2.i);
                                            } catch (Throwable th) {
                                                th = th;
                                                i2 = k.j;
                                                if (i2 > 0) {
                                                    Object[] objArr3 = k.h;
                                                    int i19 = i;
                                                    do {
                                                        ((C1509md) objArr3[i19]).a();
                                                        i19++;
                                                    } while (i19 < i2);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i = 0;
                                            i2 = k.j;
                                            if (i2 > 0) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i8 = i12;
                                        i = 0;
                                        j = AbstractC2025uS.j(gt.b(), abstractC1696pS);
                                    }
                                    i4 = (((i4 * 31) + System.identityHashCode(j)) * 31) + j.a;
                                    j2 >>= i9;
                                    i17++;
                                    i12 = i8;
                                    i15 = i9;
                                }
                            } else {
                                i8 = i12;
                                i9 = i15;
                            }
                            j2 >>= i9;
                            i17++;
                            i12 = i8;
                            i15 = i9;
                        }
                        i7 = i12;
                        i3 = 0;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        i6 = i10;
                        i7 = i12;
                        i3 = 0;
                    }
                    if (i14 == length) {
                        i10 = i4;
                        break;
                    }
                    i14++;
                    i10 = i6;
                    i12 = i7;
                }
                i5 = k.j;
                if (i5 > 0) {
                    Object[] objArr4 = k.h;
                    int i20 = i3;
                    do {
                        ((C1509md) objArr4[i20]).a();
                        i20++;
                    } while (i20 < i5);
                }
                return i4;
            }
            i3 = 0;
            i4 = i10;
            i5 = k.j;
            if (i5 > 0) {
            }
            return i4;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
