package o;

/* loaded from: classes.dex */
public final class X3 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public X3(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i > i2) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X3)) {
            return false;
        }
        X3 x3 = (X3) obj;
        return AbstractC0048Bt.h(this.a, x3.a) && this.b == x3.b && this.c == x3.c && AbstractC0048Bt.h(this.d, x3.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + ((Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return AbstractC2188wx.h(sb, this.d, ')');
    }
}
