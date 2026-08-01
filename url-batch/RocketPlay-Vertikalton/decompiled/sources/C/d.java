package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f231e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f233b;

    /* renamed from: c, reason: collision with root package name */
    public final int f234c;
    public final int d;

    public d(int i, int i2, int i3, int i4) {
        this.f232a = i;
        this.f233b = i2;
        this.f234c = i3;
        this.d = i4;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f232a, dVar2.f232a), Math.max(dVar.f233b, dVar2.f233b), Math.max(dVar.f234c, dVar2.f234c), Math.max(dVar.d, dVar2.d));
    }

    public static d b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f231e : new d(i, i2, i3, i4);
    }

    public static d c(Insets insets) {
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
        return c.a(this.f232a, this.f233b, this.f234c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.f232a == dVar.f232a && this.f234c == dVar.f234c && this.f233b == dVar.f233b;
    }

    public final int hashCode() {
        return (((((this.f232a * 31) + this.f233b) * 31) + this.f234c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f232a + ", top=" + this.f233b + ", right=" + this.f234c + ", bottom=" + this.d + '}';
    }
}
