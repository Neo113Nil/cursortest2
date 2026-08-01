package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qy0 implements u10, Serializable {
    public bu d;
    public Object e;

    @Override // defpackage.u10
    public final Object getValue() {
        if (this.e == b2.N) {
            bu buVar = this.d;
            buVar.getClass();
            this.e = buVar.a();
            this.d = null;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != b2.N ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
