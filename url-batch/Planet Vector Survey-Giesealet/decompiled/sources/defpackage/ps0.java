package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ps0 implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ int[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public ps0() {
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
        this.e = new int[i4];
        this.f = new Object[i4];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ps0 clone() {
        Object clone = super.clone();
        clone.getClass();
        ps0 ps0Var = (ps0) clone;
        ps0Var.e = (int[]) this.e.clone();
        ps0Var.f = (Object[]) this.f.clone();
        return ps0Var;
    }

    public final Object b(int i) {
        Object obj;
        int o = nz.o(this.e, this.g, i);
        if (o < 0 || (obj = this.f[o]) == x40.m) {
            return null;
        }
        return obj;
    }

    public final int c(int i) {
        if (this.d) {
            x40.m(this);
        }
        return this.e[i];
    }

    public final void d(int i, Object obj) {
        int o = nz.o(this.e, this.g, i);
        if (o >= 0) {
            this.f[o] = obj;
            return;
        }
        int i2 = ~o;
        int i3 = this.g;
        if (i2 < i3) {
            Object[] objArr = this.f;
            if (objArr[i2] == x40.m) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.d && i3 >= this.e.length) {
            x40.m(this);
            i2 = ~nz.o(this.e, this.g, i);
        }
        int i4 = this.g;
        if (i4 >= this.e.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.e = Arrays.copyOf(this.e, i8);
            this.f = Arrays.copyOf(this.f, i8);
        }
        int i9 = this.g;
        if (i9 - i2 != 0) {
            int[] iArr = this.e;
            int i10 = i2 + 1;
            p8.R(iArr, iArr, i10, i2, i9);
            Object[] objArr2 = this.f;
            p8.T(objArr2, objArr2, i10, i2, this.g);
        }
        this.e[i2] = i;
        this.f[i2] = obj;
        this.g++;
    }

    public final int e() {
        if (this.d) {
            x40.m(this);
        }
        return this.g;
    }

    public final Object f(int i) {
        if (this.d) {
            x40.m(this);
        }
        Object[] objArr = this.f;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
