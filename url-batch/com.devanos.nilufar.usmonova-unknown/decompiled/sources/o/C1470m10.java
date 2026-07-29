package o;

import java.util.List;

/* renamed from: o.m10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1470m10 {
    public final Object a;

    public C1470m10(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1470m10.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((C1470m10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return AbstractC0720ac.t0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
