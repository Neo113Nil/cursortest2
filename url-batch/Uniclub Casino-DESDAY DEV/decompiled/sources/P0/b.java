package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f618a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f619b;

    public b(Object obj, Object obj2) {
        this.f618a = obj;
        this.f619b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return X0.d.a(this.f618a, bVar.f618a) && X0.d.a(this.f619b, bVar.f619b);
    }

    public final int hashCode() {
        Object obj = this.f618a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f619b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f618a + ", " + this.f619b + ')';
    }
}
