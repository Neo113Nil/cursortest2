package o;

import java.util.Iterator;

/* renamed from: o.ft, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1065ft implements Iterable, InterfaceC1594nw {
    public final int h;
    public final int i;
    public final int j;

    public C1065ft(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.h = i;
        this.i = AbstractC0048Bt.I(i, i2, i3);
        this.j = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1065ft)) {
            return false;
        }
        if (isEmpty() && ((C1065ft) obj).isEmpty()) {
            return true;
        }
        C1065ft c1065ft = (C1065ft) obj;
        return this.h == c1065ft.h && this.i == c1065ft.i && this.j == c1065ft.j;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.h * 31) + this.i) * 31) + this.j;
    }

    public boolean isEmpty() {
        int i = this.j;
        int i2 = this.i;
        int i3 = this.h;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1131gt(this.h, this.i, this.j);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.i;
        int i2 = this.h;
        int i3 = this.j;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
