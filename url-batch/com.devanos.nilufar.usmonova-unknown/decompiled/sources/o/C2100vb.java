package o;

import java.lang.reflect.Method;

/* renamed from: o.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2100vb {
    public final int a;
    public final Method b;

    public C2100vb(Method method, int i) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2100vb)) {
            return false;
        }
        C2100vb c2100vb = (C2100vb) obj;
        return this.a == c2100vb.a && this.b.getName().equals(c2100vb.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
