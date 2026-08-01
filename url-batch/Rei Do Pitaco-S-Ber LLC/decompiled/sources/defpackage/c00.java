package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c00 implements Serializable {
    public final Throwable f;

    public c00(Throwable th) {
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c00) {
            return this.f.equals(((c00) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
