package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q40 implements Map.Entry, j00 {
    public final s40 d;
    public final int e;
    public final int f;

    public q40(s40 s40Var, int i) {
        s40Var.getClass();
        this.d = s40Var;
        this.e = i;
        this.f = s40Var.k;
    }

    public final void a() {
        if (this.d.k != this.f) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return nz.l(entry.getKey(), getKey()) && nz.l(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.d.d[this.e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.d.e;
        objArr.getClass();
        return objArr[this.e];
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
        a();
        s40 s40Var = this.d;
        s40Var.b();
        Object[] objArr = s40Var.e;
        if (objArr == null) {
            int length = s40Var.d.length;
            if (length < 0) {
                g8.r("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            s40Var.e = objArr;
        }
        int i = this.e;
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
