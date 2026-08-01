package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class um0 implements u10, Serializable {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(um0.class, Object.class, "e");
    public volatile bu d;
    public volatile Object e;

    @Override // defpackage.u10
    public final Object getValue() {
        Object obj = this.e;
        b2 b2Var = b2.N;
        if (obj != b2Var) {
            return obj;
        }
        bu buVar = this.d;
        if (buVar != null) {
            Object a = buVar.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b2Var, a)) {
                if (atomicReferenceFieldUpdater.get(this) != b2Var) {
                }
            }
            this.d = null;
            return a;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != b2.N ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
