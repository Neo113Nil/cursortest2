package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f863a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f864b;

    public d(Object obj, Object obj2) {
        this.f863a = obj;
        this.f864b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g1.f.a(this.f863a, dVar.f863a) && g1.f.a(this.f864b, dVar.f864b);
    }

    public final int hashCode() {
        Object obj = this.f863a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f864b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f863a + ", " + this.f864b + ')';
    }
}
