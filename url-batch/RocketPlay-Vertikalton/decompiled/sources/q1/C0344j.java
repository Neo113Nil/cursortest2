package q1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: q1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0344j {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3902b = AtomicIntegerFieldUpdater.newUpdater(C0344j.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3903a;

    public C0344j(Throwable th, boolean z2) {
        this.f3903a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3903a + ']';
    }
}
