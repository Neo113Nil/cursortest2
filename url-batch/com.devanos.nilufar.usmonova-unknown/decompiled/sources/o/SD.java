package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class SD extends AbstractC1696pS {
    public static final int[] n = new int[0];
    public final InterfaceC2114vp e;
    public final InterfaceC2114vp f;
    public int g;
    public QD h;
    public ArrayList i;
    public C1959tS j;
    public int[] k;
    public int l;
    public boolean m;

    public SD(int i, C1959tS c1959tS, InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        super(i, c1959tS);
        this.e = interfaceC2114vp;
        this.f = interfaceC2114vp2;
        this.j = C1959tS.l;
        this.k = n;
        this.l = 1;
    }

    public void A(QD qd) {
        this.h = qd;
    }

    public SD B(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        if (this.c) {
            AbstractC1052fg.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.m && this.d < 0) {
            AbstractC1052fg.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = AbstractC2025uS.b;
        synchronized (obj) {
            try {
                int i = AbstractC2025uS.d;
                AbstractC2025uS.d = i + 1;
                AbstractC2025uS.c = AbstractC2025uS.c.n(i);
                C1959tS e = e();
                r(e.n(i));
                try {
                    C1156hE c1156hE = new C1156hE(i, AbstractC2025uS.e(e, d() + 1, i), AbstractC2025uS.l(interfaceC2114vp, f(), true), AbstractC2025uS.b(interfaceC2114vp2, i()), this);
                    if (this.m || this.c) {
                        return c1156hE;
                    }
                    int d = d();
                    synchronized (obj) {
                        int i2 = AbstractC2025uS.d;
                        AbstractC2025uS.d = i2 + 1;
                        q(i2);
                        AbstractC2025uS.c = AbstractC2025uS.c.n(d());
                    }
                    r(AbstractC2025uS.e(e(), d + 1, d()));
                    return c1156hE;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // o.AbstractC1696pS
    public final void b() {
        AbstractC2025uS.c = AbstractC2025uS.c.k(d()).j(this.j);
    }

    @Override // o.AbstractC1696pS
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (AbstractC2025uS.b) {
            int i = this.d;
            if (i >= 0) {
                AbstractC2025uS.s(i);
                this.d = -1;
            }
        }
        l();
    }

    @Override // o.AbstractC1696pS
    public boolean g() {
        return false;
    }

    @Override // o.AbstractC1696pS
    public int h() {
        return this.g;
    }

    @Override // o.AbstractC1696pS
    public InterfaceC2114vp i() {
        return this.f;
    }

    @Override // o.AbstractC1696pS
    public void k() {
        this.l++;
    }

    @Override // o.AbstractC1696pS
    public void l() {
        int i = this.l;
        if (i <= 0) {
            AbstractC1052fg.S("no pending nested snapshots");
            throw null;
        }
        int i2 = i - 1;
        this.l = i2;
        if (i2 != 0 || this.m) {
            return;
        }
        QD w = w();
        if (w != null) {
            if (this.m) {
                AbstractC1052fg.T("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d = d();
            Object[] objArr = w.b;
            long[] jArr = w.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                for (HT b = ((GT) objArr[(i3 << 3) + i5]).b(); b != null; b = b.b) {
                                    int i6 = b.a;
                                    if (i6 == d || AbstractC0720ac.j0(this.j, Integer.valueOf(i6))) {
                                        b.a = 0;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        a();
    }

    @Override // o.AbstractC1696pS
    public void m() {
        if (this.m || this.c) {
            return;
        }
        u();
    }

    @Override // o.AbstractC1696pS
    public void n(GT gt) {
        QD w = w();
        if (w == null) {
            int i = WP.a;
            w = new QD();
            A(w);
        }
        w.a(gt);
    }

    @Override // o.AbstractC1696pS
    public final void o() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            AbstractC2025uS.s(this.k[i]);
        }
        int i2 = this.d;
        if (i2 >= 0) {
            AbstractC2025uS.s(i2);
            this.d = -1;
        }
    }

    @Override // o.AbstractC1696pS
    public void s(int i) {
        this.g = i;
    }

    @Override // o.AbstractC1696pS
    public AbstractC1696pS t(InterfaceC2114vp interfaceC2114vp) {
        C1222iE c1222iE;
        if (this.c) {
            AbstractC1052fg.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.m && this.d < 0) {
            AbstractC1052fg.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d = d();
        z(d());
        Object obj = AbstractC2025uS.b;
        synchronized (obj) {
            int i = AbstractC2025uS.d;
            AbstractC2025uS.d = i + 1;
            AbstractC2025uS.c = AbstractC2025uS.c.n(i);
            c1222iE = new C1222iE(i, AbstractC2025uS.e(e(), d + 1, i), AbstractC2025uS.l(interfaceC2114vp, f(), true), this);
        }
        if (this.m || this.c) {
            return c1222iE;
        }
        int d2 = d();
        synchronized (obj) {
            int i2 = AbstractC2025uS.d;
            AbstractC2025uS.d = i2 + 1;
            q(i2);
            AbstractC2025uS.c = AbstractC2025uS.c.n(d());
        }
        r(AbstractC2025uS.e(e(), d2 + 1, d()));
        return c1222iE;
    }

    public final void u() {
        z(d());
        if (this.m || this.c) {
            return;
        }
        int d = d();
        synchronized (AbstractC2025uS.b) {
            int i = AbstractC2025uS.d;
            AbstractC2025uS.d = i + 1;
            q(i);
            AbstractC2025uS.c = AbstractC2025uS.c.n(d());
        }
        r(AbstractC2025uS.e(e(), d + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[LOOP:1: B:31:0x00bd->B:32:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:37:0x00ce, B:39:0x00de, B:42:0x00ea, B:44:0x00f6, B:46:0x0100, B:48:0x0106, B:50:0x0114, B:56:0x0125, B:59:0x012f, B:61:0x0139, B:63:0x0143, B:65:0x0149, B:67:0x0153, B:73:0x015b, B:75:0x015e, B:77:0x0162, B:79:0x0169, B:81:0x0175, B:87:0x011c), top: B:36:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:37:0x00ce, B:39:0x00de, B:42:0x00ea, B:44:0x00f6, B:46:0x0100, B:48:0x0106, B:50:0x0114, B:56:0x0125, B:59:0x012f, B:61:0x0139, B:63:0x0143, B:65:0x0149, B:67:0x0153, B:73:0x015b, B:75:0x015e, B:77:0x0162, B:79:0x0169, B:81:0x0175, B:87:0x011c), top: B:36:0x00ce }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0772bO v() {
        HashMap hashMap;
        QD qd;
        C1318jk c1318jk;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        QD w = w();
        if (w != null) {
            AtomicReference atomicReference = AbstractC2025uS.i;
            hashMap = AbstractC2025uS.c((SD) atomicReference.get(), this, AbstractC2025uS.c.k(((C0201Hq) atomicReference.get()).b));
        } else {
            hashMap = null;
        }
        C1318jk c1318jk2 = C1318jk.h;
        synchronized (AbstractC2025uS.b) {
            try {
                AbstractC2025uS.d(this);
                if (w != null && w.d != 0) {
                    C0201Hq c0201Hq = (C0201Hq) AbstractC2025uS.i.get();
                    AbstractC0772bO y = y(AbstractC2025uS.d, hashMap, AbstractC2025uS.c.k(c0201Hq.b));
                    if (!y.equals(C1827rS.i)) {
                        return y;
                    }
                    b();
                    AbstractC2025uS.t(c0201Hq, RP.w);
                    qd = c0201Hq.h;
                    A(null);
                    c0201Hq.h = null;
                    c1318jk = AbstractC2025uS.g;
                    this.m = true;
                    if (qd != null) {
                        YP yp = new YP(qd);
                        if (!qd.g()) {
                            int size2 = c1318jk.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((InterfaceC2312yp) c1318jk.get(i2)).invoke(yp, this);
                            }
                        }
                    }
                    if (w != null && w.h()) {
                        YP yp2 = new YP(w);
                        size = c1318jk.size();
                        for (i = 0; i < size; i++) {
                            ((InterfaceC2312yp) c1318jk.get(i)).invoke(yp2, this);
                        }
                    }
                    synchronized (AbstractC2025uS.b) {
                        try {
                            o();
                            AbstractC2025uS.g();
                            if (qd != null) {
                                Object[] objArr = qd.b;
                                long[] jArr = qd.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j3 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j3 & 255) < 128) {
                                                    AbstractC2025uS.p((GT) objArr[(i3 << 3) + i5]);
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (w != null) {
                                        Object[] objArr2 = w.b;
                                        long[] jArr2 = w.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j4 = jArr2[i6];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j4 & j2) < j) {
                                                            AbstractC2025uS.p((GT) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j4 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            AbstractC2025uS.p((GT) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (w != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return C1827rS.i;
                }
                b();
                C0201Hq c0201Hq2 = (C0201Hq) AbstractC2025uS.i.get();
                AbstractC2025uS.t(c0201Hq2, RP.w);
                qd = c0201Hq2.h;
                if (qd == null || !qd.h()) {
                    qd = null;
                    c1318jk = c1318jk2;
                } else {
                    c1318jk = AbstractC2025uS.g;
                }
                this.m = true;
                if (qd != null) {
                }
                if (w != null) {
                    YP yp22 = new YP(w);
                    size = c1318jk.size();
                    while (i < size) {
                    }
                }
                synchronized (AbstractC2025uS.b) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public QD w() {
        return this.h;
    }

    @Override // o.AbstractC1696pS
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public InterfaceC2114vp f() {
        return this.e;
    }

    public final AbstractC0772bO y(int i, HashMap hashMap, C1959tS c1959tS) {
        C1959tS c1959tS2;
        Object[] objArr;
        long[] jArr;
        C1959tS c1959tS3;
        Object[] objArr2;
        long[] jArr2;
        int i2;
        HT q;
        HT d;
        C1959tS m = e().n(d()).m(this.j);
        QD w = w();
        AbstractC0048Bt.k(w);
        Object[] objArr3 = w.b;
        long[] jArr3 = w.a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            GT gt = (GT) objArr3[(i3 << 3) + i6];
                            i2 = i4;
                            HT b = gt.b();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            HT q2 = AbstractC2025uS.q(b, i, c1959tS);
                            if (q2 == null || (q = AbstractC2025uS.q(b, d(), m)) == null) {
                                c1959tS3 = m;
                            } else {
                                c1959tS3 = m;
                                if (q.a != 1 && !q2.equals(q)) {
                                    HT q3 = AbstractC2025uS.q(b, d(), e());
                                    if (q3 == null) {
                                        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                    }
                                    if (hashMap == null || (d = (HT) hashMap.get(q2)) == null) {
                                        d = gt.d(q, q2, q3);
                                    }
                                    if (d == null) {
                                        return new C1762qS();
                                    }
                                    if (!d.equals(q3)) {
                                        if (d.equals(q2)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(new C1619oH(gt, q2.b()));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(gt);
                                            arrayList = arrayList4;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!d.equals(q) ? new C1619oH(gt, d) : new C1619oH(gt, q.b()));
                                        }
                                    }
                                }
                            }
                            arrayList = arrayList3;
                        } else {
                            c1959tS3 = m;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i2 = i4;
                        }
                        j >>= i2;
                        i6++;
                        i4 = i2;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        m = c1959tS3;
                    }
                    c1959tS2 = m;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    c1959tS2 = m;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr3 = objArr;
                jArr3 = jArr;
                m = c1959tS2;
            }
        }
        if (arrayList != null) {
            u();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1619oH c1619oH = (C1619oH) arrayList.get(i7);
                GT gt2 = (GT) c1619oH.h;
                HT ht = (HT) c1619oH.i;
                ht.a = d();
                synchronized (AbstractC2025uS.b) {
                    ht.b = gt2.b();
                    gt2.e(ht);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                w.j((GT) arrayList2.get(i8));
            }
            ArrayList arrayList5 = this.i;
            if (arrayList5 != null) {
                arrayList2 = AbstractC0720ac.A0(arrayList5, arrayList2);
            }
            this.i = arrayList2;
        }
        return C1827rS.i;
    }

    public final void z(int i) {
        synchronized (AbstractC2025uS.b) {
            this.j = this.j.n(i);
        }
    }
}
