package D1;

import K1.p;
import l.C0265n;
import x1.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265a;

    /* renamed from: b, reason: collision with root package name */
    public long f266b;

    /* renamed from: c, reason: collision with root package name */
    public Object f267c;

    public a(p pVar) {
        this.f265a = 0;
        i1.f.e(pVar, "source");
        this.f267c = pVar;
        this.f266b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f266b &= ~(1 << i);
            return;
        }
        a aVar = (a) this.f267c;
        if (aVar != null) {
            aVar.a(i - 64);
        }
    }

    public int b(int i) {
        a aVar = (a) this.f267c;
        if (aVar == null) {
            return i >= 64 ? Long.bitCount(this.f266b) : Long.bitCount(this.f266b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f266b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f266b) + aVar.b(i - 64);
    }

    public void c() {
        if (((a) this.f267c) == null) {
            this.f267c = new a();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f266b & (1 << i)) != 0;
        }
        c();
        return ((a) this.f267c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((a) this.f267c).e(i - 64, z2);
            return;
        }
        long j2 = this.f266b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f266b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((a) this.f267c) != null) {
            c();
            ((a) this.f267c).e(0, z3);
        }
    }

    public j f() {
        C0265n c0265n = new C0265n(5);
        while (true) {
            String G2 = ((p) this.f267c).G(this.f266b);
            this.f266b -= G2.length();
            if (G2.length() == 0) {
                return c0265n.i();
            }
            int P2 = p1.d.P(G2, ':', 1, false, 4);
            if (P2 != -1) {
                String substring = G2.substring(0, P2);
                i1.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = G2.substring(P2 + 1);
                i1.f.d(substring2, "this as java.lang.String).substring(startIndex)");
                c0265n.h(substring, substring2);
            } else if (G2.charAt(0) == ':') {
                String substring3 = G2.substring(1);
                i1.f.d(substring3, "this as java.lang.String).substring(startIndex)");
                c0265n.h("", substring3);
            } else {
                c0265n.h("", G2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((a) this.f267c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f266b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f266b = j4;
        long j5 = j2 - 1;
        this.f266b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        a aVar = (a) this.f267c;
        if (aVar != null) {
            if (aVar.d(0)) {
                i(63);
            }
            ((a) this.f267c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f266b = 0L;
        a aVar = (a) this.f267c;
        if (aVar != null) {
            aVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f266b |= 1 << i;
        } else {
            c();
            ((a) this.f267c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f265a) {
            case 1:
                if (((a) this.f267c) == null) {
                    return Long.toBinaryString(this.f266b);
                }
                return ((a) this.f267c).toString() + "xx" + Long.toBinaryString(this.f266b);
            default:
                return super.toString();
        }
    }

    public a() {
        this.f265a = 1;
        this.f266b = 0L;
    }
}
