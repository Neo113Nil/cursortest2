package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class v00 implements zu, Serializable {
    public final int d;

    public v00(int i) {
        this.d = i;
    }

    @Override // defpackage.zu
    public final int getArity() {
        return this.d;
    }

    public final String toString() {
        hj0.a.getClass();
        return ij0.a(this);
    }
}
