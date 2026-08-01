package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2036a;

    /* renamed from: b, reason: collision with root package name */
    public long f2037b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2038c;

    public C0098b(v1.p pVar) {
        this.f2036a = 1;
        X0.d.e(pVar, "source");
        this.f2038c = pVar;
        this.f2037b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2037b &= ~(1 << i);
            return;
        }
        C0098b c0098b = (C0098b) this.f2038c;
        if (c0098b != null) {
            c0098b.a(i - 64);
        }
    }

    public int b(int i) {
        C0098b c0098b = (C0098b) this.f2038c;
        if (c0098b == null) {
            return i >= 64 ? Long.bitCount(this.f2037b) : Long.bitCount(this.f2037b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2037b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2037b) + c0098b.b(i - 64);
    }

    public void c() {
        if (((C0098b) this.f2038c) == null) {
            this.f2038c = new C0098b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2037b & (1 << i)) != 0;
        }
        c();
        return ((C0098b) this.f2038c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0098b) this.f2038c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2037b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2037b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0098b) this.f2038c) != null) {
            c();
            ((C0098b) this.f2038c).e(0, z3);
        }
    }

    public i1.l f() {
        C.g gVar = new C.g(26);
        while (true) {
            String m2 = ((v1.p) this.f2038c).m(this.f2037b);
            this.f2037b -= m2.length();
            if (m2.length() == 0) {
                return gVar.t();
            }
            int l02 = e1.d.l0(m2, ':', 1, false, 4);
            if (l02 != -1) {
                String substring = m2.substring(0, l02);
                X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = m2.substring(l02 + 1);
                X0.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                gVar.s(substring, substring2);
            } else if (m2.charAt(0) == ':') {
                String substring3 = m2.substring(1);
                X0.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                gVar.s("", substring3);
            } else {
                gVar.s("", m2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0098b) this.f2038c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2037b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2037b = j4;
        long j5 = j2 - 1;
        this.f2037b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0098b c0098b = (C0098b) this.f2038c;
        if (c0098b != null) {
            if (c0098b.d(0)) {
                i(63);
            }
            ((C0098b) this.f2038c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2037b = 0L;
        C0098b c0098b = (C0098b) this.f2038c;
        if (c0098b != null) {
            c0098b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2037b |= 1 << i;
        } else {
            c();
            ((C0098b) this.f2038c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2036a) {
            case 0:
                if (((C0098b) this.f2038c) == null) {
                    return Long.toBinaryString(this.f2037b);
                }
                return ((C0098b) this.f2038c).toString() + "xx" + Long.toBinaryString(this.f2037b);
            default:
                return super.toString();
        }
    }

    public C0098b() {
        this.f2036a = 0;
        this.f2037b = 0L;
    }
}
