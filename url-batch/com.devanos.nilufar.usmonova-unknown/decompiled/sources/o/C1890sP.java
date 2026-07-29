package o;

import java.util.Map;

/* renamed from: o.sP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1890sP implements Map.Entry {
    public final Object h;
    public final Object i;
    public C1890sP j;
    public C1890sP k;

    public C1890sP(Object obj, Object obj2) {
        this.h = obj;
        this.i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1890sP)) {
            return false;
        }
        C1890sP c1890sP = (C1890sP) obj;
        return this.h.equals(c1890sP.h) && this.i.equals(c1890sP.i);
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
        return this.h.hashCode() ^ this.i.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.h + "=" + this.i;
    }
}
