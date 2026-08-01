package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2034a;

    /* renamed from: b, reason: collision with root package name */
    public long f2035b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2036c;

    public C0086b(v1.p pVar) {
        this.f2034a = 1;
        X0.d.e(pVar, "source");
        this.f2036c = pVar;
        this.f2035b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2035b &= ~(1 << i);
            return;
        }
        C0086b c0086b = (C0086b) this.f2036c;
        if (c0086b != null) {
            c0086b.a(i - 64);
        }
    }

    public int b(int i) {
        C0086b c0086b = (C0086b) this.f2036c;
        if (c0086b == null) {
            return i >= 64 ? Long.bitCount(this.f2035b) : Long.bitCount(this.f2035b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2035b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2035b) + c0086b.b(i - 64);
    }

    public void c() {
        if (((C0086b) this.f2036c) == null) {
            this.f2036c = new C0086b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2035b & (1 << i)) != 0;
        }
        c();
        return ((C0086b) this.f2036c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0086b) this.f2036c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2035b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2035b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0086b) this.f2036c) != null) {
            c();
            ((C0086b) this.f2036c).e(0, z3);
        }
    }

    public i1.k f() {
        B0.d dVar = new B0.d(26);
        while (true) {
            String m2 = ((v1.p) this.f2036c).m(this.f2035b);
            this.f2035b -= m2.length();
            if (m2.length() == 0) {
                return dVar.t();
            }
            int n02 = e1.d.n0(m2, ':', 1, false, 4);
            if (n02 != -1) {
                String substring = m2.substring(0, n02);
                X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = m2.substring(n02 + 1);
                X0.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                dVar.s(substring, substring2);
            } else if (m2.charAt(0) == ':') {
                String substring3 = m2.substring(1);
                X0.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                dVar.s("", substring3);
            } else {
                dVar.s("", m2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0086b) this.f2036c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2035b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2035b = j4;
        long j5 = j2 - 1;
        this.f2035b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0086b c0086b = (C0086b) this.f2036c;
        if (c0086b != null) {
            if (c0086b.d(0)) {
                i(63);
            }
            ((C0086b) this.f2036c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2035b = 0L;
        C0086b c0086b = (C0086b) this.f2036c;
        if (c0086b != null) {
            c0086b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2035b |= 1 << i;
        } else {
            c();
            ((C0086b) this.f2036c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2034a) {
            case 0:
                if (((C0086b) this.f2036c) == null) {
                    return Long.toBinaryString(this.f2035b);
                }
                return ((C0086b) this.f2036c).toString() + "xx" + Long.toBinaryString(this.f2035b);
            default:
                return super.toString();
        }
    }

    public C0086b() {
        this.f2034a = 0;
        this.f2035b = 0L;
    }
}
