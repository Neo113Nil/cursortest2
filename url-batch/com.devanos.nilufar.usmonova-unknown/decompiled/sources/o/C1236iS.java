package o;

import java.util.Map;

/* renamed from: o.iS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236iS implements Comparable, Map.Entry {
    public final Comparable h;
    public Object i;
    public final /* synthetic */ C1038fS j;

    public C1236iS(C1038fS c1038fS, Comparable comparable, Object obj) {
        this.j = c1038fS;
        this.h = comparable;
        this.i = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.h.compareTo(((C1236iS) obj).h);
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
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
