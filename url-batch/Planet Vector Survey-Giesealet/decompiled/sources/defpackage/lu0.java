package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lu0 implements u10, Serializable {
    public bu d;
    public volatile Object e;
    public final Object f;

    public lu0(bu buVar) {
        buVar.getClass();
        this.d = buVar;
        this.e = b2.N;
        this.f = this;
    }

    @Override // defpackage.u10
    public final Object getValue() {
        Object obj;
        Object obj2 = this.e;
        b2 b2Var = b2.N;
        if (obj2 != b2Var) {
            return obj2;
        }
        synchronized (this.f) {
            obj = this.e;
            if (obj == b2Var) {
                bu buVar = this.d;
                buVar.getClass();
                obj = buVar.a();
                this.e = obj;
                this.d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.e != b2.N ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
