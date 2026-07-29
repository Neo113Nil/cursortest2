package o;

/* renamed from: o.ly, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464ly implements Comparable {
    public static final C1464ly l = new C1464ly(2, 2, 20);
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public C1464ly(int i, int i2, int i3) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.k = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1464ly c1464ly = (C1464ly) obj;
        AbstractC0048Bt.n(c1464ly, "other");
        return this.k - c1464ly.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1464ly c1464ly = obj instanceof C1464ly ? (C1464ly) obj : null;
        return c1464ly != null && this.k == c1464ly.k;
    }

    public final int hashCode() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append('.');
        sb.append(this.i);
        sb.append('.');
        sb.append(this.j);
        return sb.toString();
    }
}
