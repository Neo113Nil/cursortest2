package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class jn implements q30 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public v30 d;

    public jn(boolean z) {
        this.a = z;
    }

    @Override // yads.q30
    public final void a(h93 h93Var) {
        h93Var.getClass();
        if (this.b.contains(h93Var)) {
            return;
        }
        this.b.add(h93Var);
        this.c++;
    }

    public final void b(v30 v30Var) {
        this.d = v30Var;
        for (int i = 0; i < this.c; i++) {
            h93 h93Var = (h93) this.b.get(i);
            boolean z = this.a;
            tc0 tc0Var = (tc0) h93Var;
            synchronized (tc0Var) {
                try {
                    um2 um2Var = tc0.n;
                    if (z && (v30Var.i & 8) != 8) {
                        if (tc0Var.f == 0) {
                            tc0Var.d.getClass();
                            tc0Var.g = SystemClock.elapsedRealtime();
                        }
                        tc0Var.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(int i) {
        v30 v30Var = this.d;
        int i2 = sb3.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            h93 h93Var = (h93) this.b.get(i3);
            boolean z = this.a;
            tc0 tc0Var = (tc0) h93Var;
            synchronized (tc0Var) {
                um2 um2Var = tc0.n;
                if (z && (v30Var.i & 8) != 8) {
                    tc0Var.h += i;
                }
            }
        }
    }

    public final void g() {
        int i;
        k13 k13Var;
        float f;
        v30 v30Var = this.d;
        int i2 = sb3.a;
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.c) {
            h93 h93Var = (h93) this.b.get(i4);
            boolean z = this.a;
            tc0 tc0Var = (tc0) h93Var;
            synchronized (tc0Var) {
                try {
                    um2 um2Var = tc0.n;
                    if (!z || (v30Var.i & 8) == 8) {
                        i = i4;
                    } else {
                        if (tc0Var.f <= 0) {
                            throw new IllegalStateException();
                        }
                        tc0Var.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i5 = (int) (elapsedRealtime - tc0Var.g);
                        tc0Var.j += i5;
                        long j = tc0Var.k;
                        long j2 = tc0Var.h;
                        tc0Var.k = j + j2;
                        if (i5 > 0) {
                            float f2 = (j2 * 8000.0f) / i5;
                            l13 l13Var = tc0Var.c;
                            int sqrt = (int) Math.sqrt(j2);
                            if (l13Var.d != 1) {
                                Collections.sort(l13Var.b, l13.h);
                                l13Var.d = 1;
                            }
                            int i6 = l13Var.g;
                            if (i6 > 0) {
                                k13[] k13VarArr = l13Var.c;
                                int i7 = i6 - 1;
                                l13Var.g = i7;
                                k13Var = k13VarArr[i7];
                            } else {
                                k13Var = new k13();
                            }
                            int i8 = l13Var.e;
                            l13Var.e = i8 + 1;
                            k13Var.a = i8;
                            k13Var.b = sqrt;
                            k13Var.c = f2;
                            l13Var.b.add(k13Var);
                            l13Var.f += sqrt;
                            while (true) {
                                int i9 = l13Var.f;
                                int i10 = l13Var.a;
                                if (i9 <= i10) {
                                    break;
                                }
                                int i11 = i9 - i10;
                                k13 k13Var2 = (k13) l13Var.b.get(i3);
                                int i12 = k13Var2.b;
                                if (i12 <= i11) {
                                    l13Var.f -= i12;
                                    l13Var.b.remove(i3);
                                    int i13 = l13Var.g;
                                    if (i13 < 5) {
                                        k13[] k13VarArr2 = l13Var.c;
                                        l13Var.g = i13 + 1;
                                        k13VarArr2[i13] = k13Var2;
                                    }
                                } else {
                                    k13Var2.b = i12 - i11;
                                    l13Var.f -= i11;
                                }
                            }
                            if (tc0Var.j >= 2000 || tc0Var.k >= 524288) {
                                l13 l13Var2 = tc0Var.c;
                                if (l13Var2.d != 0) {
                                    Collections.sort(l13Var2.b, l13.i);
                                    l13Var2.d = i3;
                                }
                                float f3 = 0.5f * l13Var2.f;
                                int i14 = i3;
                                int i15 = i14;
                                while (true) {
                                    if (i14 < l13Var2.b.size()) {
                                        k13 k13Var3 = (k13) l13Var2.b.get(i14);
                                        i15 += k13Var3.b;
                                        if (i15 >= f3) {
                                            f = k13Var3.c;
                                            break;
                                        }
                                        i14++;
                                    } else if (l13Var2.b.isEmpty()) {
                                        f = Float.NaN;
                                    } else {
                                        ArrayList arrayList = l13Var2.b;
                                        f = ((k13) arrayList.get(arrayList.size() - 1)).c;
                                    }
                                }
                                tc0Var.l = (long) f;
                            }
                            long j3 = tc0Var.h;
                            long j4 = tc0Var.l;
                            if (i5 == 0 && j3 == 0) {
                                i = i4;
                                if (j4 == tc0Var.m) {
                                    tc0Var.g = elapsedRealtime;
                                    tc0Var.h = 0L;
                                }
                            } else {
                                i = i4;
                            }
                            tc0Var.m = j4;
                            tc0Var.b.a(i5, j3, j4);
                            tc0Var.g = elapsedRealtime;
                            tc0Var.h = 0L;
                        } else {
                            i = i4;
                        }
                        tc0Var.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i4 = i + 1;
            i3 = 0;
        }
        this.d = null;
    }

    public final void h() {
        for (int i = 0; i < this.c; i++) {
            ((h93) this.b.get(i)).getClass();
        }
    }
}
