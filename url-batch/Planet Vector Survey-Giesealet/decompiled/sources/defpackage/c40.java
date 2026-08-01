package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c40 implements sl {
    public boolean d;
    public long e = 9223372034707292159L;
    public long f = 0;
    public final /* synthetic */ f40 g;

    public c40(f40 f40Var) {
        this.g = f40Var;
    }

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return y6.h(f / this.g.a(), this);
    }

    @Override // defpackage.sl
    public final float a() {
        return this.g.a();
    }

    public final void b(nw nwVar, float f) {
        f40 f40Var = this.g;
        km0 km0Var = f40Var.p;
        if (km0Var == null) {
            km0Var = new km0();
            f40Var.p = km0Var;
        }
        int b0 = p8.b0(km0Var.b, nwVar);
        if (b0 >= 0) {
            float[] fArr = km0Var.c;
            if (fArr[b0] != f) {
                fArr[b0] = f;
                km0Var.d[b0] = 1;
                return;
            } else {
                byte[] bArr = km0Var.d;
                if (bArr[b0] == 2) {
                    bArr[b0] = 0;
                    return;
                }
                return;
            }
        }
        int i = km0Var.a;
        nw[] nwVarArr = km0Var.b;
        if (i == nwVarArr.length) {
            int i2 = i * 2;
            km0Var.b = (nw[]) Arrays.copyOf(nwVarArr, i2);
            km0Var.c = Arrays.copyOf(km0Var.c, i2);
            km0Var.d = Arrays.copyOf(km0Var.d, i2);
        }
        km0Var.b[i] = nwVar;
        km0Var.d[i] = 3;
        km0Var.c[i] = f;
        km0Var.a++;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.g.h();
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return this.g.a() * f;
    }

    @Override // defpackage.sl
    public final /* synthetic */ float t(long j) {
        return y6.e(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
