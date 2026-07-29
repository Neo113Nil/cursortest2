package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class HD {
    public Object[] a = new Object[16];
    public int b;

    public HD(int i) {
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HD) {
            HD hd = (HD) obj;
            int i = hd.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = hd.a;
                C1197ht c0 = AbstractC1807r8.c0(0, i2);
                int i3 = c0.h;
                int i4 = c0.i;
                if (i3 > i4) {
                    return true;
                }
                while (AbstractC0048Bt.h(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        C1400l c1400l = new C1400l(28, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) c1400l.invoke(obj));
            i2++;
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
