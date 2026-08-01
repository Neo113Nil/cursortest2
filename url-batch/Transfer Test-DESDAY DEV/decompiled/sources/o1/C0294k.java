package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0294k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3323b = AtomicIntegerFieldUpdater.newUpdater(C0294k.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3324a;

    public C0294k(Throwable th, boolean z2) {
        this.f3324a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3324a + ']';
    }
}
