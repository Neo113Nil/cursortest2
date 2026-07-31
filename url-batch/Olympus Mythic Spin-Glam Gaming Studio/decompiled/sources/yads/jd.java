package yads;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class jd implements tp0 {
    public static final int[] n;
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final int r;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int h;
    public long i;
    public wp0 j;
    public c83 k;
    public mx2 l;
    public boolean m;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        new yp0() { // from class: yads.jd$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return jd.a();
            }
        };
        n = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        o = iArr;
        p = sb3.c("#!AMR\n");
        q = sb3.c("#!AMR-WB\n");
        r = iArr[8];
    }

    public static tp0[] a() {
        return new tp0[]{new jd()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    public final int a(pd0 pd0Var) {
        boolean z;
        pd0Var.f = 0;
        pd0Var.b(this.a, 0, 1, false);
        byte b = this.a[0];
        if ((b & 131) > 0) {
            throw new cc2(gg2.a(b, "Invalid padding bits for frame header "), null, true, 1);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.b) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? o[i] : n[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new cc2(sb.toString(), null, true, 1);
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        pd0 pd0Var = (pd0) up0Var;
        byte[] bArr = p;
        pd0Var.f = 0;
        byte[] bArr2 = new byte[bArr.length];
        pd0Var.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            pd0Var.a(bArr.length);
        } else {
            byte[] bArr3 = q;
            pd0Var.f = 0;
            byte[] bArr4 = new byte[bArr3.length];
            pd0Var.b(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.b = true;
            pd0Var.a(bArr3.length);
        }
        return true;
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.j = wp0Var;
        this.k = wp0Var.a(0, 1);
        wp0Var.a();
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        if (j != 0) {
            mx2 mx2Var = this.l;
            if (mx2Var instanceof cz) {
                cz czVar = (cz) mx2Var;
                this.i = cz.a(czVar.e, j, czVar.b);
                return;
            }
        }
        this.i = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        if (this.k != null) {
            int i = sb3.a;
            pd0 pd0Var = (pd0) up0Var;
            int i2 = 0;
            if (pd0Var.d == 0) {
                byte[] bArr = p;
                pd0Var.f = 0;
                byte[] bArr2 = new byte[bArr.length];
                pd0Var.b(bArr2, 0, bArr.length, false);
                if (Arrays.equals(bArr2, bArr)) {
                    this.b = false;
                    pd0Var.a(bArr.length);
                } else {
                    byte[] bArr3 = q;
                    pd0Var.f = 0;
                    byte[] bArr4 = new byte[bArr3.length];
                    pd0Var.b(bArr4, 0, bArr3.length, false);
                    if (Arrays.equals(bArr4, bArr3)) {
                        this.b = true;
                        pd0Var.a(bArr3.length);
                    } else {
                        throw new cc2("Could not find AMR header.", null, true, 1);
                    }
                }
            }
            if (!this.m) {
                this.m = true;
                boolean z = this.b;
                String str = z ? "audio/amr-wb" : "audio/3gpp";
                int i3 = z ? 16000 : 8000;
                c83 c83Var = this.k;
                iw0 iw0Var = new iw0();
                iw0Var.k = str;
                iw0Var.l = r;
                iw0Var.x = 1;
                iw0Var.y = i3;
                c83Var.a(new jw0(iw0Var));
            }
            if (this.e == 0) {
                try {
                    int a = a((pd0) up0Var);
                    this.d = a;
                    this.e = a;
                    if (this.g == -1) {
                        long j = pd0Var.d;
                        this.g = a;
                    }
                    if (this.g == a) {
                        this.h++;
                    }
                } catch (EOFException unused) {
                }
            }
            int a2 = this.k.a(up0Var, this.e, true);
            if (a2 != -1) {
                int i4 = this.e - a2;
                this.e = i4;
                if (i4 <= 0) {
                    this.k.a(this.c + this.i, 1, this.d, 0, null);
                    this.c += 20000;
                }
                if (!this.f) {
                    lx2 lx2Var = new lx2(-9223372036854775807L, 0L);
                    this.l = lx2Var;
                    this.j.a(lx2Var);
                    this.f = true;
                }
                return i2;
            }
            i2 = -1;
            if (!this.f) {
            }
            return i2;
        }
        throw new IllegalStateException();
    }
}
