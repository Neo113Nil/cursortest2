package m1;

import c1.AbstractC0104b;
import j1.InterfaceC0183a;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3558b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3559c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3557a = i;
        this.f3558b = AbstractC0104b.p(i, i2, i3);
        this.f3559c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f3557a != aVar.f3557a || this.f3558b != aVar.f3558b || this.f3559c != aVar.f3559c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3557a * 31) + this.f3558b) * 31) + this.f3559c;
    }

    public boolean isEmpty() {
        int i = this.f3559c;
        int i2 = this.f3558b;
        int i3 = this.f3557a;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3557a, this.f3558b, this.f3559c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f3558b;
        int i2 = this.f3557a;
        int i3 = this.f3559c;
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
