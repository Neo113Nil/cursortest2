package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ab extends ko {
    public final dl g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final l41 o;
    public final p53 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public xn u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(x73 x73Var, int[] iArr, dl dlVar, long j, long j2, long j3, l41 l41Var) {
        super(x73Var, iArr);
        p53 p53Var = tv.a;
        if (j3 < j) {
            gh1.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = dlVar;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = l41.a(l41Var);
        this.p = p53Var;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    @Override // yads.ko, yads.xo0
    public final void a() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // yads.ko, yads.xo0
    public final void b() {
        this.u = null;
    }

    @Override // yads.xo0
    public final int e() {
        return this.s;
    }

    @Override // yads.xo0
    public final int f() {
        return this.r;
    }

    @Override // yads.xo0
    public final Object h() {
        return null;
    }

    @Override // yads.ko, yads.xo0
    public final void a(float f) {
        this.q = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, long j2, long j3, List list, sj1[] sj1VarArr) {
        long j4;
        long a;
        long b;
        int i;
        long min;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = this.r;
        if (i2 < sj1VarArr.length && sj1VarArr[i2].next()) {
            sj1 sj1Var = sj1VarArr[this.r];
            a = sj1Var.a();
            b = sj1Var.b();
        } else {
            for (sj1 sj1Var2 : sj1VarArr) {
                if (sj1Var2.next()) {
                    a = sj1Var2.a();
                    b = sj1Var2.b();
                }
            }
            if (!list.isEmpty()) {
                xn xnVar = (xn) pc1.a(list);
                long j5 = xnVar.g;
                if (j5 != -9223372036854775807L) {
                    long j6 = xnVar.h;
                    if (j6 != -9223372036854775807L) {
                        j4 = j6 - j5;
                        i = this.s;
                        if (i == 0) {
                            this.s = 1;
                            this.r = a(elapsedRealtime);
                            return;
                        }
                        int i3 = this.r;
                        int a2 = list.isEmpty() ? -1 : a(((xn) pc1.a(list)).d);
                        if (a2 != -1) {
                            i = ((xn) pc1.a(list)).e;
                            i3 = a2;
                        }
                        int a3 = a(elapsedRealtime);
                        if (!b(i3, elapsedRealtime)) {
                            jw0[] jw0VarArr = this.d;
                            jw0 jw0Var = jw0VarArr[i3];
                            jw0 jw0Var2 = jw0VarArr[a3];
                            if (j3 == -9223372036854775807L) {
                                min = this.h;
                            } else {
                                if (j4 != -9223372036854775807L) {
                                    j3 -= j4;
                                }
                                min = Math.min((long) (j3 * this.n), this.h);
                            }
                            int i4 = jw0Var2.i;
                            int i5 = jw0Var.i;
                            if ((i4 > i5 && j2 < min) || (i4 < i5 && j2 >= this.i)) {
                                a3 = i3;
                            }
                        }
                        if (a3 != i3) {
                            i = 3;
                        }
                        this.s = i;
                        this.r = a3;
                        return;
                    }
                }
            }
            j4 = -9223372036854775807L;
            i = this.s;
            if (i == 0) {
            }
        }
        j4 = a - b;
        i = this.s;
        if (i == 0) {
        }
    }

    @Override // yads.ko, yads.xo0
    public final int a(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((xn) pc1.a(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (xn) pc1.a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long j3 = ((xn) list.get(size - 1)).g - j;
        float f = this.q;
        int i3 = sb3.a;
        if (f != 1.0f) {
            j3 = Math.round(j3 / f);
        }
        long j4 = this.j;
        if (j3 < j4) {
            return size;
        }
        if (!list.isEmpty()) {
            long j5 = ((xn) pc1.a(list)).g;
        }
        jw0 jw0Var = this.d[a(elapsedRealtime)];
        for (int i4 = 0; i4 < size; i4++) {
            xn xnVar = (xn) list.get(i4);
            jw0 jw0Var2 = xnVar.d;
            long j6 = xnVar.g - j;
            float f2 = this.q;
            if (f2 != 1.0f) {
                j6 = Math.round(j6 / f2);
            }
            if (j6 >= j4 && jw0Var2.i < jw0Var.i && (i = jw0Var2.s) != -1 && i <= this.l && (i2 = jw0Var2.r) != -1 && i2 <= this.k && i < jw0Var.s) {
                return i4;
            }
        }
        return size;
    }

    public final int a(long j) {
        long j2;
        tc0 tc0Var = (tc0) this.g;
        synchronized (tc0Var) {
            j2 = tc0Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((ya) this.o.get(i)).a < j4) {
                i++;
            }
            ya yaVar = (ya) this.o.get(i - 1);
            ya yaVar2 = (ya) this.o.get(i);
            long j5 = yaVar.a;
            long j6 = yaVar.b;
            j4 = j6 + ((long) (((j4 - j5) / (yaVar2.a - j5)) * (yaVar2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !b(i3, j)) {
                if (a(i3).i <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            h41 h41Var = (h41) arrayList.get(i);
            if (h41Var != null) {
                h41Var.a(new ya(j, jArr[i]));
            }
        }
    }
}
