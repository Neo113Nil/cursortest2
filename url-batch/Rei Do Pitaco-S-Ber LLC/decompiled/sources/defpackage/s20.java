package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class s20 implements Cloneable {
    public /* synthetic */ int[] f;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public s20() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f = new int[i4];
        this.g = new Object[i4];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.h;
        if (i2 != 0 && i <= this.f[i2 - 1]) {
            b(i, colorStateList);
            return;
        }
        if (i2 >= this.f.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.f = Arrays.copyOf(this.f, i6);
            this.g = Arrays.copyOf(this.g, i6);
        }
        this.f[i2] = i;
        this.g[i2] = colorStateList;
        this.h = i2 + 1;
    }

    public final void b(int i, Object obj) {
        int d = oo.d(this.h, i, this.f);
        if (d >= 0) {
            this.g[d] = obj;
            return;
        }
        int i2 = ~d;
        int i3 = this.h;
        if (i2 < i3) {
            Object[] objArr = this.g;
            if (objArr[i2] == vv.g) {
                this.f[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.f = Arrays.copyOf(this.f, i7);
            this.g = Arrays.copyOf(this.g, i7);
        }
        int i8 = this.h;
        if (i8 - i2 != 0) {
            int[] iArr = this.f;
            int i9 = i2 + 1;
            o6.m0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.g;
            o6.o0(objArr2, objArr2, i9, i2, this.h);
        }
        this.f[i2] = i;
        this.g[i2] = obj;
        this.h++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        s20 s20Var = (s20) clone;
        s20Var.f = (int[]) this.f.clone();
        s20Var.g = (Object[]) this.g.clone();
        return s20Var;
    }

    public final String toString() {
        int i = this.h;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f[i3]);
            sb.append('=');
            Object obj = this.g[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
