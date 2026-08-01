package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rm0 implements Map.Entry {
    public final Object d;
    public final p20 e;
    public rm0 f;
    public rm0 g;

    public rm0(n20 n20Var, p20 p20Var) {
        this.d = n20Var;
        this.e = p20Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rm0) {
            rm0 rm0Var = (rm0) obj;
            return this.d.equals(rm0Var.d) && this.e == rm0Var.e;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.e.hashCode() ^ this.d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.d + "=" + this.e;
    }
}
