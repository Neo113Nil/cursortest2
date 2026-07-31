package yads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class xs2 implements c83 {
    public jw0 A;
    public jw0 B;
    public boolean C;
    public boolean D;
    public long E;
    public final us2 a;
    public final cl0 d;
    public final yk0 e;
    public ik2 f;
    public jw0 g;
    public um0 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final vs2 b = new vs2();
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public b83[] o = new b83[1000];
    public final q23 c = new q23(new dz() { // from class: yads.xs2$$ExternalSyntheticLambda0
        @Override // yads.dz
        public final void accept(Object obj) {
            ((ws2) obj).b.release();
        }
    });
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public xs2(ub0 ub0Var, cl0 cl0Var, yk0 yk0Var) {
        this.d = cl0Var;
        this.e = yk0Var;
        this.a = new us2(ub0Var);
    }

    public final void b(boolean z) {
        us2 us2Var = this.a;
        us2Var.a(us2Var.c);
        ts2 ts2Var = us2Var.c;
        if (ts2Var.c != null) {
            throw new IllegalStateException();
        }
        ts2Var.a = 0L;
        ts2Var.b = 65536;
        us2Var.d = ts2Var;
        us2Var.e = ts2Var;
        us2Var.f = 0L;
        us2Var.a.b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        q23 q23Var = this.c;
        for (int i = 0; i < q23Var.b.size(); i++) {
            q23Var.c.accept(q23Var.b.valueAt(i));
        }
        q23Var.a = -1;
        q23Var.b.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized jw0 c() {
        return this.y ? null : this.B;
    }

    public final void d() {
        um0 um0Var = this.h;
        if (um0Var != null) {
            um0Var.b(this.e);
            this.h = null;
            this.g = null;
        }
    }

    public final synchronized void e() {
        this.s = 0;
        us2 us2Var = this.a;
        us2Var.d = us2Var.c;
    }

    public final int a(kw0 kw0Var, fb0 fb0Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        vs2 vs2Var = this.b;
        synchronized (this) {
            try {
                fb0Var.e = false;
                int i3 = this.s;
                i2 = -3;
                if (i3 != this.p) {
                    jw0 jw0Var = ((ws2) this.c.c(this.q + i3)).a;
                    if (!z2 && jw0Var == this.g) {
                        int d = d(this.s);
                        um0 um0Var = this.h;
                        if (um0Var != null && um0Var.c() != 4 && ((this.m[d] & 1073741824) != 0 || !this.h.d())) {
                            fb0Var.e = true;
                        }
                        int i4 = this.m[d];
                        fb0Var.b = i4;
                        long j = this.n[d];
                        fb0Var.f = j;
                        if (j < this.t) {
                            fb0Var.b = i4 | Integer.MIN_VALUE;
                        }
                        vs2Var.a = this.l[d];
                        vs2Var.b = this.k[d];
                        vs2Var.c = this.o[d];
                        i2 = -4;
                    }
                    a(jw0Var, kw0Var);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        jw0 jw0Var2 = this.B;
                        if (jw0Var2 != null && (z2 || jw0Var2 != this.g)) {
                            a(jw0Var2, kw0Var);
                            i2 = -5;
                        }
                    }
                    fb0Var.b = 4;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !fb0Var.b(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    us2 us2Var = this.a;
                    us2.a(us2Var.d, fb0Var, this.b, us2Var.b);
                } else {
                    us2 us2Var2 = this.a;
                    us2Var2.d = us2.a(us2Var2.d, fb0Var, this.b, us2Var2.b);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final synchronized boolean c(long j, boolean z) {
        e();
        int d = d(this.s);
        int i = this.s;
        int i2 = this.p;
        if (i != i2 && j >= this.n[d] && (j <= this.v || z)) {
            int a = a(d, i2 - i, j, true);
            if (a == -1) {
                return false;
            }
            this.t = j;
            this.s += a;
            return true;
        }
        return false;
    }

    public final int d(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final long c(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int d = d(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[d]);
            if ((this.m[d] & 1) != 0) {
                break;
            }
            d--;
            if (d == -1) {
                d = this.i - 1;
            }
        }
        return j;
    }

    public final void b(int i) {
        long j;
        us2 us2Var = this.a;
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        if (i4 >= 0 && i4 <= i3 - this.s) {
            int i5 = i3 - i4;
            this.p = i5;
            this.v = Math.max(this.u, c(i5));
            this.w = i4 == 0 && this.w;
            this.c.a(i);
            int i6 = this.p;
            if (i6 != 0) {
                j = this.k[d(i6 - 1)] + this.l[r8];
            } else {
                j = 0;
            }
            if (j <= us2Var.f) {
                us2Var.f = j;
                if (j != 0) {
                    ts2 ts2Var = us2Var.c;
                    if (j != ts2Var.a) {
                        while (us2Var.f > ts2Var.b) {
                            ts2Var = ts2Var.d;
                        }
                        ts2 ts2Var2 = ts2Var.d;
                        ts2Var2.getClass();
                        us2Var.a(ts2Var2);
                        ts2 ts2Var3 = new ts2(ts2Var.b);
                        ts2Var.d = ts2Var3;
                        if (us2Var.f == ts2Var.b) {
                            ts2Var = ts2Var3;
                        }
                        us2Var.e = ts2Var;
                        if (us2Var.d == ts2Var2) {
                            us2Var.d = ts2Var3;
                            return;
                        }
                        return;
                    }
                }
                us2Var.a(us2Var.c);
                ts2 ts2Var4 = new ts2(us2Var.f);
                us2Var.c = ts2Var4;
                us2Var.d = ts2Var4;
                us2Var.e = ts2Var4;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void a(long j, boolean z) {
        long j2;
        int i;
        us2 us2Var = this.a;
        synchronized (this) {
            try {
                int i2 = this.p;
                j2 = -1;
                if (i2 != 0) {
                    long[] jArr = this.n;
                    int i3 = this.r;
                    if (j >= jArr[i3]) {
                        if (z && (i = this.s) != i2) {
                            i2 = i + 1;
                        }
                        int a = a(i3, i2, j, false);
                        if (a != -1) {
                            j2 = a(a);
                        }
                    }
                }
            } finally {
            }
        }
        us2Var.a(j2);
    }

    public final synchronized long b() {
        return this.v;
    }

    public final synchronized int b(long j, boolean z) {
        int d = d(this.s);
        int i = this.s;
        int i2 = this.p;
        if (i != i2 && j >= this.n[d]) {
            if (j > this.v && z) {
                return i2 - i;
            }
            int a = a(d, i2 - i, j, true);
            if (a == -1) {
                return 0;
            }
            return a;
        }
        return 0;
    }

    public final void a() {
        long a;
        us2 us2Var = this.a;
        synchronized (this) {
            int i = this.p;
            a = i == 0 ? -1L : a(i);
        }
        us2Var.a(a);
    }

    @Override // yads.c83
    public final int a(n30 n30Var, int i, boolean z) {
        us2 us2Var = this.a;
        ts2 ts2Var = us2Var.e;
        if (ts2Var.c == null) {
            id a = us2Var.a.a();
            ts2 ts2Var2 = new ts2(us2Var.e.b);
            ts2Var.c = a;
            ts2Var.d = ts2Var2;
        }
        int min = Math.min(i, (int) (us2Var.e.b - us2Var.f));
        ts2 ts2Var3 = us2Var.e;
        id idVar = ts2Var3.c;
        int c = n30Var.c(idVar.a, ((int) (us2Var.f - ts2Var3.a)) + idVar.b, min);
        if (c == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = us2Var.f + c;
        us2Var.f = j;
        ts2 ts2Var4 = us2Var.e;
        if (j != ts2Var4.b) {
            return c;
        }
        us2Var.e = ts2Var4.d;
        return c;
    }

    @Override // yads.c83
    public final void a(int i, xb2 xb2Var) {
        us2 us2Var = this.a;
        while (i > 0) {
            ts2 ts2Var = us2Var.e;
            if (ts2Var.c == null) {
                id a = us2Var.a.a();
                ts2 ts2Var2 = new ts2(us2Var.e.b);
                ts2Var.c = a;
                ts2Var.d = ts2Var2;
            }
            int min = Math.min(i, (int) (us2Var.e.b - us2Var.f));
            ts2 ts2Var3 = us2Var.e;
            id idVar = ts2Var3.c;
            xb2Var.a(idVar.a, ((int) (us2Var.f - ts2Var3.a)) + idVar.b, min);
            i -= min;
            long j = us2Var.f + min;
            us2Var.f = j;
            ts2 ts2Var4 = us2Var.e;
            if (j == ts2Var4.b) {
                us2Var.e = ts2Var4.d;
            }
        }
        us2Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        if (((yads.ws2) r10.valueAt(r10.size() - 1)).a.equals(r9.B) == false) goto L48;
     */
    @Override // yads.c83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, b83 b83Var) {
        bl0 bl0Var;
        if (this.z) {
            jw0 jw0Var = this.A;
            if (jw0Var == null) {
                throw new IllegalStateException();
            }
            a(jw0Var);
        }
        int i4 = i & 1;
        boolean z = i4 != 0;
        if (this.x) {
            if (!z) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = j + this.E;
        if (this.C) {
            if (j2 < this.t) {
                return;
            }
            if (i4 == 0) {
                if (!this.D) {
                    gh1.d("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.D = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.a.f - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.p;
                if (i5 > 0) {
                    if (this.k[d(i5 - 1)] + this.l[r14] > j3) {
                        throw new IllegalArgumentException();
                    }
                }
                this.w = (536870912 & i) != 0;
                this.v = Math.max(this.v, j2);
                int d = d(this.p);
                this.n[d] = j2;
                this.k[d] = j3;
                this.l[d] = i2;
                this.m[d] = i;
                this.o[d] = b83Var;
                this.j[d] = 0;
                if (this.c.b.size() != 0) {
                    SparseArray sparseArray = this.c.b;
                }
                if (this.d != null) {
                    bl0Var = bl0.a;
                } else {
                    bl0Var = bl0.a;
                }
                q23 q23Var = this.c;
                int i6 = this.q + this.p;
                jw0 jw0Var2 = this.B;
                jw0Var2.getClass();
                ws2 ws2Var = new ws2(jw0Var2, bl0Var);
                if (q23Var.a == -1) {
                    if (q23Var.b.size() == 0) {
                        q23Var.a = 0;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (q23Var.b.size() > 0) {
                    SparseArray sparseArray2 = q23Var.b;
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    if (i6 < keyAt) {
                        throw new IllegalArgumentException();
                    }
                    if (keyAt == i6) {
                        dz dzVar = q23Var.c;
                        SparseArray sparseArray3 = q23Var.b;
                        dzVar.accept(sparseArray3.valueAt(sparseArray3.size() - 1));
                    }
                }
                q23Var.b.append(i6, ws2Var);
                int i7 = this.p + 1;
                this.p = i7;
                int i8 = this.i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    int[] iArr = new int[i9];
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    int[] iArr2 = new int[i9];
                    int[] iArr3 = new int[i9];
                    b83[] b83VarArr = new b83[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr, 0, i11);
                    System.arraycopy(this.n, this.r, jArr2, 0, i11);
                    System.arraycopy(this.m, this.r, iArr2, 0, i11);
                    System.arraycopy(this.l, this.r, iArr3, 0, i11);
                    System.arraycopy(this.o, this.r, b83VarArr, 0, i11);
                    System.arraycopy(this.j, this.r, iArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr, i11, i12);
                    System.arraycopy(this.n, 0, jArr2, i11, i12);
                    System.arraycopy(this.m, 0, iArr2, i11, i12);
                    System.arraycopy(this.l, 0, iArr3, i11, i12);
                    System.arraycopy(this.o, 0, b83VarArr, i11, i12);
                    System.arraycopy(this.j, 0, iArr, i11, i12);
                    this.k = jArr;
                    this.n = jArr2;
                    this.m = iArr2;
                    this.l = iArr3;
                    this.o = b83VarArr;
                    this.j = iArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    @Override // yads.c83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jw0 jw0Var) {
        jw0 jw0Var2;
        String str;
        boolean z;
        ut1 b;
        boolean z2 = true;
        if (this.E == 0 || jw0Var.q == Long.MAX_VALUE) {
            jw0Var2 = jw0Var;
        } else {
            iw0 iw0Var = new iw0(jw0Var);
            iw0Var.o = jw0Var.q + this.E;
            jw0Var2 = new jw0(iw0Var);
        }
        this.z = false;
        this.A = jw0Var;
        synchronized (this) {
            try {
                this.y = false;
                if (sb3.a(jw0Var2, this.B)) {
                    z2 = false;
                } else {
                    if (this.c.b.size() != 0) {
                        SparseArray sparseArray = this.c.b;
                        if (((ws2) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(jw0Var2)) {
                            SparseArray sparseArray2 = this.c.b;
                            this.B = ((ws2) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            jw0 jw0Var3 = this.B;
                            str = jw0Var3.m;
                            String str2 = jw0Var3.j;
                            ArrayList arrayList = vt1.a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        z = true;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null && (b = vt1.b(str2)) != null) {
                                            int i = b.b;
                                            char c = i != 2 ? i != 5 ? i != 29 ? i != 42 ? i != 22 ? i != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                                            if (c != 0 && c != 16) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        break;
                                }
                                this.C = z;
                                this.D = false;
                            }
                            z = false;
                            this.C = z;
                            this.D = false;
                        }
                    }
                    this.B = jw0Var2;
                    jw0 jw0Var32 = this.B;
                    str = jw0Var32.m;
                    String str22 = jw0Var32.j;
                    ArrayList arrayList2 = vt1.a;
                    if (str != null) {
                    }
                    z = false;
                    this.C = z;
                    this.D = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ik2 ik2Var = this.f;
        if (ik2Var == null || !z2) {
            return;
        }
        ik2Var.q.post(ik2Var.o);
    }

    public final synchronized boolean a(boolean z) {
        jw0 jw0Var;
        int i = this.s;
        boolean z2 = false;
        if (i != this.p) {
            if (((ws2) this.c.c(this.q + i)).a != this.g) {
                return true;
            }
            int d = d(this.s);
            um0 um0Var = this.h;
            if (um0Var == null || um0Var.c() == 4 || ((this.m[d] & 1073741824) == 0 && this.h.d())) {
                z2 = true;
            }
            return z2;
        }
        if (z || this.w || ((jw0Var = this.B) != null && jw0Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final void a(jw0 jw0Var, kw0 kw0Var) {
        jw0 jw0Var2;
        jw0 jw0Var3 = this.g;
        boolean z = jw0Var3 == null;
        vk0 vk0Var = z ? null : jw0Var3.p;
        this.g = jw0Var;
        vk0 vk0Var2 = jw0Var.p;
        cl0 cl0Var = this.d;
        if (cl0Var != null) {
            int a = cl0Var.a(jw0Var);
            iw0 iw0Var = new iw0(jw0Var);
            iw0Var.D = a;
            jw0Var2 = new jw0(iw0Var);
        } else {
            jw0Var2 = jw0Var;
        }
        kw0Var.b = jw0Var2;
        kw0Var.a = this.h;
        if (this.d == null) {
            return;
        }
        if (z || !sb3.a(vk0Var, vk0Var2)) {
            um0 um0Var = this.h;
            um0 a2 = this.d.a(this.e, jw0Var);
            this.h = a2;
            kw0Var.a = a2;
            if (um0Var != null) {
                um0Var.b(this.e);
            }
        }
    }

    public final int a(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public final long a(int i) {
        this.u = Math.max(this.u, c(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        if (i5 < 0) {
            this.s = 0;
        }
        this.c.b(i2);
        if (this.p == 0) {
            int i6 = this.r;
            if (i6 == 0) {
                i6 = this.i;
            }
            return this.k[i6 - 1] + this.l[r6];
        }
        return this.k[this.r];
    }
}
