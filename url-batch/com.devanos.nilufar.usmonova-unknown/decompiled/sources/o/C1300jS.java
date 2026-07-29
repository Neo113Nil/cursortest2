package o;

import java.util.Map;

/* renamed from: o.jS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300jS implements Map.Entry, Comparable {
    public final Comparable h;
    public Object i;
    public final /* synthetic */ C1104gS j;

    public C1300jS(C1104gS c1104gS, Comparable comparable, Object obj) {
        this.j = c1104gS;
        this.h = comparable;
        this.i = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.h.compareTo(((C1300jS) obj).h);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.h;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.i;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.h;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.i;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.j.b();
        Object obj2 = this.i;
        this.i = obj;
        return obj2;
    }

    public final String toString() {
        return this.h + "=" + this.i;
    }
}
