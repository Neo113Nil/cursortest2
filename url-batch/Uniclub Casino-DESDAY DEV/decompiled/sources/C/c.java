package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f53e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f54a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f54a = i;
        this.f55b = i2;
        this.f56c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f54a, cVar2.f54a), Math.max(cVar.f55b, cVar2.f55b), Math.max(cVar.f56c, cVar2.f56c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f53e : new c(i, i2, i3, i4);
    }

    public static c c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return b.a(this.f54a, this.f55b, this.f56c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f54a == cVar.f54a && this.f56c == cVar.f56c && this.f55b == cVar.f55b;
    }

    public final int hashCode() {
        return (((((this.f54a * 31) + this.f55b) * 31) + this.f56c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f54a + ", top=" + this.f55b + ", right=" + this.f56c + ", bottom=" + this.d + '}';
    }
}
