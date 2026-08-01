package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e10 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public e10 f;
    public e10 g;

    public e10(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final e10 a() {
        e10 e10Var = this.f;
        if (e10Var == this) {
            e10Var = null;
        }
        e10 e10Var2 = this.g;
        e10Var2.getClass();
        e10Var2.f = this.f;
        e10 e10Var3 = this.f;
        e10Var3.getClass();
        e10Var3.g = this.g;
        this.f = null;
        this.g = null;
        return e10Var;
    }

    public final void b(e10 e10Var) {
        e10Var.getClass();
        e10Var.g = this;
        e10Var.f = this.f;
        e10 e10Var2 = this.f;
        e10Var2.getClass();
        e10Var2.g = e10Var;
        this.f = e10Var;
    }

    public final e10 c() {
        this.d = true;
        return new e10(this.a, this.b, this.c, true);
    }

    public final void d(e10 e10Var, int i) {
        e10Var.getClass();
        byte[] bArr = e10Var.a;
        if (!e10Var.e) {
            l8.u("only owner can write");
            return;
        }
        int i2 = e10Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (e10Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = e10Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            o6.n0(bArr, bArr, 0, i4, i2);
            e10Var.c -= e10Var.b;
            e10Var.b = 0;
        }
        int i5 = e10Var.c;
        int i6 = this.b;
        o6.n0(this.a, bArr, i5, i6, i6 + i);
        e10Var.c += i;
        this.b += i;
    }

    public e10() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
