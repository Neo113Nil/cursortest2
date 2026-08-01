package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ft0 extends g0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.g0
    public final boolean a(f0 f0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(nk.p);
        return true;
    }

    @Override // defpackage.g0
    public final kj[] b(f0 f0Var) {
        this.a.set(null);
        return x40.a;
    }
}
