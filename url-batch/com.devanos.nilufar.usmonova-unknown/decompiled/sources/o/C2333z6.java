package o;

import java.util.Arrays;

/* renamed from: o.z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2333z6 {
    public static float[] s;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    /* renamed from: o, reason: collision with root package name */
    public final float f253o;
    public final float p;
    public final boolean q;
    public final boolean r;

    public C2333z6(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        float f8;
        float f9 = f3;
        this.a = f;
        this.b = f2;
        this.c = f9;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        float f10 = f5 - f9;
        float f11 = f6 - f4;
        float f12 = 0.0f;
        boolean z2 = true;
        boolean z3 = i == 1 || (i == 4 ? f11 > 0.0f : !(i != 5 || f11 >= 0.0f));
        this.q = z3;
        float f13 = f2 - f;
        float f14 = 1 / f13;
        this.k = f14;
        boolean z4 = 3 == i;
        if (z4 || Math.abs(f10) < 0.001f || Math.abs(f11) < 0.001f) {
            float hypot = (float) Math.hypot(f11, f10);
            this.g = hypot;
            this.p = hypot * f14;
            this.n = f10 / f13;
            this.f253o = f11 / f13;
            this.j = new float[101];
            this.l = Float.NaN;
            this.m = Float.NaN;
            z = true;
        } else {
            float[] fArr = new float[101];
            this.j = fArr;
            this.l = (z3 ? -1 : 1) * f10;
            this.m = f11 * (z3 ? 1 : -1);
            this.n = z3 ? f5 : f9;
            this.f253o = z3 ? f4 : f6;
            float f15 = f4 - f6;
            int length = C1623oL.j().length;
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            int i2 = 0;
            while (i2 < length) {
                boolean z5 = z2;
                float f19 = f18;
                double radians = (float) Math.toRadians((i2 * 90.0d) / (C1623oL.j().length - 1));
                float sin = ((float) Math.sin(radians)) * f10;
                float cos = ((float) Math.cos(radians)) * f15;
                if (i2 > 0) {
                    float f20 = f12;
                    double d = sin - f17;
                    float f21 = cos - f19;
                    f7 = f20;
                    f8 = sin;
                    f16 += (float) Math.hypot(d, f21);
                    C1623oL.j()[i2] = f16;
                } else {
                    f7 = f12;
                    f8 = sin;
                }
                i2++;
                f17 = f8;
                f12 = f7;
                f18 = cos;
                z2 = z5;
            }
            float f22 = f12;
            this.g = f16;
            int length2 = C1623oL.j().length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] j = C1623oL.j();
                j[i3] = j[i3] / f16;
            }
            for (int i4 = 0; i4 < 101; i4++) {
                float f23 = i4 / 100;
                float[] j2 = C1623oL.j();
                int binarySearch = Arrays.binarySearch(j2, 0, j2.length, f23);
                if (binarySearch >= 0) {
                    fArr[i4] = binarySearch / (C1623oL.j().length - 1);
                } else if (binarySearch == -1) {
                    fArr[i4] = f22;
                } else {
                    int i5 = -binarySearch;
                    int i6 = i5 - 2;
                    fArr[i4] = (((f23 - C1623oL.j()[i6]) / (C1623oL.j()[i5 - 1] - C1623oL.j()[i6])) + i6) / (C1623oL.j().length - 1);
                }
            }
            this.p = this.g * this.k;
            z = z4;
        }
        this.r = z;
    }

    public final float a() {
        float f = this.l * this.i;
        float hypot = this.p / ((float) Math.hypot(f, (-this.m) * this.h));
        return this.q ? (-f) * hypot : f * hypot;
    }

    public final float b() {
        float f = this.l * this.i;
        float f2 = (-this.m) * this.h;
        float hypot = this.p / ((float) Math.hypot(f, f2));
        return this.q ? (-f2) * hypot : f2 * hypot;
    }

    public final void c(float f) {
        float f2 = (this.q ? this.b - f : f - this.a) * this.k;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float[] fArr = this.j;
                float length = f2 * (fArr.length - 1);
                int i = (int) length;
                float f4 = fArr[i];
                f3 = ((fArr[i + 1] - f4) * (length - i)) + f4;
            }
        }
        double d = f3 * 1.5707964f;
        this.h = (float) Math.sin(d);
        this.i = (float) Math.cos(d);
    }
}
