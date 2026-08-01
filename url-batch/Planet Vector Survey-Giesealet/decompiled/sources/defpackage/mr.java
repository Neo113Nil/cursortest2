package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mr implements lr {
    public final float a;
    public final ss0 b;

    public mr(float f, float f2) {
        this.a = f2;
        ss0 ss0Var = new ss0();
        ss0Var.a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        ss0Var.b = sqrt;
        ss0Var.c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            g8.r("Spring stiffness constant must be positive.");
            throw null;
        }
        ss0Var.b = Math.sqrt(f);
        ss0Var.c = false;
        this.b = ss0Var;
    }

    @Override // defpackage.c7
    public final jz0 a(j3 j3Var) {
        return new k2((lr) this);
    }

    @Override // defpackage.lr
    public final long b(float f, float f2, float f3) {
        double d;
        double d2;
        int i;
        long j;
        double d3 = this.b.b;
        float f4 = this.a;
        float f5 = (f - f2) / f4;
        double d4 = (float) (d3 * d3);
        double d5 = f3 / f4;
        double d6 = f5;
        double sqrt = Math.sqrt(d4) * 2.0d;
        double d7 = (sqrt * sqrt) - (d4 * 4.0d);
        double d8 = -sqrt;
        lf lfVar = d7 < 0.0d ? new lf(0.0d, Math.sqrt(Math.abs(d7))) : new lf(Math.sqrt(d7), 0.0d);
        lfVar.a = (lfVar.a + d8) * 0.5d;
        lfVar.b *= 0.5d;
        lf lfVar2 = d7 < 0.0d ? new lf(0.0d, Math.sqrt(Math.abs(d7))) : new lf(Math.sqrt(d7), 0.0d);
        double d9 = lfVar2.a * (-1.0d);
        double d10 = lfVar2.b * (-1.0d);
        lfVar2.a = (d9 + d8) * 0.5d;
        lfVar2.b = d10 * 0.5d;
        if (d6 == 0.0d && d5 == 0.0d) {
            j = 0;
        } else {
            if (d6 < 0.0d) {
                d5 = -d5;
            }
            double abs = Math.abs(d6);
            double d11 = lfVar.a;
            double d12 = d11 * abs;
            double d13 = d5 - d12;
            double log = Math.log(Math.abs(1.0d / abs)) / d11;
            double log2 = Math.log(Math.abs(1.0d / d13));
            double d14 = log2;
            for (int i2 = 0; i2 < 6; i2++) {
                d14 = log2 - Math.log(Math.abs(d14 / d11));
            }
            double d15 = d14 / d11;
            if (Double.isInfinite(log) || Double.isNaN(log)) {
                log = d15;
            } else if (!Double.isInfinite(d15) && !Double.isNaN(d15)) {
                log = Math.max(log, d15);
            }
            double d16 = (-(d12 + d13)) / (d11 * d13);
            double d17 = d11 * d16;
            double exp = (Math.exp(d17) * d13 * d16) + (Math.exp(d17) * abs);
            if (!Double.isNaN(d16) && d16 > 0.0d) {
                if (d16 <= 0.0d || (-exp) >= 1.0d) {
                    log = (-(2.0d / d11)) - (abs / d13);
                    d = 1.0d;
                    d2 = Double.MAX_VALUE;
                    i = 0;
                    while (d2 > 0.001d && i < 100) {
                        i++;
                        double d18 = d11 * log;
                        double exp2 = log - (((Math.exp(d18) * ((d13 * log) + abs)) + d) / (Math.exp(d18) * (((d18 + 1.0d) * d13) + d12)));
                        d2 = Math.abs(log - exp2);
                        log = exp2;
                    }
                    j = (long) (log * 1000.0d);
                } else if (d13 < 0.0d && abs > 0.0d) {
                    log = 0.0d;
                }
            }
            d = -1.0d;
            d2 = Double.MAX_VALUE;
            i = 0;
            while (d2 > 0.001d) {
                i++;
                double d182 = d11 * log;
                double exp22 = log - (((Math.exp(d182) * ((d13 * log) + abs)) + d) / (Math.exp(d182) * (((d182 + 1.0d) * d13) + d12)));
                d2 = Math.abs(log - exp22);
                log = exp22;
            }
            j = (long) (log * 1000.0d);
        }
        return j * 1000000;
    }

    @Override // defpackage.lr
    public final float c(float f, float f2, float f3, long j) {
        ss0 ss0Var = this.b;
        ss0Var.a = f2;
        return Float.intBitsToFloat((int) (ss0Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.lr
    public final float d(float f, float f2, float f3, long j) {
        ss0 ss0Var = this.b;
        ss0Var.a = f2;
        return Float.intBitsToFloat((int) (ss0Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.lr
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }
}
