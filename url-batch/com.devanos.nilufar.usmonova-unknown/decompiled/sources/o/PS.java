package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class PS implements Cloneable {
    public /* synthetic */ int[] h;
    public /* synthetic */ Object[] i;
    public /* synthetic */ int j;

    public PS(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.h = new int[i5];
        this.i = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.j;
        if (i2 != 0 && i <= this.h[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (i2 >= this.h.length) {
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
            int[] copyOf = Arrays.copyOf(this.h, i6);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.i, i6);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.i = copyOf2;
        }
        this.h[i2] = i;
        this.i[i2] = obj;
        this.j = i2 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final PS clone() {
        Object clone = super.clone();
        AbstractC0048Bt.l(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        PS ps = (PS) clone;
        ps.h = (int[]) this.h.clone();
        ps.i = (Object[]) this.i.clone();
        return ps;
    }

    public final Object c(int i) {
        Object obj;
        int h = AbstractC1473m3.h(this.j, i, this.h);
        if (h < 0 || (obj = this.i[h]) == EB.v) {
            return null;
        }
        return obj;
    }

    public final void d(int i, Object obj) {
        int h = AbstractC1473m3.h(this.j, i, this.h);
        if (h >= 0) {
            this.i[h] = obj;
            return;
        }
        int i2 = ~h;
        int i3 = this.j;
        if (i2 < i3) {
            Object[] objArr = this.i;
            if (objArr[i2] == EB.v) {
                this.h[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.h.length) {
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
            int[] copyOf = Arrays.copyOf(this.h, i7);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.i, i7);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.i = copyOf2;
        }
        int i8 = this.j;
        if (i8 - i2 != 0) {
            int[] iArr = this.h;
            int i9 = i2 + 1;
            P6.a0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.i;
            P6.b0(objArr2, objArr2, i9, i2, this.j);
        }
        this.h[i2] = i;
        this.i[i2] = obj;
        this.j++;
    }

    public final String toString() {
        int i = this.j;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.h[i3]);
            sb.append('=');
            Object obj = this.i[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "buffer.toString()");
        return sb2;
    }
}
