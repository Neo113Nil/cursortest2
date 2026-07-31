package yads;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class zr {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public zc0 e;

    public zr(int i, String str, zc0 zc0Var) {
        this.a = i;
        this.b = str;
        this.e = zc0Var;
    }

    public final long a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        if (j2 < 0) {
            throw new IllegalArgumentException();
        }
        nz2 b = b(j, j2);
        if (!b.e) {
            long j3 = b.d;
            return -Math.min(j3 != -1 ? j3 : Long.MAX_VALUE, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = b.c + b.d;
        if (j6 < j5) {
            for (nz2 nz2Var : this.c.tailSet(b, false)) {
                long j7 = nz2Var.c;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + nz2Var.d);
                if (j6 >= j5) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final nz2 b(long j, long j2) {
        long j3;
        nz2 nz2Var = new nz2(this.b, j, -1L, -9223372036854775807L, null);
        nz2 nz2Var2 = (nz2) this.c.floor(nz2Var);
        if (nz2Var2 != null && nz2Var2.c + nz2Var2.d > j) {
            return nz2Var2;
        }
        nz2 nz2Var3 = (nz2) this.c.ceiling(nz2Var);
        if (nz2Var3 != null) {
            long j4 = nz2Var3.c - j;
            if (j2 == -1) {
                j3 = j4;
                return new nz2(this.b, j, j3, -9223372036854775807L, null);
            }
            j2 = Math.min(j4, j2);
        }
        j3 = j2;
        return new nz2(this.b, j, j3, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            yr yrVar = (yr) this.d.get(i);
            long j3 = yrVar.b;
            if (j3 == -1) {
                if (j >= yrVar.a) {
                    return true;
                }
            } else if (j2 == -1) {
                continue;
            } else {
                long j4 = yrVar.a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zr.class != obj.getClass()) {
            return false;
        }
        zr zrVar = (zr) obj;
        return this.a == zrVar.a && this.b.equals(zrVar.b) && this.c.equals(zrVar.c) && this.e.equals(zrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + c4.a(this.a * 31, 31, this.b);
    }
}
