package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289f extends C0294k {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3313c = AtomicIntegerFieldUpdater.newUpdater(C0289f.class, "_resumed");
    private volatile int _resumed;

    public C0289f(C0288e c0288e, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
