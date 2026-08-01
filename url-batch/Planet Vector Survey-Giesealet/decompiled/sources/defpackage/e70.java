package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class e70 extends or0 {
    public static final int[] n = new int[0];
    public final mu e;
    public final mu f;
    public int g;
    public b70 h;
    public ArrayList i;
    public sr0 j;
    public int[] k;
    public int l;
    public boolean m;

    public e70(long j, sr0 sr0Var, mu muVar, mu muVar2) {
        super(j, sr0Var);
        this.e = muVar;
        this.f = muVar2;
        this.j = sr0.h;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (ur0.c) {
            this.j = this.j.e(j);
        }
    }

    public final void B(sr0 sr0Var) {
        synchronized (ur0.c) {
            this.j = this.j.d(sr0Var);
        }
    }

    public void C(b70 b70Var) {
        this.h = b70Var;
    }

    public e70 D(mu muVar, mu muVar2) {
        s90 s90Var;
        if (this.c) {
            gh0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            gh0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ur0.c;
        synchronized (obj) {
            long j = ur0.e;
            ur0.e = j + 1;
            ur0.d = ur0.d.e(j);
            sr0 d = d();
            r(d.e(j));
            s90Var = new s90(j, ur0.e(d, g() + 1, j), ur0.l(muVar, e(), true), ur0.b(muVar2, i()), this);
        }
        if (this.m || this.c) {
            return s90Var;
        }
        long g = g();
        synchronized (obj) {
            long j2 = ur0.e;
            ur0.e = j2 + 1;
            s(j2);
            ur0.d = ur0.d.e(g());
        }
        r(ur0.e(d(), g + 1, g()));
        return s90Var;
    }

    @Override // defpackage.or0
    public final void b() {
        ur0.d = ur0.d.b(g()).a(this.j);
    }

    @Override // defpackage.or0
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (ur0.c) {
            o();
        }
        l();
    }

    @Override // defpackage.or0
    public boolean f() {
        return false;
    }

    @Override // defpackage.or0
    public int h() {
        return this.g;
    }

    @Override // defpackage.or0
    public mu i() {
        return this.f;
    }

    @Override // defpackage.or0
    public void k() {
        this.l++;
    }

    @Override // defpackage.or0
    public void l() {
        if (this.l <= 0) {
            gh0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        b70 x = x();
        if (x != null) {
            if (this.m) {
                gh0.b("Unsupported operation on a snapshot that has been applied");
            }
            C(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (jt0 a = ((ht0) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                    long j2 = a.a;
                                    if (j2 == g || zd.b0(this.j, Long.valueOf(j2))) {
                                        tn0 tn0Var = ur0.a;
                                        a.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.or0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.or0
    public void n(ht0 ht0Var) {
        b70 x = x();
        if (x == null) {
            int i = wn0.a;
            x = new b70();
            C(x);
        }
        x.a(ht0Var);
    }

    @Override // defpackage.or0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            ur0.v(this.k[i]);
        }
        o();
    }

    @Override // defpackage.or0
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.or0
    public or0 u(mu muVar) {
        t90 t90Var;
        if (this.c) {
            gh0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            gh0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = ur0.c;
        synchronized (obj) {
            long j = ur0.e;
            ur0.e = j + 1;
            ur0.d = ur0.d.e(j);
            t90Var = new t90(j, ur0.e(d(), g + 1, j), ur0.l(muVar, e(), true), this);
        }
        if (this.m || this.c) {
            return t90Var;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = ur0.e;
            ur0.e = j2 + 1;
            s(j2);
            ur0.d = ur0.d.e(g());
        }
        r(ur0.e(d(), g2 + 1, g()));
        return t90Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (ur0.c) {
            long j = ur0.e;
            ur0.e = j + 1;
            s(j);
            ur0.d = ur0.d.e(g());
        }
        r(ur0.e(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ld0 w() {
        HashMap hashMap;
        List list;
        b70 b70Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        b70 x = x();
        if (x != null) {
            long j3 = ur0.j.b;
            hashMap = ur0.c(j3, this, ur0.d.b(j3));
        } else {
            hashMap = null;
        }
        wp wpVar = wp.d;
        synchronized (ur0.c) {
            try {
                ur0.d(this);
                if (x != null && x.d != 0) {
                    jv jvVar = ur0.j;
                    ld0 z = z(ur0.e, x, hashMap, ur0.d.b(jvVar.b));
                    if (!z.equals(qr0.a)) {
                        return z;
                    }
                    b();
                    b70Var = jvVar.h;
                    ur0.w(jvVar, ur0.a);
                    C(null);
                    jvVar.h = null;
                    list = ur0.h;
                    this.m = true;
                    if (b70Var != null) {
                        xn0 xn0Var = new xn0(b70Var);
                        if (!b70Var.g()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((qu) list.get(i2)).invoke(xn0Var, this);
                            }
                        }
                    }
                    if (x != null && x.h()) {
                        xn0 xn0Var2 = new xn0(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((qu) list.get(i)).invoke(xn0Var2, this);
                        }
                    }
                    synchronized (ur0.c) {
                        try {
                            p();
                            ur0.g();
                            if (b70Var != null) {
                                Object[] objArr = b70Var.b;
                                long[] jArr = b70Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    ur0.r((ht0) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
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
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            ur0.r((ht0) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
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
                                            ur0.r((ht0) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return qr0.a;
                }
                b();
                jv jvVar2 = ur0.j;
                b70 b70Var2 = jvVar2.h;
                ur0.w(jvVar2, ur0.a);
                if (b70Var2 == null || !b70Var2.h()) {
                    list = wpVar;
                    b70Var = null;
                } else {
                    list = ur0.h;
                    b70Var = b70Var2;
                }
                this.m = true;
                if (b70Var != null) {
                }
                if (x != null) {
                    xn0 xn0Var22 = new xn0(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (ur0.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b70 x() {
        return this.h;
    }

    @Override // defpackage.or0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public mu e() {
        return this.e;
    }

    public final ld0 z(long j, b70 b70Var, HashMap hashMap, sr0 sr0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        sr0 sr0Var2;
        Object[] objArr;
        long[] jArr;
        sr0 sr0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        jt0 b;
        sr0 d = d().e(g()).d(this.j);
        Object[] objArr3 = b70Var.b;
        long[] jArr3 = b70Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ht0 ht0Var = (ht0) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            jt0 a = ht0Var.a();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            jt0 t = ur0.t(a, j, sr0Var);
                            if (t == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                jt0 t2 = ur0.t(a, g(), d);
                                if (t2 != null && t2.a != 1 && !t.equals(t2)) {
                                    sr0Var3 = d;
                                    jt0 t3 = ur0.t(a, g(), d());
                                    if (t3 == null) {
                                        ur0.s();
                                        throw null;
                                    }
                                    if (hashMap == null || (b = (jt0) hashMap.get(t)) == null) {
                                        b = ht0Var.b(t2, t, t3);
                                    }
                                    if (b == null) {
                                        return new pr0();
                                    }
                                    if (!b.equals(t3)) {
                                        if (b.equals(t)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new pd0(ht0Var, t.b(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(ht0Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!b.equals(t2) ? new pd0(ht0Var, b) : new pd0(ht0Var, t2.b(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            sr0Var3 = d;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            sr0Var3 = d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d = sr0Var3;
                    }
                    sr0Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    sr0Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                d = sr0Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                pd0 pd0Var = (pd0) arrayList3.get(i5);
                ht0 ht0Var2 = (ht0) pd0Var.d;
                jt0 jt0Var = (jt0) pd0Var.e;
                jt0Var.a = j;
                synchronized (ur0.c) {
                    jt0Var.b = ht0Var2.a();
                    ht0Var2.c(jt0Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                b70Var.k((ht0) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = zd.l0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return qr0.a;
    }
}
