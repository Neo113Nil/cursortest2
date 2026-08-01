package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ia0 extends m implements zz {
    public static final ia0 e = new ia0(b2.C);

    @Override // defpackage.zz
    public final boolean b() {
        return true;
    }

    @Override // defpackage.zz
    public final bn g(boolean z, boolean z2, ss ssVar) {
        return ja0.d;
    }

    @Override // defpackage.zz
    public final id h(g00 g00Var) {
        return ja0.d;
    }

    @Override // defpackage.zz
    public final CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.zz
    public final bn q(mu muVar) {
        return ja0.d;
    }

    @Override // defpackage.zz
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.zz
    public final Object u(lj ljVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.zz
    public final void a(CancellationException cancellationException) {
    }
}
