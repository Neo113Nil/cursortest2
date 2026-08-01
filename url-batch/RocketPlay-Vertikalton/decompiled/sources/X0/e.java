package X0;

import j1.InterfaceC0183a;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Map.Entry, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final f f1301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1302b;

    public e(f fVar, int i) {
        i1.f.e(fVar, "map");
        this.f1301a = fVar;
        this.f1302b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (i1.f.a(entry.getKey(), getKey()) && i1.f.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1301a.f1304a[this.f1302b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f1301a.f1305b;
        i1.f.b(objArr);
        return objArr[this.f1302b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        f fVar = this.f1301a;
        fVar.c();
        Object[] objArr = fVar.f1305b;
        if (objArr == null) {
            int length = fVar.f1304a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f1305b = objArr;
        }
        int i = this.f1302b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
