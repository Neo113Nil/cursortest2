package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mi0 extends nq0 {
    public final List m;
    public final long n;
    public final float o;

    public mi0(List list, long j, float f) {
        this.m = list;
        this.n = j;
        this.o = f;
    }

    @Override // defpackage.nq0
    public final Shader Y(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.n;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long l = rg0.l(j);
            intBitsToFloat = Float.intBitsToFloat((int) (l >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (l & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.o;
        if (f == Float.POSITIVE_INFINITY) {
            f = fr0.d(j) / 2.0f;
        }
        float f2 = f;
        List list = this.m;
        px0.X(list);
        int t = px0.t(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, px0.J(list, t), px0.K(list, t), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi0)) {
            return false;
        }
        mi0 mi0Var = (mi0) obj;
        return this.m.equals(mi0Var.m) && ra0.b(this.n, mi0Var.n) && this.o == mi0Var.o;
    }

    public final int hashCode() {
        return y6.t(this.o, (ra0.f(this.n) + (this.m.hashCode() * 961)) * 31, 31);
    }

    public final String toString() {
        String str;
        long j = this.n;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) ra0.j(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.o;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.m + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
