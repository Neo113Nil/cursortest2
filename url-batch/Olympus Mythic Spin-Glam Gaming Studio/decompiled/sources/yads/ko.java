package yads;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ko implements xo0 {
    public final x73 a;
    public final int b;
    public final int[] c;
    public final jw0[] d;
    public final long[] e;
    public int f;

    public ko(x73 x73Var, int[] iArr) {
        if (iArr.length <= 0) {
            throw new IllegalStateException();
        }
        x73Var.getClass();
        this.a = x73Var;
        int length = iArr.length;
        this.b = length;
        this.d = new jw0[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = x73Var.e[iArr[i]];
        }
        Arrays.sort(this.d, new Comparator() { // from class: yads.ko$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ko.a((jw0) obj, (jw0) obj2);
            }
        });
        this.c = new int[this.b];
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i2 >= i3) {
                this.e = new long[i3];
                return;
            }
            int[] iArr2 = this.c;
            jw0 jw0Var = this.d[i2];
            int i4 = 0;
            while (true) {
                jw0[] jw0VarArr = x73Var.e;
                if (i4 >= jw0VarArr.length) {
                    i4 = -1;
                    break;
                } else if (jw0Var == jw0VarArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    public static /* synthetic */ int a(jw0 jw0Var, jw0 jw0Var2) {
        return jw0Var2.i - jw0Var.i;
    }

    @Override // yads.xo0
    public void a() {
    }

    @Override // yads.xo0
    public void a(float f) {
    }

    @Override // yads.xo0
    public final int b(int i) {
        return this.c[i];
    }

    @Override // yads.xo0
    public void b() {
    }

    @Override // yads.xo0
    public final x73 c() {
        return this.a;
    }

    @Override // yads.xo0
    public final jw0 d() {
        return this.d[f()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ko koVar = (ko) obj;
        return this.a == koVar.a && Arrays.equals(this.c, koVar.c);
    }

    @Override // yads.xo0
    public final int g() {
        return this.c.length;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // yads.xo0
    public final jw0 a(int i) {
        return this.d[i];
    }

    @Override // yads.xo0
    public final int c(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // yads.xo0
    public final int a(jw0 jw0Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == jw0Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // yads.xo0
    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    @Override // yads.xo0
    public int a(long j, List list) {
        return list.size();
    }

    @Override // yads.xo0
    public final boolean a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !b) {
            b = (i2 == i || b(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = sb3.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }
}
