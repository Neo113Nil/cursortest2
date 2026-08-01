package q1;

/* renamed from: q1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3904a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.l f3905b;

    public C0345k(Object obj, h1.l lVar) {
        this.f3904a = obj;
        this.f3905b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0345k)) {
            return false;
        }
        C0345k c0345k = (C0345k) obj;
        return i1.f.a(this.f3904a, c0345k.f3904a) && i1.f.a(this.f3905b, c0345k.f3905b);
    }

    public final int hashCode() {
        Object obj = this.f3904a;
        return this.f3905b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f3904a + ", onCancellation=" + this.f3905b + ')';
    }
}
