package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ko implements Iterable, vo {
    public final int f;
    public final int g;
    public final int h;

    public ko(int i, int i2, int i3) {
        if (i3 == 0) {
            l8.l("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            l8.l("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f = i;
        this.g = oo.r(i, i2, i3);
        this.h = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ko)) {
            return false;
        }
        if (isEmpty() && ((ko) obj).isEmpty()) {
            return true;
        }
        ko koVar = (ko) obj;
        return this.f == koVar.f && this.g == koVar.g && this.h == koVar.h;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f * 31) + this.g) * 31) + this.h;
    }

    public boolean isEmpty() {
        int i = this.g;
        int i2 = this.h;
        int i3 = this.f;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lo(this.f, this.g, this.h);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.g;
        int i2 = this.h;
        int i3 = this.f;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
