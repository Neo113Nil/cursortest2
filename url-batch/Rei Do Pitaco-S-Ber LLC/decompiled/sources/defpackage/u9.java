package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class u9 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public u9(o8 o8Var) {
        this.a = 1;
        o8Var.getClass();
        this.c = o8Var;
        this.b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        u9 u9Var = (u9) this.c;
        if (u9Var != null) {
            u9Var.a(i - 64);
        }
    }

    public int b(int i) {
        u9 u9Var = (u9) this.c;
        if (u9Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + u9Var.b(i - 64);
    }

    public void c() {
        if (((u9) this.c) == null) {
            this.c = new u9();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((u9) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((u9) this.c).e(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            i(i);
        } else {
            a(i);
        }
        if (z2 || ((u9) this.c) != null) {
            c();
            ((u9) this.c).e(0, z2);
        }
    }

    public nm f() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String f = ((o8) this.c).f(this.b);
            this.b -= f.length();
            if (f.length() == 0) {
                return new nm((String[]) arrayList.toArray(new String[0]));
            }
            int q0 = m30.q0(f, ':', 1, 4);
            if (q0 != -1) {
                String substring = f.substring(0, q0);
                String substring2 = f.substring(q0 + 1);
                arrayList.add(substring);
                arrayList.add(m30.x0(substring2).toString());
            } else if (f.charAt(0) == ':') {
                String substring3 = f.substring(1);
                arrayList.add("");
                arrayList.add(m30.x0(substring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(m30.x0(f).toString());
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((u9) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        u9 u9Var = (u9) this.c;
        if (u9Var != null) {
            if (u9Var.d(0)) {
                i(63);
            }
            ((u9) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        u9 u9Var = (u9) this.c;
        if (u9Var != null) {
            u9Var.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((u9) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((u9) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((u9) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public u9() {
        this.a = 0;
        this.b = 0L;
    }
}
