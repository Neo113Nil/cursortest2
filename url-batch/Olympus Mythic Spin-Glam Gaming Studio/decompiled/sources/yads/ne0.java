package yads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class ne0 implements ba2 {
    public final aa2 a;
    public final long b;
    public final long c;
    public final k43 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public ne0(k43 k43Var, long j, long j2, long j3, long j4, boolean z) {
        if (j < 0 || j2 <= j) {
            throw new IllegalArgumentException();
        }
        this.d = k43Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new aa2();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    @Override // yads.ba2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(pd0 pd0Var) {
        long j;
        long j2;
        int i = this.e;
        if (i == 0) {
            long j3 = pd0Var.d;
            this.g = j3;
            this.e = 1;
            long j4 = this.c - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j5 = this.i;
                long j6 = this.j;
                if (j5 != j6) {
                    long j7 = pd0Var.d;
                    if (this.a.a(pd0Var, j6)) {
                        this.a.a(pd0Var, false);
                        pd0Var.f = 0;
                        long j8 = this.h;
                        aa2 aa2Var = this.a;
                        long j9 = aa2Var.b;
                        long j10 = j8 - j9;
                        int i2 = aa2Var.d + aa2Var.e;
                        if (0 > j10 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.j = j7;
                                this.l = j9;
                            } else {
                                this.i = pd0Var.d + i2;
                                this.k = j9;
                            }
                            long j11 = this.j;
                            long j12 = this.i;
                            long j13 = j11 - j12;
                            if (j13 < 100000) {
                                this.j = j12;
                                j = j12;
                            } else {
                                long j14 = pd0Var.d - (i2 * (j10 <= 0 ? 2L : 1L));
                                int i3 = sb3.a;
                                j = Math.max(j12, Math.min(((j13 * j10) / (this.l - this.k)) + j14, j11 - 1));
                            }
                            j2 = -1;
                            if (j != j2) {
                            }
                        }
                    } else {
                        j = this.i;
                        if (j == j7) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j2 = -1;
                        if (j != j2) {
                            return j;
                        }
                        this.e = 3;
                    }
                }
                j = -1;
                j2 = -1;
                if (j != j2) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j2 = -1;
            }
            while (true) {
                this.a.a(pd0Var, j2);
                this.a.a(pd0Var, false);
                aa2 aa2Var2 = this.a;
                if (aa2Var2.b > this.h) {
                    pd0Var.f = 0;
                    this.e = 4;
                    return -(this.k + 2);
                }
                pd0Var.a(aa2Var2.d + aa2Var2.e);
                this.i = pd0Var.d;
                this.k = this.a.b;
                j2 = -1;
            }
        }
        aa2 aa2Var3 = this.a;
        aa2Var3.a = 0;
        aa2Var3.b = 0L;
        aa2Var3.c = 0;
        aa2Var3.d = 0;
        aa2Var3.e = 0;
        if (!aa2Var3.a(pd0Var, -1L)) {
            throw new EOFException();
        }
        this.a.a(pd0Var, false);
        aa2 aa2Var4 = this.a;
        pd0Var.a(aa2Var4.d + aa2Var4.e);
        long j15 = this.a.b;
        while (true) {
            aa2 aa2Var5 = this.a;
            if ((aa2Var5.a & 4) == 4 || !aa2Var5.a(pd0Var, -1L) || pd0Var.d >= this.c || !this.a.a(pd0Var, true)) {
                break;
            }
            aa2 aa2Var6 = this.a;
            try {
                pd0Var.a(aa2Var6.d + aa2Var6.e);
                j15 = this.a.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j15;
        this.e = 4;
        return this.g;
    }

    @Override // yads.ba2
    public final mx2 a() {
        if (this.f != 0) {
            return new me0(this);
        }
        return null;
    }

    @Override // yads.ba2
    public final void a(long j) {
        long j2 = this.f - 1;
        int i = sb3.a;
        this.h = Math.max(0L, Math.min(j, j2));
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
