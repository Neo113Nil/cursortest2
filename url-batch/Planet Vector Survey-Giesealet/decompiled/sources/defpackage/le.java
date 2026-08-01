package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class le {
    public static final lt0 a = new lt0(t3.o);
    public static final lt0 b = new lt0(t3.p);

    public static final long a(ke keVar, long j) {
        long j2 = keVar.a;
        long j3 = keVar.q;
        if (ge.c(j, j2)) {
            return keVar.b;
        }
        if (ge.c(j, keVar.f)) {
            return keVar.g;
        }
        if (ge.c(j, keVar.j)) {
            return keVar.k;
        }
        if (ge.c(j, keVar.n)) {
            return keVar.o;
        }
        if (ge.c(j, keVar.w)) {
            return keVar.x;
        }
        if (ge.c(j, keVar.c)) {
            return keVar.d;
        }
        if (ge.c(j, keVar.h)) {
            return keVar.i;
        }
        if (ge.c(j, keVar.l)) {
            return keVar.m;
        }
        if (ge.c(j, keVar.y)) {
            return keVar.z;
        }
        if (ge.c(j, keVar.u)) {
            return keVar.v;
        }
        if (ge.c(j, keVar.p)) {
            return j3;
        }
        if (ge.c(j, keVar.r)) {
            return keVar.s;
        }
        if (ge.c(j, keVar.D)) {
            return j3;
        }
        if (ge.c(j, keVar.F)) {
            return j3;
        }
        if (ge.c(j, keVar.G)) {
            return j3;
        }
        if (ge.c(j, keVar.H)) {
            return j3;
        }
        if (ge.c(j, keVar.I)) {
            return j3;
        }
        if (ge.c(j, keVar.J)) {
            return j3;
        }
        int i = ge.h;
        return ge.g;
    }

    public static final long b(long j, ih ihVar) {
        qh qhVar = (qh) ihVar;
        qhVar.V(-1680936624);
        long a2 = a((ke) qhVar.j(a), j);
        if (a2 == 16) {
            a2 = ((ge) qhVar.j(aj.a)).a;
        }
        qhVar.q(false);
        return a2;
    }

    public static final long c(ke keVar, int i) {
        switch (y6.D(i)) {
            case 0:
                return keVar.n;
            case 1:
                return keVar.w;
            case 2:
                return keVar.y;
            case 3:
                return keVar.v;
            case 4:
                return keVar.e;
            case 5:
                return keVar.u;
            case 6:
                return keVar.o;
            case 7:
                return keVar.x;
            case 8:
                return keVar.z;
            case 9:
                return keVar.b;
            case 10:
                return keVar.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return ge.g;
            case 13:
                return keVar.g;
            case 14:
                return keVar.i;
            case 17:
                return keVar.q;
            case 18:
                return keVar.s;
            case 19:
                return keVar.k;
            case 20:
                return keVar.m;
            case 23:
                return keVar.A;
            case 24:
                return keVar.B;
            case 25:
                return keVar.a;
            case 26:
                return keVar.c;
            case 29:
                return keVar.C;
            case 30:
                return keVar.f;
            case 31:
                return keVar.h;
            case 34:
                return keVar.p;
            case 35:
                return keVar.D;
            case 36:
                return keVar.F;
            case 37:
                return keVar.G;
            case 38:
                return keVar.H;
            case 39:
                return keVar.I;
            case 40:
                return keVar.J;
            case 41:
                return keVar.E;
            case 42:
                return keVar.t;
            case 43:
                return keVar.r;
            case 44:
                return keVar.j;
            case 45:
                return keVar.l;
        }
    }

    public static ke d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i) {
        long j12 = (i & 1) != 0 ? ie.t : j;
        return new ke(j12, (i & 2) != 0 ? ie.j : j2, ie.u, ie.k, ie.e, (i & 32) != 0 ? ie.w : j3, (i & 64) != 0 ? ie.l : j4, ie.x, ie.m, (i & 512) != 0 ? ie.H : j5, (i & 1024) != 0 ? ie.p : j6, ie.I, ie.q, (i & 8192) != 0 ? ie.a : j7, (i & 16384) != 0 ? ie.g : j8, (32768 & i) != 0 ? ie.y : j9, (65536 & i) != 0 ? ie.n : j10, ie.G, ie.o, j12, ie.f, ie.d, (i & 4194304) != 0 ? ie.b : j11, ie.h, ie.c, ie.i, ie.r, ie.s, ie.v, ie.z, ie.F, ie.A, ie.B, ie.C, ie.D, ie.E);
    }
}
