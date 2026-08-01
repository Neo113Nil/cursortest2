package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wz extends c00 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(wz.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final ss h;

    public wz(ss ssVar) {
        this.h = ssVar;
    }

    @Override // defpackage.c00
    public final boolean k() {
        return true;
    }

    @Override // defpackage.c00
    public final void l(Throwable th) {
        if (i.compareAndSet(this, 0, 1)) {
            this.h.c(th);
        }
    }
}
