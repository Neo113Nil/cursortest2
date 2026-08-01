package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oz0 {
    public final nz0 a;
    public final int b;
    public final kk[] c;
    public int d;
    public final float[] e;
    public final float[] f;
    public final float[] g;

    public oz0() {
        int i;
        nz0 nz0Var = nz0.d;
        this.a = nz0Var;
        int ordinal = nz0Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                g8.c();
                throw null;
            }
            i = 2;
        }
        this.b = i;
        this.c = new kk[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        kk[] kkVarArr = this.c;
        kk kkVar = kkVarArr[i];
        if (kkVar != null) {
            kkVar.a = j;
            kkVar.b = f;
        } else {
            kk kkVar2 = new kk();
            kkVar2.a = j;
            kkVar2.b = f;
            kkVarArr[i] = kkVar2;
        }
    }

    public final float b(float f) {
        float[] fArr;
        float[] fArr2;
        float f2;
        nz0 nz0Var;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            cy.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.d;
        kk[] kkVarArr = this.c;
        kk kkVar = kkVarArr[i2];
        if (kkVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            kk kkVar2 = kkVar;
            while (true) {
                kk kkVar3 = kkVarArr[i2];
                nz0 nz0Var2 = this.a;
                fArr = this.e;
                fArr2 = this.f;
                if (kkVar3 != null) {
                    long j = kkVar.a;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = kkVar3.a;
                    float f6 = j - j2;
                    i = 1;
                    float abs = Math.abs(j2 - kkVar2.a);
                    nz0Var = nz0Var2;
                    kk kkVar4 = nz0Var != nz0.d ? kkVar : kkVar3;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = kkVar3.b;
                    fArr2[i3] = -f6;
                    if (i4 == 0) {
                        i4 = 20;
                    }
                    int i5 = i4 - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    kkVar2 = kkVar4;
                    i2 = i5;
                    f5 = f2;
                } else {
                    f2 = f5;
                    nz0Var = nz0Var2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.b) {
                int ordinal = nz0Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.g;
                        ch0.k(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        g8.c();
                        return f2;
                    }
                    int i6 = i3 - i;
                    float f7 = fArr2[i6];
                    int i7 = i6;
                    float f8 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f9 = fArr2[i8];
                        if (f7 != f9) {
                            float f10 = (fArr[i7] - fArr[i8]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i7 == i6) {
                                f8 *= 0.5f;
                            }
                        }
                        i7--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }
}
