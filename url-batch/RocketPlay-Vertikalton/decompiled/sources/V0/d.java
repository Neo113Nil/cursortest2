package V0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1243a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1244b;

    public d(Object obj, Object obj2) {
        this.f1243a = obj;
        this.f1244b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i1.f.a(this.f1243a, dVar.f1243a) && i1.f.a(this.f1244b, dVar.f1244b);
    }

    public final int hashCode() {
        Object obj = this.f1243a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1244b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1243a + ", " + this.f1244b + ')';
    }
}
