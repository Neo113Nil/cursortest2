package o;

import java.util.Map;

/* renamed from: o.zB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2338zB implements Map.Entry, InterfaceC1594nw {
    public final Object h;
    public final Object i;

    public C2338zB(Object obj, Object obj2) {
        this.h = obj;
        this.i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC0048Bt.h(entry.getKey(), this.h) && AbstractC0048Bt.h(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.h;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
