package o1;

/* renamed from: o1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3325a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.l f3326b;

    public C0295l(Object obj, f1.l lVar) {
        this.f3325a = obj;
        this.f3326b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0295l)) {
            return false;
        }
        C0295l c0295l = (C0295l) obj;
        return g1.f.a(this.f3325a, c0295l.f3325a) && g1.f.a(this.f3326b, c0295l.f3326b);
    }

    public final int hashCode() {
        Object obj = this.f3325a;
        return this.f3326b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f3325a + ", onCancellation=" + this.f3326b + ')';
    }
}
