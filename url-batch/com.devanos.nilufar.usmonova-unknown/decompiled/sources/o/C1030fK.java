package o;

import com.google.firebase.database.core.ValidationPath;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.fK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030fK extends AbstractC1917sq {
    public static final C1030fK Q;
    public static final C2120vv R = new C2120vv(8);
    public List A;
    public List B;
    public int C;
    public int D;
    public MK E;
    public int F;
    public List G;
    public int H;
    public List I;
    public List J;
    public int K;
    public SK L;
    public List M;
    public ZK N;
    public byte O;
    public int P;
    public final AbstractC1281j9 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public List f164o;
    public List p;
    public int q;
    public List r;
    public int s;
    public List t;
    public List u;
    public int v;
    public List w;
    public List x;
    public List y;
    public List z;

    static {
        C1030fK c1030fK = new C1030fK();
        Q = c1030fK;
        c1030fK.p();
    }

    public C1030fK(C0899dK c0899dK) {
        super(c0899dK);
        this.q = -1;
        this.s = -1;
        this.v = -1;
        this.C = -1;
        this.H = -1;
        this.K = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.i = c0899dK.h;
    }

    @Override // o.EC
    public final E a() {
        return Q;
    }

    @Override // o.EC
    public final boolean b() {
        byte b = this.O;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.j & 2) != 2) {
            this.O = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.n.size(); i++) {
            if (!((RK) this.n.get(i)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f164o.size(); i2++) {
            if (!((MK) this.f164o.get(i2)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            if (!((MK) this.t.get(i3)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.w.size(); i4++) {
            if (!((C1162hK) this.w.get(i4)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.x.size(); i5++) {
            if (!((C2017uK) this.x.get(i5)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.y.size(); i6++) {
            if (!((CK) this.y.get(i6)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.z.size(); i7++) {
            if (!((OK) this.z.get(i7)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.A.size(); i8++) {
            if (!((C1688pK) this.A.get(i8)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if ((this.j & 16) == 16 && !this.E.b()) {
            this.O = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.I.size(); i9++) {
            if (!((MK) this.I.get(i9)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if ((this.j & 64) == 64 && !this.L.b()) {
            this.O = (byte) 0;
            return false;
        }
        if (i()) {
            this.O = (byte) 1;
            return true;
        }
        this.O = (byte) 0;
        return false;
    }

    @Override // o.E
    public final int c() {
        int i = this.P;
        if (i != -1) {
            return i;
        }
        int c = (this.j & 1) == 1 ? M5.c(1, this.k) : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            i2 += M5.d(((Integer) this.p.get(i3)).intValue());
        }
        int i4 = c + i2;
        if (!this.p.isEmpty()) {
            i4 = i4 + 1 + M5.d(i2);
        }
        this.q = i2;
        if ((this.j & 2) == 2) {
            i4 += M5.c(3, this.l);
        }
        if ((this.j & 4) == 4) {
            i4 += M5.c(4, this.m);
        }
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            i4 += M5.e(5, (E) this.n.get(i5));
        }
        for (int i6 = 0; i6 < this.f164o.size(); i6++) {
            i4 += M5.e(6, (E) this.f164o.get(i6));
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.r.size(); i8++) {
            i7 += M5.d(((Integer) this.r.get(i8)).intValue());
        }
        int i9 = i4 + i7;
        if (!this.r.isEmpty()) {
            i9 = i9 + 1 + M5.d(i7);
        }
        this.s = i7;
        for (int i10 = 0; i10 < this.w.size(); i10++) {
            i9 += M5.e(8, (E) this.w.get(i10));
        }
        for (int i11 = 0; i11 < this.x.size(); i11++) {
            i9 += M5.e(9, (E) this.x.get(i11));
        }
        for (int i12 = 0; i12 < this.y.size(); i12++) {
            i9 += M5.e(10, (E) this.y.get(i12));
        }
        for (int i13 = 0; i13 < this.z.size(); i13++) {
            i9 += M5.e(11, (E) this.z.get(i13));
        }
        for (int i14 = 0; i14 < this.A.size(); i14++) {
            i9 += M5.e(13, (E) this.A.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.B.size(); i16++) {
            i15 += M5.d(((Integer) this.B.get(i16)).intValue());
        }
        int i17 = i9 + i15;
        if (!this.B.isEmpty()) {
            i17 = i17 + 2 + M5.d(i15);
        }
        this.C = i15;
        if ((this.j & 8) == 8) {
            i17 += M5.c(17, this.D);
        }
        if ((this.j & 16) == 16) {
            i17 += M5.e(18, this.E);
        }
        if ((this.j & 32) == 32) {
            i17 += M5.c(19, this.F);
        }
        for (int i18 = 0; i18 < this.t.size(); i18++) {
            i17 += M5.e(20, (E) this.t.get(i18));
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.u.size(); i20++) {
            i19 += M5.d(((Integer) this.u.get(i20)).intValue());
        }
        int i21 = i17 + i19;
        if (!this.u.isEmpty()) {
            i21 = i21 + 2 + M5.d(i19);
        }
        this.v = i19;
        int i22 = 0;
        for (int i23 = 0; i23 < this.G.size(); i23++) {
            i22 += M5.d(((Integer) this.G.get(i23)).intValue());
        }
        int i24 = i21 + i22;
        if (!this.G.isEmpty()) {
            i24 = i24 + 2 + M5.d(i22);
        }
        this.H = i22;
        for (int i25 = 0; i25 < this.I.size(); i25++) {
            i24 += M5.e(23, (E) this.I.get(i25));
        }
        int i26 = 0;
        for (int i27 = 0; i27 < this.J.size(); i27++) {
            i26 += M5.d(((Integer) this.J.get(i27)).intValue());
        }
        int i28 = i24 + i26;
        if (!this.J.isEmpty()) {
            i28 = i28 + 2 + M5.d(i26);
        }
        this.K = i26;
        if ((this.j & 64) == 64) {
            i28 += M5.e(30, this.L);
        }
        int i29 = 0;
        for (int i30 = 0; i30 < this.M.size(); i30++) {
            i29 += M5.d(((Integer) this.M.get(i30)).intValue());
        }
        int size = (this.M.size() * 2) + i28 + i29;
        if ((this.j & 128) == 128) {
            size += M5.e(32, this.N);
        }
        int size2 = this.i.size() + j() + size;
        this.P = size2;
        return size2;
    }

    @Override // o.E
    public final AbstractC1654oq d() {
        return C0899dK.h();
    }

    @Override // o.E
    public final AbstractC1654oq e() {
        C0899dK h = C0899dK.h();
        h.i(this);
        return h;
    }

    @Override // o.E
    public final void f(M5 m5) {
        c();
        C2002u5 c2002u5 = new C2002u5(this);
        if ((this.j & 1) == 1) {
            m5.u(1, this.k);
        }
        if (this.p.size() > 0) {
            m5.D(18);
            m5.D(this.q);
        }
        for (int i = 0; i < this.p.size(); i++) {
            m5.v(((Integer) this.p.get(i)).intValue());
        }
        if ((this.j & 2) == 2) {
            m5.u(3, this.l);
        }
        if ((this.j & 4) == 4) {
            m5.u(4, this.m);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            m5.w(5, (E) this.n.get(i2));
        }
        for (int i3 = 0; i3 < this.f164o.size(); i3++) {
            m5.w(6, (E) this.f164o.get(i3));
        }
        if (this.r.size() > 0) {
            m5.D(58);
            m5.D(this.s);
        }
        for (int i4 = 0; i4 < this.r.size(); i4++) {
            m5.v(((Integer) this.r.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.w.size(); i5++) {
            m5.w(8, (E) this.w.get(i5));
        }
        for (int i6 = 0; i6 < this.x.size(); i6++) {
            m5.w(9, (E) this.x.get(i6));
        }
        for (int i7 = 0; i7 < this.y.size(); i7++) {
            m5.w(10, (E) this.y.get(i7));
        }
        for (int i8 = 0; i8 < this.z.size(); i8++) {
            m5.w(11, (E) this.z.get(i8));
        }
        for (int i9 = 0; i9 < this.A.size(); i9++) {
            m5.w(13, (E) this.A.get(i9));
        }
        if (this.B.size() > 0) {
            m5.D(130);
            m5.D(this.C);
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            m5.v(((Integer) this.B.get(i10)).intValue());
        }
        if ((this.j & 8) == 8) {
            m5.u(17, this.D);
        }
        if ((this.j & 16) == 16) {
            m5.w(18, this.E);
        }
        if ((this.j & 32) == 32) {
            m5.u(19, this.F);
        }
        for (int i11 = 0; i11 < this.t.size(); i11++) {
            m5.w(20, (E) this.t.get(i11));
        }
        if (this.u.size() > 0) {
            m5.D(170);
            m5.D(this.v);
        }
        for (int i12 = 0; i12 < this.u.size(); i12++) {
            m5.v(((Integer) this.u.get(i12)).intValue());
        }
        if (this.G.size() > 0) {
            m5.D(178);
            m5.D(this.H);
        }
        for (int i13 = 0; i13 < this.G.size(); i13++) {
            m5.v(((Integer) this.G.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.I.size(); i14++) {
            m5.w(23, (E) this.I.get(i14));
        }
        if (this.J.size() > 0) {
            m5.D(194);
            m5.D(this.K);
        }
        for (int i15 = 0; i15 < this.J.size(); i15++) {
            m5.v(((Integer) this.J.get(i15)).intValue());
        }
        if ((this.j & 64) == 64) {
            m5.w(30, this.L);
        }
        for (int i16 = 0; i16 < this.M.size(); i16++) {
            m5.u(31, ((Integer) this.M.get(i16)).intValue());
        }
        if ((this.j & 128) == 128) {
            m5.w(32, this.N);
        }
        c2002u5.g0(19000, m5);
        m5.z(this.i);
    }

    public final void p() {
        this.k = 6;
        this.l = 0;
        this.m = 0;
        List list = Collections.EMPTY_LIST;
        this.n = list;
        this.f164o = list;
        this.p = list;
        this.r = list;
        this.t = list;
        this.u = list;
        this.w = list;
        this.x = list;
        this.y = list;
        this.z = list;
        this.A = list;
        this.B = list;
        this.D = 0;
        this.E = MK.A;
        this.F = 0;
        this.G = list;
        this.I = list;
        this.J = list;
        this.L = SK.n;
        this.M = list;
        this.N = ZK.l;
    }

    public C1030fK() {
        this.q = -1;
        this.s = -1;
        this.v = -1;
        this.C = -1;
        this.H = -1;
        this.K = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.i = AbstractC1281j9.h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public C1030fK(C0523Ub c0523Ub, C1649ol c1649ol) {
        this.q = -1;
        this.s = -1;
        this.v = -1;
        this.C = -1;
        this.H = -1;
        this.K = -1;
        this.O = (byte) -1;
        this.P = -1;
        p();
        C1217i9 q = AbstractC1281j9.q();
        boolean z = true;
        M5 o2 = M5.o(q, 1);
        boolean z2 = false;
        char c = 0;
        while (true) {
            boolean z3 = z;
            if (!z2) {
                try {
                    try {
                        int n = c0523Ub.n();
                        switch (n) {
                            case 0:
                                z2 = z3;
                                z = z3;
                                c = c;
                            case 8:
                                this.j |= 1;
                                this.k = c0523Ub.f();
                                z = z3;
                                c = c;
                            case 16:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.p = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.p.add(Integer.valueOf(c0523Ub.f()));
                                z = z3;
                                c = c;
                            case 18:
                                int d = c0523Ub.d(c0523Ub.k());
                                int i2 = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i2 != 32) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.p = new ArrayList();
                                        c = (c == true ? 1 : 0) | ' ';
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.p.add(Integer.valueOf(c0523Ub.f()));
                                }
                                c0523Ub.c(d);
                                z = z3;
                                c = c;
                            case 24:
                                this.j |= 2;
                                this.l = c0523Ub.f();
                                z = z3;
                                c = c;
                            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                this.j |= 4;
                                this.m = c0523Ub.f();
                                z = z3;
                                c = c;
                            case 42:
                                int i3 = (c == true ? 1 : 0) & 8;
                                c = c;
                                if (i3 != 8) {
                                    this.n = new ArrayList();
                                    c = (c == true ? 1 : 0) | '\b';
                                }
                                this.n.add(c0523Ub.g(RK.u, c1649ol));
                                z = z3;
                                c = c;
                            case 50:
                                int i4 = (c == true ? 1 : 0) & 16;
                                c = c;
                                if (i4 != 16) {
                                    this.f164o = new ArrayList();
                                    c = (c == true ? 1 : 0) | 16;
                                }
                                this.f164o.add(c0523Ub.g(MK.B, c1649ol));
                                z = z3;
                                c = c;
                            case 56:
                                int i5 = (c == true ? 1 : 0) & 64;
                                c = c;
                                if (i5 != 64) {
                                    this.r = new ArrayList();
                                    c = (c == true ? 1 : 0) | '@';
                                }
                                this.r.add(Integer.valueOf(c0523Ub.f()));
                                z = z3;
                                c = c;
                            case 58:
                                int d2 = c0523Ub.d(c0523Ub.k());
                                int i6 = (c == true ? 1 : 0) & 64;
                                c = c;
                                if (i6 != 64) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.r = new ArrayList();
                                        c = (c == true ? 1 : 0) | '@';
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.r.add(Integer.valueOf(c0523Ub.f()));
                                }
                                c0523Ub.c(d2);
                                z = z3;
                                c = c;
                            case 66:
                                int i7 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i7 != 512) {
                                    this.w = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.w.add(c0523Ub.g(C1162hK.q, c1649ol));
                                z = z3;
                                c = c;
                            case 74:
                                int i8 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i8 != 1024) {
                                    this.x = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.x.add(c0523Ub.g(C2017uK.C, c1649ol));
                                z = z3;
                                c = c;
                            case 82:
                                int i9 = (c == true ? 1 : 0) & 2048;
                                c = c;
                                if (i9 != 2048) {
                                    this.y = new ArrayList();
                                    c = (c == true ? 1 : 0) | 2048;
                                }
                                this.y.add(c0523Ub.g(CK.C, c1649ol));
                                z = z3;
                                c = c;
                            case 90:
                                int i10 = (c == true ? 1 : 0) & 4096;
                                c = c;
                                if (i10 != 4096) {
                                    this.z = new ArrayList();
                                    c = (c == true ? 1 : 0) | 4096;
                                }
                                this.z.add(c0523Ub.g(OK.w, c1649ol));
                                z = z3;
                                c = c;
                            case 106:
                                int i11 = (c == true ? 1 : 0) & 8192;
                                c = c;
                                if (i11 != 8192) {
                                    this.A = new ArrayList();
                                    c = (c == true ? 1 : 0) | 8192;
                                }
                                this.A.add(c0523Ub.g(C1688pK.f210o, c1649ol));
                                z = z3;
                                c = c;
                            case 128:
                                int i12 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i12 != 16384) {
                                    this.B = new ArrayList();
                                    c = (c == true ? 1 : 0) | 16384;
                                }
                                this.B.add(Integer.valueOf(c0523Ub.f()));
                                z = z3;
                                c = c;
                            case 130:
                                int d3 = c0523Ub.d(c0523Ub.k());
                                int i13 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i13 != 16384) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.B = new ArrayList();
                                        c = (c == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.B.add(Integer.valueOf(c0523Ub.f()));
                                }
                                c0523Ub.c(d3);
                                z = z3;
                                c = c;
                            case 136:
                                this.j |= 8;
                                this.D = c0523Ub.f();
                                z = z3;
                                c = c;
                            case 146:
                                LK e = (this.j & 16) == 16 ? this.E.e() : null;
                                MK mk = (MK) c0523Ub.g(MK.B, c1649ol);
                                this.E = mk;
                                if (e != null) {
                                    e.i(mk);
                                    this.E = e.g();
                                }
                                this.j |= 16;
                                z = z3;
                                c = c;
                            case 152:
                                this.j |= 32;
                                this.F = c0523Ub.f();
                                z = z3;
                                c = c;
                            case 162:
                                int i14 = (c == true ? 1 : 0) & 128;
                                c = c;
                                if (i14 != 128) {
                                    this.t = new ArrayList();
                                    c = (c == true ? 1 : 0) | 128;
                                }
                                this.t.add(c0523Ub.g(MK.B, c1649ol));
                                z = z3;
                                c = c;
                            case 168:
                                int i15 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i15 != 256) {
                                    this.u = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.u.add(Integer.valueOf(c0523Ub.f()));
                                z = z3;
                                c = c;
                            case 170:
                                int d4 = c0523Ub.d(c0523Ub.k());
                                int i16 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i16 != 256) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.u = new ArrayList();
                                        c = (c == true ? 1 : 0) | 256;
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.u.add(Integer.valueOf(c0523Ub.f()));
                                }
                                c0523Ub.c(d4);
                                z = z3;
                                c = c;
                            case 176:
                                int i17 = (c == true ? 1 : 0) & 262144;
                                c = c;
                                if (i17 != 262144) {
                                    this.G = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.G.add(Integer.valueOf(c0523Ub.f()));
                                z = z3;
                                c = c;
                            case 178:
                                int d5 = c0523Ub.d(c0523Ub.k());
                                int i18 = (c == true ? 1 : 0) & 262144;
                                c = c;
                                if (i18 != 262144) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.G = new ArrayList();
                                        c = (c == true ? 1 : 0) | 0;
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.G.add(Integer.valueOf(c0523Ub.f()));
                                }
                                c0523Ub.c(d5);
                                z = z3;
                                c = c;
                            case 186:
                                int i19 = (c == true ? 1 : 0) & 524288;
                                c = c;
                                if (i19 != 524288) {
                                    this.I = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.I.add(c0523Ub.g(MK.B, c1649ol));
                                z = z3;
                                c = c;
                            case 192:
                                int i20 = (c == true ? 1 : 0) & 1048576;
                                c = c;
                                if (i20 != 1048576) {
                                    this.J = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.J.add(Integer.valueOf(c0523Ub.f()));
                                z = z3;
                                c = c;
                            case 194:
                                int d6 = c0523Ub.d(c0523Ub.k());
                                int i21 = (c == true ? 1 : 0) & 1048576;
                                c = c;
                                if (i21 != 1048576) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.J = new ArrayList();
                                        c = (c == true ? 1 : 0) | 0;
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.J.add(Integer.valueOf(c0523Ub.f()));
                                }
                                c0523Ub.c(d6);
                                z = z3;
                                c = c;
                            case 242:
                                C0768bK j = (this.j & 64) == 64 ? this.L.j() : null;
                                SK sk = (SK) c0523Ub.g(SK.f105o, c1649ol);
                                this.L = sk;
                                if (j != null) {
                                    j.l(sk);
                                    this.L = j.h();
                                }
                                this.j |= 64;
                                z = z3;
                                c = c;
                            case 248:
                                int i22 = (c == true ? 1 : 0) & 4194304;
                                c = c;
                                if (i22 != 4194304) {
                                    this.M = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.M.add(Integer.valueOf(c0523Ub.f()));
                                z = z3;
                                c = c;
                            case 250:
                                int d7 = c0523Ub.d(c0523Ub.k());
                                int i23 = (c == true ? 1 : 0) & 4194304;
                                c = c;
                                if (i23 != 4194304) {
                                    c = c;
                                    if (c0523Ub.b() > 0) {
                                        this.M = new ArrayList();
                                        c = (c == true ? 1 : 0) | 0;
                                    }
                                }
                                while (c0523Ub.b() > 0) {
                                    this.M.add(Integer.valueOf(c0523Ub.f()));
                                }
                                c0523Ub.c(d7);
                                z = z3;
                                c = c;
                            case 258:
                                try {
                                    C1228iK i24 = (this.j & 128) == 128 ? this.N.i() : null;
                                    ZK zk = (ZK) c0523Ub.g(ZK.m, c1649ol);
                                    this.N = zk;
                                    if (i24 != null) {
                                        i24.m(zk);
                                        this.N = i24.i();
                                    }
                                    this.j |= 128;
                                    z = z3;
                                    c = c;
                                } catch (C0204Ht e2) {
                                    e = e2;
                                    e.h = this;
                                    throw e;
                                } catch (IOException e3) {
                                    e = e3;
                                    C0204Ht c0204Ht = new C0204Ht(e.getMessage());
                                    c0204Ht.h = this;
                                    throw c0204Ht;
                                } catch (Throwable th) {
                                    th = th;
                                    if (((c == true ? 1 : 0) & 32) == 32) {
                                        this.p = Collections.unmodifiableList(this.p);
                                    }
                                    if (((c == true ? 1 : 0) & 8) == 8) {
                                        this.n = Collections.unmodifiableList(this.n);
                                    }
                                    if (((c == true ? 1 : 0) & 16) == 16) {
                                        this.f164o = Collections.unmodifiableList(this.f164o);
                                    }
                                    if (((c == true ? 1 : 0) & 64) == 64) {
                                        this.r = Collections.unmodifiableList(this.r);
                                    }
                                    if (((c == true ? 1 : 0) & 512) == 512) {
                                        this.w = Collections.unmodifiableList(this.w);
                                    }
                                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                                        this.x = Collections.unmodifiableList(this.x);
                                    }
                                    if (((c == true ? 1 : 0) & 2048) == 2048) {
                                        this.y = Collections.unmodifiableList(this.y);
                                    }
                                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                                        this.z = Collections.unmodifiableList(this.z);
                                    }
                                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                                        this.A = Collections.unmodifiableList(this.A);
                                    }
                                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                                        this.B = Collections.unmodifiableList(this.B);
                                    }
                                    if (((c == true ? 1 : 0) & 128) == 128) {
                                        this.t = Collections.unmodifiableList(this.t);
                                    }
                                    if (((c == true ? 1 : 0) & 256) == 256) {
                                        this.u = Collections.unmodifiableList(this.u);
                                    }
                                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                                        this.G = Collections.unmodifiableList(this.G);
                                    }
                                    if (((c == true ? 1 : 0) & 524288) == 524288) {
                                        this.I = Collections.unmodifiableList(this.I);
                                    }
                                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                                        this.J = Collections.unmodifiableList(this.J);
                                    }
                                    if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                                        this.M = Collections.unmodifiableList(this.M);
                                    }
                                    try {
                                        o2.j();
                                    } catch (IOException unused) {
                                    } catch (Throwable th2) {
                                        this.i = q.j();
                                        throw th2;
                                    }
                                    this.i = q.j();
                                    m();
                                    throw th;
                                }
                            default:
                                if (n(c0523Ub, o2, c1649ol, n)) {
                                    z = z3;
                                    c = c;
                                }
                                z2 = z3;
                                z = z3;
                                c = c;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (C0204Ht e4) {
                    e = e4;
                } catch (IOException e5) {
                    e = e5;
                }
            } else {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (((c == true ? 1 : 0) & 8) == 8) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (((c == true ? 1 : 0) & 16) == 16) {
                    this.f164o = Collections.unmodifiableList(this.f164o);
                }
                if (((c == true ? 1 : 0) & 64) == 64) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.w = Collections.unmodifiableList(this.w);
                }
                if (((c == true ? 1 : 0) & 1024) == 1024) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                if (((c == true ? 1 : 0) & 2048) == 2048) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if (((c == true ? 1 : 0) & 4096) == 4096) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if (((c == true ? 1 : 0) & 8192) == 8192) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                if (((c == true ? 1 : 0) & 16384) == 16384) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if (((c == true ? 1 : 0) & 128) == 128) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if (((c == true ? 1 : 0) & 262144) == 262144) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if (((c == true ? 1 : 0) & 524288) == 524288) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                    this.J = Collections.unmodifiableList(this.J);
                }
                if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                try {
                    o2.j();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.i = q.j();
                    throw th4;
                }
                this.i = q.j();
                m();
                return;
            }
        }
    }
}
